package com.zklx.domain;

import java.util.Date;

public class ComNews {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_NEWS.CID
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_NEWS.TITLE
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_NEWS.NEWSTIME
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    private Date newstime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_NEWS.CID
     *
     * @return the value of COM_NEWS.CID
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_NEWS.CID
     *
     * @param cid the value for COM_NEWS.CID
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_NEWS.TITLE
     *
     * @return the value of COM_NEWS.TITLE
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_NEWS.TITLE
     *
     * @param title the value for COM_NEWS.TITLE
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_NEWS.NEWSTIME
     *
     * @return the value of COM_NEWS.NEWSTIME
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public Date getNewstime() {
        return newstime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_NEWS.NEWSTIME
     *
     * @param newstime the value for COM_NEWS.NEWSTIME
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }
}