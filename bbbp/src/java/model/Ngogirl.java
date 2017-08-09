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
public class Ngogirl {
private String gname;
private int gage;
private String pursuing;
private String about;
private String noo;

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

    public String getPursuing() {
        return pursuing;
    }

    public void setPursuing(String pursuing) {
        this.pursuing = pursuing;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getNoo() {
        return noo;
    }

    public void setNoo(String noo) {
        this.noo = noo;
    }
public static Ngogirl populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Ngogirl f =new Ngogirl();
        f.setGname(request.getParameter("gname"));
        f.setNoo(request.getParameter("noo"));
        f.setGage(Integer.parseInt(request.getParameter("gage")));
        f.setPursuing(request.getParameter("pursuing"));
        f.setAbout(request.getParameter("about"));      
   return f;
    }
}
