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
public class GirlsDetails {
    private String ngoname;
    private String gname;
    private int gage;
    private String persuring;
    private String about;

    public String getNgoname() {
        return ngoname;
    }

    public void setNgoname(String ngoname) {
        this.ngoname = ngoname;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getGage() {
        return gage;
    }

    public void setGage(int gage) {
        this.gage = gage;
    }

    public String getPersuring() {
        return persuring;
    }

    public void setPersuring(String persuring) {
        this.persuring = persuring;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    public static GirlsDetails populateData(HttpServletRequest request, HttpServletResponse response)
    {
        GirlsDetails g =new GirlsDetails();
           g.setNgoname(request.getParameter("ngoname"));
           g.setGname(request.getParameter("gname"));
           g.setGage(Integer.parseInt(request.getParameter("gage")));
           g.setPersuring(request.getParameter("persuring"));
           g.setAbout(request.getParameter("about"));
           return g;
    }
     
    
}
