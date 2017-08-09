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
 * @author universe
 */
public class Customer {
    private int vage;
    private int vmno;
    private String vname;
    private String vpassword;
    private String vaddress;
    private String vgender;
    private String vemail;

   
    public String getName() {
        return vname;
    }

    public void setName(String vname) {
        this.vname = vname;
    }
       public String getPassword() {
        return vpassword;
    }

    public void setPassword(String vpassword) {
        this.vpassword = vpassword;
    }

    public String getAddress() {
        return vaddress;
    }  
    public void setAddress(String vaddress) {
        this.vaddress = vaddress;
    }

    public String getGender() {
        return vgender;
    }

    public void setGender(String vgender) {
        this.vgender = vgender;
    }


 public int getAge() {
        return vage;
    }

    public void setAge(int vage) {
        this.vage = vage;
    }
 public int getMno() {
        return vmno;
    }

    public void setMno(int vmno) {
        this.vmno = vmno;
    }

    public String getEmail() {
        return vemail;
    }

    public void setEmail(String vemail) {
        this.vemail = vemail;
    }
    
    public static Customer populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Customer c =new Customer();
           
           c.setName(request.getParameter("vname"));
           c.setPassword(request.getParameter("vpassword"));
           c.setAddress(request.getParameter("vaddress"));
           c.setGender(request.getParameter("vgender"));
           c.setAge(Integer.parseInt(request.getParameter("vage")));
           c.setMno(Integer.parseInt(request.getParameter("vmno")));
           c.setEmail(request.getParameter("vemail"));
           return c;
    }
}
