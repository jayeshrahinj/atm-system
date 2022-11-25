<%-- 
    Document   : balance
    Created on : 12 Nov, 2022, 9:55:36 PM
    Author     : 91789
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <style>
          .cl
    {
    height:25%;
    width:100%;
    background: blue;
    color:green;
    font-size: 25px;
    font-family: time new roman;
    }
  </style>
    <body bgcolor="powderblue">
          <div class="cl">
            <center><h1>ONLINE BANK</h1></center>
        </div>
          <%! String bal;%>
          <% 
              String acc=null;
            
                session.setAttribute("acc", acc);
        session.setAttribute("bal", bal);
      String phone = (String)session.getAttribute("phone");
 Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
 try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");

            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db18", "root", "root");
            System.out.println("Connected");

            st = con.createStatement();

            String sql = "SELECT * FROM user where phone_number="+phone+"";
            System.out.println("query execute");
            System.out.println(sql);
            rs = st.executeQuery(sql);
   while (rs.next()) {
            bal = rs.getString(8);
                acc = rs.getString(7);
              
   }
 }
  catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        
%>
      
        <form action="home.jsp" >
            <center>
                <table>
                <tr>
                    <td><h3><strong>Account no: <%=acc %></strong></h3></td>
                    <td><h3></h3></td>
                </tr>
                <tr>       
                    <td><h3><strong>Balance: <%= bal%></strong></h3></td>
                    <td><h3></h3></td>
                </tr>
                <center>
                </table>
                    <h3>  <input type="submit" name="submit"></h3>
         
            
       
       </form>
     
    </body>
</html>
