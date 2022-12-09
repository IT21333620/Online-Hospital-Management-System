<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" type="text/css" href = "css/header.css">
</head>
<center><a href="../homepage.php"><img src="Img/head_logo2.jpg" id="header"></a></center>
<div id="nav">
    <a href="home.jsp">Home</a>
        <a href="Echanneling.jsp">E-channeling</a>
        <a href="../Materials.php">Phamacies </a>
        <a href="job.html">Contact us</a>
        <a href="AddDesign.html">About us</a>
</div>
<script>
    window.onscroll = function() {myFunction()};

    var navbar = document.getElementById("nav");
    var sticky = navbar.offsetTop;

    function myFunction() {
        if (window.pageYOffset >= sticky) {
             navbar.classList.add("sticky");
        }
        else
        {
            navbar.classList.remove("sticky");
        }
    }
</script>

<div style="background-image:url(Img/home.png); background-repeat: no-repeat; background-size: contain; height: 800px; margin-top: 0;">
    
</div>
<div style="background-image:url(Img/home2.png); background-repeat: no-repeat; background-size: contain; height: 300px;">
</div>
<body>

</body>
<footer class="fotr" style="font-family: system-ui;  margin-bottom: 0px;">
    <ul class="social">
        <li class="social">
             <a href="https://www.facebook.com/Vivacious-Designs-And-Textile-100517169330619" id="link" target="_blank"> <img src="Img/fb_icon.png" class="fb" >     Facebook   </a> 
        </li>
        <li class="social">
             <a href="https://www.instagram.com/vivaciousdesignsandtextile/" id="link1" onMouseOver="this.style.color='#C13584'" onmouseout="this.style.color='#FFFFFF'" target="_blank"><img src="Img/ig_Logo.png" class="ig" >      Instagram </a> 
        </li>
        <li class="social"> 
             <a href="https://linkedin.com/in/vivacious-designs-744853239/" id="link2" onMouseOver="this.style.color='#0072b1'" onmouseout="this.style.color='#FFFFFF'" target="_blank"><img src="Img/in_logo.png" class="in" >   Linkedin     </a> 
        </li>
        <li class="social"> 
            <a href="https://twitter.com/VivaciousDesig" id="link3" onMouseOver="this.style.color='#00acee'" onmouseout="this.style.color='#FFFFFF'" target="_blank"><img src="Img/twitter.png" class="twitter" >    Twitter  </a>
        </li>
        <li style="text-align: center;">
            <p id="copyright" >© 2022 Vivacious Designs And Textile - All rights reserved</p>
        </li>
    </ul>
    
</footer>
</html>