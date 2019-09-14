package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/14 上午8:51
 */
public class CountryInfo {
    private Long id;
    private String countryBn;
    private String countryName;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCountryBn() {
        return countryBn;
    }

    public void setCountryBn(String countryBn) {
        this.countryBn = countryBn;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
