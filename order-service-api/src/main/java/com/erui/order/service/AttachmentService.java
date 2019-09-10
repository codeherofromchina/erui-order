package com.erui.order.service;

import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.pojo.AttachmentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午9:50
 */
public interface AttachmentService {

    /**
     * 附件内容的插入操作
     *
     * @param targetObj       业务对象
     * @param targetObjId     业务ID
     * @param attachmentInfos
     * @return
     */
    int insert(AttachmentTargetObjEnum targetObj, Long targetObjId, List<AttachmentInfo> attachmentInfos);

    int insert(AttachmentTargetObjEnum targetObj, Long targetObjId, AttachmentInfo attachmentInfo);

    /**
     * 插入附件操作
     * 重复ID时更新
     *
     * @param targetObj
     * @param targetObjId
     * @param attachmentInfos
     * @return
     * @throws Exception
     */

    int insertOnDuplicateIdUpdate(AttachmentTargetObjEnum targetObj, Long targetObjId, List<AttachmentInfo> attachmentInfos) throws Exception;


    /**
     * 更新附件内容
     *
     * @param id
     * @param attachmentInfo
     * @return
     * @throws Exception
     */
    int updateById(Long id, AttachmentInfo attachmentInfo) throws Exception;

    /**
     * 删除附件
     *
     * @param ids
     */
    void delete(Long... ids);

    List<AttachmentInfo> list(AttachmentTargetObjEnum targetObj, Long targetObjId);
}
