package com.zklx.domain;

public class ComShort {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_SHORT.CID
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_SHORT.INTRODUCITON
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    private byte[] introduciton;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_SHORT.CID
     *
     * @return the value of COM_SHORT.CID
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_SHORT.CID
     *
     * @param cid the value for COM_SHORT.CID
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_SHORT.INTRODUCITON
     *
     * @return the value of COM_SHORT.INTRODUCITON
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    public byte[] getIntroduciton() {
        return introduciton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_SHORT.INTRODUCITON
     *
     * @param introduciton the value for COM_SHORT.INTRODUCITON
     *
     * @mbg.generated Wed Aug 01 09:32:02 CST 2018
     */
    public void setIntroduciton(byte[] introduciton) {
        this.introduciton = introduciton;
    }
}