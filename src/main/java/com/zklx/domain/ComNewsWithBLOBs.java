package com.zklx.domain;

public class ComNewsWithBLOBs extends ComNews {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_NEWS.INTRODUCITON
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    private byte[] introduciton;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COM_NEWS.MYPHOTO
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    private byte[] myphoto;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_NEWS.INTRODUCITON
     *
     * @return the value of COM_NEWS.INTRODUCITON
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public byte[] getIntroduciton() {
        return introduciton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_NEWS.INTRODUCITON
     *
     * @param introduciton the value for COM_NEWS.INTRODUCITON
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public void setIntroduciton(byte[] introduciton) {
        this.introduciton = introduciton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COM_NEWS.MYPHOTO
     *
     * @return the value of COM_NEWS.MYPHOTO
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public byte[] getMyphoto() {
        return myphoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COM_NEWS.MYPHOTO
     *
     * @param myphoto the value for COM_NEWS.MYPHOTO
     *
     * @mbg.generated Sat Aug 25 15:19:54 CST 2018
     */
    public void setMyphoto(byte[] myphoto) {
        this.myphoto = myphoto;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "getCid"+getCid()+"  getTitle"+getTitle()+"  getIntroduciton"+getIntroduciton()+" getNewstime"+getNewstime();
    }
}