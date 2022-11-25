/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class withdraw extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("welcome to withdraw servlet");
        String f = null; 
        PrintWriter out = response.getWriter();
    
        int fund =Integer.parseInt(request.getParameter("fund"));
      
        HttpSession session= request.getSession(true);
         
        String phone=(String)session.getAttribute("phone");
          
      
        int bal=Integer.parseInt((String) session.getAttribute("balance"));
         
      //if(bal>=fund)
     // {
        int sum = bal-fund;
          System.out.println("withdraw amount"+fund);
        f = Integer.toString(sum);
          System.out.println(f);
    //  }
     // else if(bal< fund)
      //{
         // out.println("insuffcient balance");
     // }
       
          Connection con = null;
          Statement st = null;
        //PreparedStatement st = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded");
            System.out.println(f);
            System.out.println(phone);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
          String sql = "update user set balance="+f+" where phone_number="+phone+"";
          st = con.createStatement();     
          /*   
              
          st.setString(1, f);
          st.setString(2,phone);*/
             System.out.println(sql);
           
                  int i = st.executeUpdate(sql);
                  System.out.println(sql);
            System.out.println("jjj");
              
    
            if (i>0)
                {
                    System.out.println( "record inserted");
                   response.sendRedirect("home.jsp");
       
                } 
            else
            {
                    System.out.println("record inserted failed...");
                }
                con.close();
             
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

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 response.sendRedirect("index.jsp");
        }

 
}
