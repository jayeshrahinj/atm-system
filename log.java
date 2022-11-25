/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 91789
 */
public class log extends HttpServlet {

    int f = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ubal;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        HttpSession session= request.getSession(true);
        session.setAttribute("phone", username);
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
         System.out.println("welcome to log");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * FROM user";
            System.out.println("query execute");
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String fname = rs.getString(1);
               String lname = rs.getString(2);
                String phn = rs.getString(3);
                String vote = rs.getString(4);
                String add = rs.getString(5);
                String pass = rs.getString(6);
                String bal = rs.getString(8);
                String acc = rs.getString(7);
                    session.setAttribute("fname", fname);
        session.setAttribute("lname", lname);
        session.setAttribute("phn", phn);
        session.setAttribute("vote", vote);
        session.setAttribute("add", add);
        session.setAttribute("pass", pass);
              session.setAttribute("balance", bal);
   
               
                System.out.println(phn);
                System.out.println(pass);

                if (username.equals(phn) && password.equals(pass)) {
                    f = 1;
                    System.out.println("succes");
                    System.out.println("heyyy");
                    System.out.println(f);
                    break;
                }
            }
         } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        if (f == 1) {
        response.sendRedirect("home.jsp");
        } else 
            response.setContentType("text/html");

            out.println("<html>");
            out.println("<head>");
            out.println("<title>wrong password</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
            out.println("<table>");
            out.println("<tr>");

            out.println("<td><center><h1>Wrong password or</h1></center></td>");
            out.println("<td><center><h1> phone number</h1></center></td>");

            out.println("</tr>");

            out.println("<tr>");
            out.println("<center>");
            out.println("<td><h1><button><a href=\"index.jsp\">login again</a></button></h1></td>\n");

            out.println("&nbsp;&nbsp;<td><h1><button><a href=\"register.jsp\">Register</a></button></h1></td>\n");
            out.println("</center>");
            out.println("</tr>");

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        } 
    }

