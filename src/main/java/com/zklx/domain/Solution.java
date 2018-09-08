package com.zklx.domain;

import java.util.Date;

public class Solution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.LID
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private String lid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.TITLE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.WEBSITE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private String website;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.CHANGE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private Date changeTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.CREATE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SOLUTION.SCONTEXT
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    private byte[] scontext;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.LID
     *
     * @return the value of SOLUTION.LID
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public String getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.LID
     *
     * @param lid the value for SOLUTION.LID
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setLid(String lid) {
        this.lid = lid == null ? null : lid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.TITLE
     *
     * @return the value of SOLUTION.TITLE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.TITLE
     *
     * @param title the value for SOLUTION.TITLE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.WEBSITE
     *
     * @return the value of SOLUTION.WEBSITE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.WEBSITE
     *
     * @param website the value for SOLUTION.WEBSITE
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.CHANGE_TIME
     *
     * @return the value of SOLUTION.CHANGE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public Date getChangeTime() {
        return changeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.CHANGE_TIME
     *
     * @param changeTime the value for SOLUTION.CHANGE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.CREATE_TIME
     *
     * @return the value of SOLUTION.CREATE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.CREATE_TIME
     *
     * @param createTime the value for SOLUTION.CREATE_TIME
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SOLUTION.SCONTEXT
     *
     * @return the value of SOLUTION.SCONTEXT
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public byte[] getScontext() {
        return scontext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SOLUTION.SCONTEXT
     *
     * @param scontext the value for SOLUTION.SCONTEXT
     *
     * @mbg.generated Wed Aug 08 16:29:07 CST 2018
     */
    public void setScontext(byte[] scontext) {
        this.scontext = scontext;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "id:"+getLid()+" getTitle"+getTitle()+" getWebsite"+getWebsite()+" getScontext"+getScontext()+" getCreateTime"+getCreateTime()+" getChangeTime"+getChangeTime();
    }
}