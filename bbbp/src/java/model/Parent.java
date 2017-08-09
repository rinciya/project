/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rinciya
 */
public class Parent {
    private int mage,fage;
    private int mno,tno;
     private int mm,mf;
    private String male,female;
    private String reason;
    private String address;
    private String pm,pf;
    private String email;
  private String ngoname,girlname;

    public String getNgoname() {
        return ngoname;
    }

    public void setNgoname(String ngoname) {
        this.ngoname = ngoname;
    }

    public String getGirlname() {
        return girlname;
    }

    public void setGirlname(String girlname) {
        this.girlname = girlname;
    }
   
    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }
    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }
    
    public String getAddress() {
        return address;
    }  
    public void setAddress(String address) {
        this.address = address;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }


 public int getMage() {
        return mage;
    }

    public void setMage(int mage) {
        this.mage = mage;
    }
    public int getFage() {
        return fage;
    }

    public void setFage(int fage) {
        this.fage = fage;
    }
 public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }
 public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;}
   
    public int getMm(){
       return  mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }
    public String getMprofession() {
        return pm;
    }

    public void setMprofession(String pm) {
        this.pm = pm;
    }
     public int getFm() {
        return mf;
    }

    public void setFm(int mf) {
        this.mf= mf;
    }
    public String getFprofession() {
        return pf;
    }

    public void setFprofession(String pf) {
        this.pf = pf;
    }
    
   
    
    public static Adopt populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Adopt u =new Adopt();
           
           u.setMale(request.getParameter("maleapp"));
           u.setMage(Integer.parseInt(request.getParameter("mage")));
           u.setFemale(request.getParameter("femaleapp"));
           u.setFage(Integer.parseInt(request.getParameter("fage")));
           u.setAddress(request.getParameter("address"));
           u.setEmail(request.getParameter("email"));
           u.setTno(Integer.parseInt(request.getParameter("tno")));
           u.setMno(Integer.parseInt(request.getParameter("mno")));
           u.setMprofession(request.getParameter("pm"));
           u.setMm(Integer.parseInt(request.getParameter("mm")));
           u.setFprofession(request.getParameter("pf"));
           u.setFm(Integer.parseInt(request.getParameter("mf")));
           u.setGirlname(request.getParameter("girlname"));
           u.setNgoname(request.getParameter("ngoname"));
           u.setReason(request.getParameter("reason"));
           return u;
    }
    
}
