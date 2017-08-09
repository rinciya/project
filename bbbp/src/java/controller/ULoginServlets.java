/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserR;
import model.UserRMasterDAO;



/**
 *
 * @author Rinciya
 */
public class ULoginServlets extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
            UserR u = new UserR();
            System.out.println("HEY");
             UserRMasterDAO udao = new UserRMasterDAO();
             boolean b;
            u.setEMAILID(request.getParameter("EMAILID"));
            u.setPASSWORD(request.getParameter("PASSWORD"));
             RequestDispatcher rd;
            b = udao.checkLogin(u);
            if(b)
            {
                request.setAttribute("user",u);
                
                rd = request.getRequestDispatcher("/JSP/user.jsp");
                rd.forward(request, response);
            }                
            else
            {
                //request.setAttribute("errorMessage", "Wrong credidentilas");
                //RequestDispatcher view=request.getRequestDispatcher("/bbbp/JSP/login_user.jsp");
                //view.forward(request, response);
               
                out.println("<b>Invalid Login Info.</b><br>");
			rd = request.getRequestDispatcher("JSP/login_user.jsp");
			rd.include(request, response);
                 //rd.forward(request, response);
                
                    
            }         
            out.close();   
        }

    
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

		
		



