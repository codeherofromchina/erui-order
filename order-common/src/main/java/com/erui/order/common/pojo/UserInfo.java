package com.erui.order.common.pojo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 上午10:58
 */
public class UserInfo {
    private Long id;
    private String userNo;
    private String userName;
    private String groupName;


    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
