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
public class Feedback {
    
    private String feedback;  

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
    
    
    public static Feedback populateData(HttpServletRequest request, HttpServletResponse response)
    {
        Feedback f=new Feedback();
         f.setFeedback(request.getParameter("feedback"));
         return f;
    }
    
}
