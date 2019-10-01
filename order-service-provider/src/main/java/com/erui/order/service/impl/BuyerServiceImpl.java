package com.erui.order.service.impl;

import com.erui.order.common.pojo.BuyerInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.request.BuyerListQueryRequest;
import com.erui.order.mapper.BuyerMapper;
import com.erui.order.model.entity.Buyer;
import com.erui.order.model.entity.BuyerExample;
import com.erui.order.model.entity.Order;
import com.erui.order.service.AreaService;
import com.erui.order.service.BuyerService;
import com.erui.order.service.CountryService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/14 上午2:06
 */
@Service
@Transactional
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
    @Autowired
    private AreaService areaService;
    @Autowired
    private CountryService countryService;


    @Override
    public Pager<BuyerInfo> list(BuyerListQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        BuyerExample example = new BuyerExample();
        example.setOrderByClause("id desc");
        BuyerExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(queryRequest.getBuyerCode())) {
            criteria.andBuyerCodeLike("%" + queryRequest.getBuyerCode() + "%");
        }
        List<Buyer> buyers = buyerMapper.selectByExample(example);

        List<BuyerInfo> buyerInfoList = new ArrayList<>();
        for (Buyer buyer : buyers) {
            BuyerInfo buyerInfo = new BuyerInfo();
            buyerInfo.setId(buyer.getId());
            buyerInfo.setBuyerNo(buyer.getBuyerNo());
            buyerInfo.setBuyerCode(buyer.getBuyerCode());
            buyerInfo.setAreaBn(buyer.getAreaBn());
            buyerInfo.setAreaName(areaService.findAreaNameByBn(buyer.getAreaBn()));
            buyerInfo.setCountryBn(buyer.getCountryBn());
            buyerInfo.setCountryName(countryService.findCountryNameByBn(buyer.getCountryBn()));
            buyerInfoList.add(buyerInfo);
        }

        // 输出
        Page<Buyer> page = (Page) buyers;
        Pager<BuyerInfo> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), buyerInfoList);
        return pager;
    }


    @Override
    public String findBuyerCodeById(Long buyerId) {
        Buyer buyer = buyerMapper.selectByPrimaryKey(buyerId);
        if (buyer != null) {
            return buyer.getBuyerCode();
        }
        return null;
    }
}
