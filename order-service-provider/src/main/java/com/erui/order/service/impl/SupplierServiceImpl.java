package com.erui.order.service.impl;

import com.erui.order.common.enums.SupplierTypeEnum;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.SupplierInfo;
import com.erui.order.common.pojo.request.SupplierListQueryRequest;
import com.erui.order.mapper.SupplierMapper;
import com.erui.order.model.entity.Supplier;
import com.erui.order.model.entity.SupplierExample;
import com.erui.order.service.SupplierService;
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
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public Pager<SupplierInfo> list(SupplierListQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        SupplierExample example = new SupplierExample();
        SupplierExample.Criteria criteria = example.createCriteria();
        criteria.andDeletedFlagEqualTo("N").andStatusEqualTo("APPROVED");

        if (StringUtils.isNotBlank(queryRequest.getSupplierNo())) {
            criteria.andSupplierNoLike("%" + queryRequest.getSupplierNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getSupplierName())) {
            criteria.andNameLike("%" + queryRequest.getSupplierName() + "%");
        }
        SupplierTypeEnum supplierTypeEnum = SupplierTypeEnum.fromCode(queryRequest.getSupplierType());
        if (supplierTypeEnum != null) {
            criteria.andSupplierTypeEqualTo(supplierTypeEnum.getCode());
        }
        List<Supplier> suppliers = supplierMapper.selectByExample(example);

        List<SupplierInfo> supplierInfos = new ArrayList<>();
        for (Supplier supplier : suppliers) {
            SupplierInfo supplierInfo = new SupplierInfo();
            supplierInfo.setId(supplier.getId());
            supplierInfo.setSupplierNo(supplier.getSupplierNo());
            supplierInfo.setSupplierName(supplier.getName());
            supplierInfo.setSupplierType(supplier.getSupplierType());
            SupplierTypeEnum supplierTypeEnumInner = SupplierTypeEnum.fromCode(supplier.getSupplierType());
            if (supplierTypeEnumInner != null) {
                supplierInfo.setSupplierTypeName(supplierTypeEnumInner.getName());
            }
            supplierInfos.add(supplierInfo);
        }

        // 输出
        Page<Supplier> page = (Page) suppliers;
        Pager<SupplierInfo> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), supplierInfos);
        return pager;
    }
}
