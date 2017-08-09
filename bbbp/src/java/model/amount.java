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
public class amount {
    private int fund;
    private String ngoname;
    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public String getNgoname() {
        return ngoname;
    }

    public void setNgoname(String ngoname) {
        this.ngoname = ngoname;
    }
public static amount populateData(HttpServletRequest request, HttpServletResponse response)
    {
    amount a=new amount();
    a.setFund(Integer.parseInt(request.getParameter("vmno")));
           a.setNgoname(request.getParameter("vemail"));
           return a;
}
}
