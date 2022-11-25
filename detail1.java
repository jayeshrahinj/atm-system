/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91789
 */
public class detail1 extends HttpServlet {
      
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("index.jsp");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
               String acc= request.getParameter("acc");
           String bal = request.getParameter("bal");
                HttpSession session= request.getSession(true);
   
           String username=(String)session.getAttribute("phn");
           
        {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
          
           if(acc.equals("") && bal.equals("")  )
           {
           out.println(" please enter all detail");
           } 
           else
           {
               System.out.println("nnn");
                  st = con.prepareStatement("Insert into user (account_no,balance) values(?,?) where phone_number=?");
            st.setString(3,username);
                  st.setString(1,acc);
           st.setString(2,bal);
            
             
            int i = st.executeUpdate();
            System.out.println("jjj");
            if(i>0)
                {
                    System.out.println(i + "record inserted");
                    response.sendRedirect("index.jsp");
                } 
            else
            {
                    System.out.println("record inserted failed...");
                }
                con.close();
            } 
        }
           catch (ClassNotFoundException e) 
                {
                    System.out.println(e);
                }
           catch (SQLException e) 
                {
                    System.out.println(e);
                }
        }
    }

}



