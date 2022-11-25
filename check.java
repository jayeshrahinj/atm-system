/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 91789
 */
public class check extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hettttt");
             PrintWriter out = response.getWriter();

          out.println("<html>");
            out.println("<head>");
            out.println("<title>wrong password</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
            out.println("<td><center><h1>otp is </h1></center></td>");
            out.println("<FORM Action=create METHOD=post>");
            out.println("enter phone number:<INPUT TYPE=TEXT NAME=username><br>");
               out.println("create new password:<INPUT TYPE=TEXT NAME=pass><br>");
         out.println("<INPUT TYPE=SUBMIT VALUE=submit>");
            out.println("</FORM>");
            out.println("</body>");
            out.println("</html>");
       
    }

}
