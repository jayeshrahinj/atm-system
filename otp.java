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


/**
 *
 * @author 91789
 */
public class otp extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           
            int f=1;
        String username = request.getParameter("username");
        PrintWriter out = response.getWriter();
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        if(username.equals(""))
        {
            
            out.println("please enter number");
        }
        else
        {
            System.out.println("right");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * FROM user";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String a = rs.getString(3);
                System.out.println(a);
                if (username.equals(a)) {
                System.out.println("succes");
               out.println("<html>");
            out.println("<head>");
            out.println("<title>wrong password</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
            out.println("  <form action=\"checkotp\" method=\"post\">\n" +
               
"       \n" +
"            <center>\n" +
"                <h1>please enter captcha</h1>\n" +
"                </h1>      <input type=\"submit\" value=\"ok\"/></h1>\n" +
"            </center>\n" +
"                        </form>\n" +
"");
            out.println("</body>");
            out.println("</html>");
            
                  break;
                }
                else
                {
                    out.println("byee");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }  
        }
    }
}

    
    
   
   
    