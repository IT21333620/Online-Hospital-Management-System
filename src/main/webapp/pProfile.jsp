<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html>
<html>
    <head>
        <title>Receptionist  |  dashboard</title>
        <link rel ="stylesheet" type="text/css" href = "css/header.css">
		<link rel ="stylesheet" type="text/css" href = "css/pProfile.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    </head>

<body>
    <center><a href="../homepage.php"><img src="Img/head_logo2.jpg" id="header"></a></center>
    <div id="nav">
		<a href="../homepage.php">Home</a>
            <a href="E-channeling.jsp">E-channeling</a>
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
<div class="BG">

    
    <div>

        <div class="photo">
            <center>
                <img src="Img/user.png" style="height: 175px; width:175px; margin:4%">
                <h4>Registered patient</h4>
                <br>
                <h3><c:forEach var="rec" items="${recDetails }">${rec.user_name}</c:forEach></h3>
                <br>
                <h4><c:forEach var="rec" items="${recDetails}"> ${rec.email}</c:forEach></h4>      
            </center>
        </div>

        <div class="det">
            <br>
            <p>First Name :<c:forEach var="rec" items="${recDetails}"> ${rec.fname}</c:forEach></p>
            <hr>
            <p>Last Name : <c:forEach var="rec" items="${recDetails}"> ${rec.lname}</c:forEach></p>
            <hr>
            <p>Address : <c:forEach var="rec" items="${recDetails}"> ${rec.address}</c:forEach></p>
            <hr>
            <p>Phone number : <c:forEach var="rec" items="${recDetails}"> ${rec.contact}</c:forEach></p>
            <hr>
            <p>Birthday : <c:forEach var="rec" items="${recDetails}"> ${rec.birthday}</c:forEach></p>
            <hr>
            
        </div>
    </div>
    <div class="res">
      <table class="table table-striped">
      <tr>
      	<th class="table-secondary">Patient Id</th>
      	<th class="table-secondary"> Doctor Type</th>
      	<th class="table-secondary">Doctor Name</th>
      	<th class="table-secondary">Date</th>
      	<th class="table-secondary">Time</th>
      	<th class="table-secondary">To who</th>
      	<th class="table-secondary">Note</th>
      </tr>
      
      
      
	<c:forEach var="cus" items="${channelDetail}">
	
	<c:set var="eid" value="${cus.eid}"/>
	<c:set var="type" value="${cus.type}"/>
	<c:set var="doc" value="${cus.doc}"/>
	
	<c:set var="date" value="${cus.date}"/>
	<c:set var="time" value="${cus.time}"/>
	<c:set var="who" value="${cus.who}"/>
	<c:set var="note" value="${cus.note}"/>
	<tr>
		
		<td>${cus.eid}</td>
		<td>${cus.type}</td>
		<td>${cus.doc}</td>
		<td>${cus.date}</td>
		<td>${cus.time}</td>
		<td>${cus.who}</td>
		<td>${cus.note}</td>
	</tr>

	</c:forEach>
	</table>

    </div>

</div>

  
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


