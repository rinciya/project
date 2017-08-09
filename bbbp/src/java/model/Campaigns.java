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
 * @author Rajasi
 */
public class Campaigns {
  
    private String ngoname;
    private String ngocontact;
    private String ngoemail;
    private String campaign;

    public String getName() {
        return ngoname;
    }

    public void setName(String name) {
        this.ngoname=name;
    }

    public String getContact() {
        return ngocontact;
    }

    public void setContact(String contact) {
        this.ngocontact = contact;
    }

    public String getEmail() {
        return ngoemail;
    }

    public void setEmail(String email) {
        this.ngoemail = email;
    }
     public String getCampaigns() {
        return campaign;
    }

    public void setCampaigns(String campaigns) {
        this.campaign = campaigns;
    }
     public static Campaigns populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Campaigns e =new Campaigns();
        
           e.setName(request.getParameter("ngoname"));
           e.setContact(request.getParameter("ngocontact"));
           e.setCampaigns(request.getParameter("campaign"));
           e.setEmail(request.getParameter("ngoemail"));
           return e;
    }
     
             
        
        
    }
    
    
    
     
     




