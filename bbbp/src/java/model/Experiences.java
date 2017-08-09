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
public class Experiences {
    private String name;
   
    private String email;
    private String comments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
     public static Experiences populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Experiences e =new Experiences();
        
           e.setName(request.getParameter("name"));
         
           e.setComments(request.getParameter("comments"));
           
           e.setEmail(request.getParameter("email"));
           return e;
    }
     
}
