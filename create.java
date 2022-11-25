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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 91789
 */
public class create extends HttpServlet {

   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String phnnumber = request.getParameter("username");
        String pass = request.getParameter("pass");
        PrintWriter out = response.getWriter();
        
        Connection con = null;
        PreparedStatement st = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db18","root","root");
            System.out.println("Connected");
            
          
            
            st = con.prepareStatement("update user set password = ('"+pass+"') where phone_number = ('"+phnnumber+"')");
           
            int i = st.executeUpdate();
            
            if(i>0)
            {
                System.out.println(i+" Record Updated");
                response.sendRedirect("pwdupdate.jsp");
            }
            else
            {
                System.out.println("Record Updation Failed...");
            }
            con.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }

  }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
    resp.sendRedirect("index.jsp");}

   
}
