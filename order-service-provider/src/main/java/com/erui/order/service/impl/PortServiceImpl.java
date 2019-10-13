package com.erui.order.service.impl;

import com.erui.order.common.pojo.OrgInfo;
import com.erui.order.common.pojo.PortInfo;
import com.erui.order.common.pojo.request.PortListQueryRequest;
import com.erui.order.mapper.PortMapper;
import com.erui.order.model.entity.Org;
import com.erui.order.model.entity.OrgExample;
import com.erui.order.model.entity.Port;
import com.erui.order.model.entity.PortExample;
import com.erui.order.service.CountryService;
import com.erui.order.service.PortService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:25
 */
@Service
@Transactional
public class PortServiceImpl implements PortService {
    @Autowired
    private PortMapper portMapper;
    @Autowired
    private CountryService countryService;

    @Override
    public String findPortNameByBn(String portBn) {
        if (StringUtils.isBlank(portBn)) {
            return null;
        }
        Port port = findByBn(portBn);
        if (port != null) {
            return port.getPortName();
        }
        return null;
    }


    public Port findByBn(String portBn) {
        PortExample example = new PortExample();
        example.createCriteria().andBnEqualTo(portBn).andDeletedFlagEqualTo("N")
                .andLangEqualTo("zh");

        List<Port> ports = portMapper.selectByExample(example);
        if (ports != null && ports.size() > 0) {
            return ports.get(0);
        }
        return null;
    }


    @Override
    public List<PortInfo> listAll(PortListQueryRequest queryRequest) {
        List<PortInfo> portInfoList = new ArrayList<>();
        PortExample example = new PortExample();
        PortExample.Criteria criteria = example.createCriteria().andDeletedFlagEqualTo("N").andLangEqualTo("zh");

        if (StringUtils.isNotBlank(queryRequest.getPortName())) {
            criteria.andPortNameLike("%" + queryRequest.getPortName() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getTransMode())) {
            criteria.andTransModeEqualTo(queryRequest.getTransMode());
        }

        List<Port> ports = portMapper.selectByExample(example);
        for (Port port : ports) {
            PortInfo portInfo = new PortInfo();
            portInfo.setId(port.getId());
            portInfo.setBn(port.getBn());
            portInfo.setCountryBn(port.getCountryBn());
            portInfo.setCountryName(countryService.findCountryNameByBn(port.getCountryBn()));
            portInfo.setLang(port.getLang());
            portInfo.setPortName(port.getPortName());
            portInfo.setTransMode(port.getTransMode());

            portInfoList.add(portInfo);
        }
        return portInfoList;

    }
}
