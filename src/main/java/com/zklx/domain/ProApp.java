package com.zklx.domain;

import java.util.Date;

public class ProApp {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_APP.AID
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    private String aid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_APP.TITLE
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_APP.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_APP.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    private byte[] introduciton;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_APP.AID
     *
     * @return the value of PRO_APP.AID
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public String getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_APP.AID
     *
     * @param aid the value for PRO_APP.AID
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_APP.TITLE
     *
     * @return the value of PRO_APP.TITLE
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_APP.TITLE
     *
     * @param title the value for PRO_APP.TITLE
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_APP.CREATE_TIME
     *
     * @return the value of PRO_APP.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_APP.CREATE_TIME
     *
     * @param createTime the value for PRO_APP.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_APP.INTRODUCITON
     *
     * @return the value of PRO_APP.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public byte[] getIntroduciton() {
        return introduciton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_APP.INTRODUCITON
     *
     * @param introduciton the value for PRO_APP.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:24:36 CST 2018
     */
    public void setIntroduciton(byte[] introduciton) {
        this.introduciton = introduciton;
    }
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "aid:"+getAid()+" Title："+getTitle()+" getIntroduciton:"+getIntroduciton();
    }
}