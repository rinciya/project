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
public class Ngo {
    private String noo;
   private String address;
      private String acti;
      private int phno;

    private String email;
    private String password;
    private int ngoid;
    private String state;
    private String district;
    private int regno;

    public int getNgoid() {
        return ngoid;
    }

    public void setNgoid(int ngoid) {
        this.ngoid = ngoid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getNoo() {
        return noo;
    }

    public void setNoo(String noo) {
        this.noo = noo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getActi() {
        return acti;
    }

    public void setActi(String acti) {
        this.acti = acti;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
public static Ngo populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Ngo n =new Ngo();
        n.setNgoid(Integer.parseInt(request.getParameter("ngoid")));
          n.setState(request.getParameter("state"));
n.setDistrict(request.getParameter("district"));
n.setRegno(Integer.parseInt(request.getParameter("regno")));
n.setNoo(request.getParameter("noo"));
n.setEmail(request.getParameter("email"));
n.setPassword(request.getParameter("password"));
n.setPhno(Integer.parseInt(request.getParameter("phno")));
n.setAddress(request.getParameter("address"));
n.setActi(request.getParameter("acti"));

          return n;
    }

  
}
   
