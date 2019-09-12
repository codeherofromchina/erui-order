package com.erui.order.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class StringUtil {

    // 生成易瑞销售合同
    public static String genContractNo(String oldContractNo) {
        if (StringUtils.isNotBlank(oldContractNo) && oldContractNo.contains("-") && oldContractNo.length() > 13) {
            oldContractNo = oldContractNo.substring(0, 13);
        }
        String prefix = "YRX" + DateFormatUtils.format(new Date(), "yyyyMMdd");
        String beginNumStr = "01";
        if (StringUtils.isNotBlank(oldContractNo) && oldContractNo.length() == 13 &&
                (oldContractNo.substring(0, 11).compareTo(prefix) >= 0)) {
            String seq = oldContractNo.substring(3);
            long seqLong = Long.parseLong(seq);
            seqLong += 1;
            // 末尾从0001开始 TODO 月份可能提前跑到13，产品确认一天易瑞类100%不会超过99单
            if (seqLong % 100 == 0) {
                seqLong += 1;
            }
            return "YRX" + String.valueOf(seqLong);
        }
        return prefix + beginNumStr;
    }

}