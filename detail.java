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
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91789
 */
public class detail extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("index.jsp");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
               String fname= request.getParameter("firstname");
           String lname = request.getParameter("lastname");
           String phnnumber=request.getParameter("phonenumber");
           String voter = request.getParameter("voter");
           String add=request.getParameter("address");
           String pass= request.getParameter("pass");
          String acc= request.getParameter("acc");
          String bal= request.getParameter("bal");
         
          
        {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
          
           if(fname.equals("") && lname.equals("") && phnnumber.equals("") && add.equals("") && pass.equals(""))
           {
           out.println(" please enter all detail");
           } 
           else
           {
                  st = con.prepareStatement("Insert into user  values(?,?,?,?,?,?,?,?)");
            
                  st.setString(1,fname);
           st.setString(2,lname);
            st.setString(3,phnnumber);
            st.setString(4,voter);
            st.setString(5,add);
            st.setString(6,pass);
             st.setString(7,acc);
            st.setString(8,bal);
            
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

