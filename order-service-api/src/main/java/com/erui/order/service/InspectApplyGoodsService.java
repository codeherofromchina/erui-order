package com.erui.order.service;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
import com.erui.order.common.pojo.InspectReportGoodsInfo;

import java.util.List;

public interface InspectApplyGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param inspectApplyId
     * @param inspectApplyGoodsInfos
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long inspectApplyId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos) throws Exception;

    /**
     * 插入信息
     *
     * @param inspectApplyId
     * @param inspectApplyGoodsInfos
     * @return
     */
    int insert(Long inspectApplyId, List<InspectApplyGoodsInfo> inspectApplyGoodsInfos);

    int insert(Long inspectApplyId, InspectApplyGoodsInfo inspectApplyGoodsInfo);

    void delete(Long... ids);

    int updateById(Long id, InspectApplyGoodsInfo InspectApplyGoodsInfo) throws Exception;

    List<InspectApplyGoodsInfo> listByInspectApplyId(Long inspectApplyId);


    List<InspectApplyGoodsInfo> listByInpsectReportId(Long inspectReportId);



    /**
     * 根据报检单更新商品信息
     *
     * @param inspectReportId
     * @param inspectReportGoodsInfos
     */
    void updateByInspectReportId(Long inspectReportId, List<InspectReportGoodsInfo> inspectReportGoodsInfos) throws Exception;



    /**
     * 通过主键查询
     * @param id
     * @return
     */
    InspectApplyGoodsInfo findById(Long id);
}

