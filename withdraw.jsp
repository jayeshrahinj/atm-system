<%-- 
    Document   : withdraw
    Created on : 15 Nov, 2022, 1:00:50 AM
    Author     : 91789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>withdraw</title>
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
       
          <% 
          
 String bal=(String)session.getAttribute("bal");   
      
%>
      
        <form action="withdraw" method="post">
            <center>
                <table> 
                    <tr>
                    <td><h3><strong>Enter Amount to Withdraw:</strong></h3></td>
                    <td><h3><input type="number" name="fund" placeholder="Enter here"/></h3></td>
                </tr>
                </table>
               <input type="submit" name="submit">
            </center>
        </form>
     
    </body>
</html>
