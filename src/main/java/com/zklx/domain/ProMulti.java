package com.zklx.domain;

import java.util.Date;

public class ProMulti {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_MULTI.MID
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    private String mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_MULTI.TITLE
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_MULTI.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_MULTI.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    private byte[] introduciton;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_MULTI.MID
     *
     * @return the value of PRO_MULTI.MID
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public String getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_MULTI.MID
     *
     * @param mid the value for PRO_MULTI.MID
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_MULTI.TITLE
     *
     * @return the value of PRO_MULTI.TITLE
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_MULTI.TITLE
     *
     * @param title the value for PRO_MULTI.TITLE
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_MULTI.CREATE_TIME
     *
     * @return the value of PRO_MULTI.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_MULTI.CREATE_TIME
     *
     * @param createTime the value for PRO_MULTI.CREATE_TIME
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_MULTI.INTRODUCITON
     *
     * @return the value of PRO_MULTI.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public byte[] getIntroduciton() {
        return introduciton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_MULTI.INTRODUCITON
     *
     * @param introduciton the value for PRO_MULTI.INTRODUCITON
     *
     * @mbg.generated Mon Jul 23 11:01:19 CST 2018
     */
    public void setIntroduciton(byte[] introduciton) {
        this.introduciton = introduciton;
    }
}