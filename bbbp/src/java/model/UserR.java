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
public class UserR {
     private String NAME;
            private String ADDRESS; 
            private String GENDER;
                    private String EMAILID;
                   
                            private String PASSWORD;
                            private int AGE;
                                   private int CONTACTNO;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getEMAILID() {
        return EMAILID;
    }

    public void setEMAILID(String EMAILID) {
        this.EMAILID = EMAILID;
    }


    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public int getCONTACTNO() {
        return CONTACTNO;
    }

    public void setCONTACTNO(int CONTACTNO) {
        this.CONTACTNO = CONTACTNO;
    }


public static UserR populateData(HttpServletRequest request, HttpServletResponse response)
    {
        UserR n =new UserR();
        n.setCONTACTNO(Integer.parseInt(request.getParameter("CONTACTNO")));
          n.setADDRESS(request.getParameter("ADDRESS"));
n.setNAME(request.getParameter("NAME"));
n.setGENDER(request.getParameter("GENDER"));
n.setEMAILID(request.getParameter("EMAILID"));
n.setPASSWORD(request.getParameter("PASSWORD"));
n.setAGE(Integer.parseInt(request.getParameter("AGE")));


          return n;
    }

}
