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
public class EventRegister {
    private String vname;
    private String vemail;
    private int vmno;
    private String ngoname;
    private String campaign;

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVemail() {
        return vemail;
    }

    public void setVemail(String vemail) {
        this.vemail = vemail;
    }

    public int getVmno() {
        return vmno;
    }

    public void setVmno(int vmno) {
        this.vmno = vmno;
    }

    public String getNgoname() {
        return ngoname;
    }

    public void setNgoname(String ngoname) {
        this.ngoname = ngoname;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }
    
     public static EventRegister populateData(HttpServletRequest request, HttpServletResponse response)
    {
        EventRegister f =new EventRegister();
        f.setVname(request.getParameter("vname"));
        f.setVemail(request.getParameter("vemail"));
        f.setVmno(Integer.parseInt(request.getParameter("vmno")));
        f.setCampaign(request.getParameter("campaign"));
         f.setNgoname(request.getParameter("ngoname"));     
   return f;
    }

}