package com.erui.order.service.impl;

import com.erui.order.service.PurchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.PurchMapper;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class PurchServiceImpl implements PurchService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchServiceImpl.class);
    @Autowired
    private PurchMapper PurchMapper;

}
