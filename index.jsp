
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
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
  

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<body bgcolor="powderblue">
 <div class="cl">
            <center><h1>ONLINE BANK</h1></center>
        </div>
       
<h2>Login Form</h2>

<form action="log" method="post">
  <div class="imgcontainer">
    <img src="https://png.pngtree.com/png-vector/20191003/ourmid/pngtree-user-login-or-authenticate-icon-on-gray-background-flat-icon-ve-png-image_1786166.jpg" alt="Avatar" class="avatar" height="150px" width="50px">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
 <input type="text" name="username" placeholder="Enter your Phone_Number"/>
    <label for="psw"><b>Password</b></label>
    <input type="password" name="password" placeholder="enter password"/>
  <input type="submit" value="Login"/></h1>
         </form>
        
       <h1><button><a href="register.jsp">Register</a></button></h1>
                 <h1><button><a href="forget.jsp">forgetPassword</a></button></h1>   


</body>
</html>

