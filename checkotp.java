/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 91789
 */
public class checkotp extends HttpServlet {

   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        

            Random r = new Random();

            int num = r.nextInt(9999);

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>wrong password</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
            out.println("<td><center><h1>captcha is </h1></center></td>" + num);
            out.println("<FORM Action=check METHOD=POST>");
            out.println("enter otp here:<INPUT TYPE=TEXT NAME=username><br>");
            out.println("<INPUT TYPE=SUBMIT VALUE=submit>");
            out.println("</FORM>");
            out.println("</body>");
            out.println("</html>");
        } 
       
    }


