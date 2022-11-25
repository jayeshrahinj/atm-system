<%-- 
    Document   : verify
    Created on : 8 Aug, 2022, 10:04:21 PM
    Author     : 91789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>verify Page</title>
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
              <form action="checkotp" method="post">
                <center> <table border="1">
       
            <center>
                <h1><strong>enter your captcha:</strong>&nbsp;&nbsp;&nbsp;<br>
                <h1><input type="text" name="username" placeholder="Enter otp here "/></h1>
                <h1>      <input type="submit" value="verify"/></h1>
            </center>
                        </form>

    </body>
</html>
