/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
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
public class balance extends HttpServlet {

  
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("balance");
         HttpSession session= request.getSession(true);
      
       
        String username = request.getParameter("username");
             String user=(String)session.getAttribute("phone");
          out.println("phone");
    
           Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * from acc where phone_number=7898295105";
            System.out.println("query execute");
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String a = rs.getString(2);
                String b = rs.getString(3);
                System.out.println(a);
               if (username.equals(b))
               {
                 out.println("<html>");
            out.println("<head>");
            out.println("<title>balance</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
     out.println("<div>");
     out.println(" <center><b><h1>YOUR ACCOUNT BALANCE :-</h1></b><center");
       out.println("<td><center><h1>b</h1></center></td>" + a);
          
     out.println("</body>");
            out.println("</html>");
             }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    
       }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    
    
}
