/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
public class success extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String username = null;
      String bal;
      String phn;
        PrintWriter out = response.getWriter();
        HttpSession session= request.getSession(true);
        session.setAttribute("phone", username);
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
         System.out.println("welcome to success");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * FROM user where phone_number="+username+"";
            System.out.println("query execute");
            rs = st.executeQuery(sql);
            System.out.println("he");
           while(rs.next())
            {
            
                if(rs.getString(3).equals(username))
                {
            
                bal = rs.getString(8);
             
              session.setAttribute("bala", bal);
             response.sendRedirect("home.jsp");
                }
            }
        
}
         catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }}