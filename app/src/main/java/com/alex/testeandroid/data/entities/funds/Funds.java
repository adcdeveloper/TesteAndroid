package com.alex.testeandroid.data.entities.funds;

import java.util.List;

/**
 * Created by Alex on 28/08/18.
 */
public class Funds {

    //region FIELDS
    private String title;
    private String fundName;
    private String whatIs;
    private String definition;
    private String riskTitle;
    private int risk;
    private String infoTitle;
    private MoreInfo moreInfo;
    private List<Info> info;
    private List<Info> downInfo;
    //endregion

    //region PROPERTIES
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getRiskTitle() {
        return riskTitle;
    }

    public void setRiskTitle(String riskTitle) {
        this.riskTitle = riskTitle;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public String getInfoTitle() {
        return infoTitle;
    }

    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    public MoreInfo getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(MoreInfo moreInfo) {
        this.moreInfo = moreInfo;
    }

    public List<Info> getInfo() {
        return info;
    }

    public void setInfo(List<Info> info) {
        this.info = info;
    }

    public List<Info> getDownInfo() {
        return downInfo;
    }

    public void setDownInfo(List<Info> downInfo) {
        this.downInfo = downInfo;
    }
    //endregion
}
