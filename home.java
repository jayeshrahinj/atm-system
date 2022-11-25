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
public class home extends HttpServlet {

   
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
          Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * FROM user";
            System.out.println("query execute");
            rs = st.executeQuery(sql);

            while (rs.next()) {
                String a = rs.getString(1);
                String b = rs.getString(2);
                String c = rs.getString(3);
                String d = rs.getString(4);
                String e = rs.getString(5);
                String f = rs.getString(6);
                String g= rs.getString(7);
                
            out.println("<html>");
            out.println("<head>");
            out.println("<title>wrong password</title>");
            out.println("</head>");
            out.println("<body bgcolor=\"cyan\">");
            out.println("a");
                out.println("</html>");
                
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

      
    }

    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
  
        
    }
    
    
    

    
}
