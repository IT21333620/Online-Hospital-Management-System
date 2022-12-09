     <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8" />
    <title>Login</title>
	<link rel="stylesheet" href="css/Clogin.css">
  </head>
  <body>
    <div class="logoo">
     <!--   <center>
        <a href="#"><img src="#" id="header" /></a>
      </center> -->
    </div>
    <div class="center">
      <h1>Login</h1>

      <form  action="log" method="post">
        <div class="txt_field">
          <label for="uname">Username</label>
          <input
            type="text"
            name="uname"
            placeholder="ex: jone doe"
          required />
        </div>
        <div class="txt_field">
          <label for="password">Password</label>
          <input type="password" name="password" placeholder="ex: jonedow123" required />
        </div>
        <input type="submit" value="Login" />
      </form>
      <div>
      <button style="width: 320px; margin-left:10%; left:20%; height: 50px; border: 1px solid; background: #496ee6; border-radius: 10px; font-size: 18px; color: #ffffff; font-weight: 700; cursor: pointer; outline: none;" onclick="window.location.href = 'html/stafflogin.html'">Employee Login</button>
        <div class="signup_link">
          Not a member? <a href="html/signup.html">Signup</a>
      	</div>
     </div>
    </div>
  </body>
</html>
