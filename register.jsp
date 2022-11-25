<%-- 
    Document   : register
    Created on : 7 Aug, 2022, 2:38:42 PM
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
       
     <h1><b><center>Register here</center></b></h1>
            <form action="detail" method="post">
                <center> <table border="0">
       
            <center>
                <tr>
                    <td><h3><strong>First Name:</strong></h3></td>
                    <td><h3><input type="text" name="firstname" placeholder="Enter firstname"/></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>last Name:</strong></h3></td>
                    <td><h3><input type="text" name="lastname" placeholder="enter lastname"/></h3></td>
                </tr>
                <tr>       
                    <td><h3><strong>phone number:</strong></h3></td>
                    <td><h3><input type="tel" name="phonenumber" placeholder="Enter phone number"/></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>Voter ID:</strong></h3></td>
                    <td><h3><input type="tel" name="voter "  placeholder="Enter Voter ID"/></h3></td>
                </tr>
                <tr> 
                    <td><h3><strong>Address:</strong></h3></td>
                    <td><h3><input type="string" name="address" placeholder="Enter address"/></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>password:</strong></h3></td>
                    <td><h3><input type="password" name="pass" placeholder="Create Password"/></h3></td>
                </tr>
                   <tr>
                    <td><h3><strong>Account Number:</strong></h3></td>
                    <td><h3><input type="int" name="acc" placeholder="Enter Your 5 digit Account Number" /></h3></td>
                </tr>
                <tr>
                    <td><h3><strong>balance:</strong></h3></td>
                    <td><h3><input type="int" name="bal" placeholder="enter balance"/></h3></td>
                </tr>
             
                    </table>
                    <input type="submit" name="next">
            </center>
        </form>
   
    </body>
</html>
