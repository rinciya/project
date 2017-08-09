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
 * @author PAVILION
 */
public class Fund {
    private String email;
     private String ngoname;

    public String getNgoname() {
        return ngoname;
    }

    public void setNgoname(String ngoname) {
        this.ngoname = ngoname;
    }
    private String name;
    private int phno;
    private int amt;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

        public static Fund populateDData(HttpServletRequest request, HttpServletResponse response)
    {
        Fund f =new Fund();
        f.setName(request.getParameter("name"));
        f.setEmail(request.getParameter("email"));
        f.setPhno(Integer.parseInt(request.getParameter("phno")));
        f.setAmt(Integer.parseInt(request.getParameter("amt")));
        f.setNgoname(request.getParameter("ngoname"));      
   return f;
    }
}

