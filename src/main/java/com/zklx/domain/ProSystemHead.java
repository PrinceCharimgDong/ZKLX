package com.zklx.domain;

public class ProSystemHead {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_SYSTEM_HEAD.SID
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_SYSTEM_HEAD.TITLE
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PRO_SYSTEM_HEAD.PNAME
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    private String pname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_SYSTEM_HEAD.SID
     *
     * @return the value of PRO_SYSTEM_HEAD.SID
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_SYSTEM_HEAD.SID
     *
     * @param sid the value for PRO_SYSTEM_HEAD.SID
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_SYSTEM_HEAD.TITLE
     *
     * @return the value of PRO_SYSTEM_HEAD.TITLE
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_SYSTEM_HEAD.TITLE
     *
     * @param title the value for PRO_SYSTEM_HEAD.TITLE
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PRO_SYSTEM_HEAD.PNAME
     *
     * @return the value of PRO_SYSTEM_HEAD.PNAME
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PRO_SYSTEM_HEAD.PNAME
     *
     * @param pname the value for PRO_SYSTEM_HEAD.PNAME
     *
     * @mbg.generated Thu Jul 12 14:54:18 CST 2018
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }
}