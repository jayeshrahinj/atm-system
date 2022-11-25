<%-- 
    Document   : home
    Created on : 4 Aug, 2022, 10:43:10 PM
    Author     : 91789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title>
    </head>
    <style>
        .back
        {
            background:cornflowerblue;
        }
    .cl
    {
    height:25%;
    width:100%;
    background: blue;
    color:green;
    font-size: 25px;
    font-family: time new roman;
    }
    a{
        text-decoration: none;
        color:black;
        font-size: 20px;
        padding: 8px;
    }
    .size
    {
        background-color: powderblue;
       padding: 10px;
        width: 150px;
        height: 80px;
        border: 5px solid gray;
        margin: 0;
       font-size: 10PX;
        
    }
     .size1
    {
        background-color: powderblue;
        position: absolute;
       padding: 10px;
        width: 150px;
        height: 80px;
        border: 5px solid gray;
       font-size: 10PX;
       
       right: 0;
  
    }
   
    </style>
    <body class="back">
       <% 
            String username=(String)session.getAttribute("phone");
            
        %>
        <h3>
            user:-<%=username %>
        </h3>
        <div class="cl">
            <center><h1>ONLINE BANK</h1></center>
        </div>
         <CENTER><h1>CHOOSE ONE OPTION TO CONTINUE</h1></center>
         <center><h5>please first check balance if you want to add or withdraw money</h5></center>
        <div class="size1">
            
            <h1><a href="addfund.jsp">ADD FUNDS</a></h1>
            
        </div>
           <div class="size">
            <h1><a href="balance.jsp">BALANCE ENQUIRY</a></h1>
        </div>
        <div class="size1">
            <h1><a href="withdraw.java">transfer money</a></h1>
        </div>
        <div class="size">
            <h1><a href="withdraw.jsp">Withdraw</a></h1>
        </div>
         
        </div>
        
    </body>
</html>
