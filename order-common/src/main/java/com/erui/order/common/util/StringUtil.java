package com.erui.order.common.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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


    // 生成商品SKU
    public static String genSKU(String meteType, String lastSku) {
        String prefix = meteType + "D";
        int beginNum = 1;
        int flagIndex = -1;
        if (StringUtils.isNotBlank(lastSku) && (flagIndex = lastSku.indexOf("D")) != -1) {
            String seqStr = lastSku.substring(flagIndex);
            if (StringUtils.isNumeric(seqStr)) {
                beginNum = Integer.parseInt(seqStr);
            }
            beginNum++;
        }
        return prefix + FORMAT_NINE_ZERO.format(beginNum);
    }

    /**
     * 生成出口通知单号
     *
     * @param lastDeliverConsignNo
     * @return
     */
    public static String genDeliverConsignNo(String lastDeliverConsignNo) {
        // CKFH2019100001
        String prefix = "CKFH" + DateFormatUtils.format(new Date(), "yyyyMM");
        int beginNum = 1;
        if (StringUtils.isNotBlank(lastDeliverConsignNo) && lastDeliverConsignNo.length() >= 10 &&
                (lastDeliverConsignNo.substring(0, 10).equals(prefix))) {
            String seq = lastDeliverConsignNo.substring(10);
            if (StringUtils.isNumeric(seq)) {
                beginNum = Integer.parseInt(seq);
            }
            beginNum++;
        }
        return prefix + FORMAT_FOUR_ZERO.format(beginNum);
    }

    /**
     * 生成出库单号
     *
     * @param lastDeliverDetailNo
     * @return
     */
    public static String genDeliverDetailNo(String lastDeliverDetailNo) {
        // 20190001
        String prefix = DateFormatUtils.format(new Date(), "yyyy");
        int beginNum = 1;
        if (StringUtils.isNotBlank(lastDeliverDetailNo) && lastDeliverDetailNo.length() >= 4 &&
                (lastDeliverDetailNo.substring(0, 4).equals(prefix))) {
            String seq = lastDeliverDetailNo.substring(4);
            if (StringUtils.isNumeric(seq)) {
                beginNum = Integer.parseInt(seq);
            }
            beginNum++;
        }
        return prefix + FORMAT_FOUR_ZERO.format(beginNum);
    }

    /**
     * 生成采购合同号
     *
     * @param lastPurchContractNo et. YRC201900218
     * @return
     */
    public static String genPurchContractNo(String lastPurchContractNo) {
        String prefix = "YRC" + DateFormatUtils.format(new Date(), "yyyy");
        int beginNum = 1;
        if (StringUtils.isNotBlank(lastPurchContractNo) && lastPurchContractNo.length() >= 8 &&
                (lastPurchContractNo.substring(0, 8).equals(prefix))) {
            String seq = lastPurchContractNo.substring(8);
            if (StringUtils.isNumeric(seq)) {
                beginNum = Integer.parseInt(seq);
            }
            beginNum++;
        }
        return prefix + FORMAT_FOUR_FIVE.format(beginNum);
    }


    public static final NumberFormat FORMAT_FOUR_ZERO = new DecimalFormat("0000");
    public static final NumberFormat FORMAT_FOUR_FIVE = new DecimalFormat("00000");
    public static final NumberFormat FORMAT_NINE_ZERO = new DecimalFormat("000000000");


}