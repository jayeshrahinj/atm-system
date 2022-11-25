<%-- 
    Document   : register1
    Created on : 11 Nov, 2022, 8:10:10 PM
    Author     : 91789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>register Page</title>
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
       
     <h1><b><center>Account Detail</center><b></h1>
            <form action="detail1" method="post">
                <center> <table border="0">
       
            <center>
                <tr>
                    <td><h3><strong>Account Number:</strong></h3></td>
                    <td><h3><input type="int" name="acc" placeholder="Enter Your 5 digit Account Number" /></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>balance:</strong></h3></td>
                    <td><h3><input type="int" name="bal" placeholder="enter balance"/></h3></td>
                </tr>
                  </table>
                    <input type="submit" name="submit">
            </center>
        </form>
   
    </body>
</html>
 