<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html>
<html>
<head>
<link rel ="stylesheet" type="text/css" href = "css/header.css">
<link rel ="stylesheet" type="text/css" href = "css/payment.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <center><a href="../homepage.php"><img src="Img/head_logo2.jpg" id="header"></a></center>
    <div id="nav">
		<a href="../homepage.php">Home</a>
            <a href="../Design.php">E-channeling</a>
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
    <div style="text-align:center">
        <span class="dot" style="background-image:radial-gradient(#56ab2f , #a8e063);"></span>
        <span class="dot" style=" background-image:radial-gradient(#56ab2f , #a8e063);"></span>
        <span class="dot" style="background-image:radial-gradient(#4568dc , #b06ab3);"></span>
      </div>
      <div id="gg">
        <p class="txt">Doctor</p>
        <p class="txt"> Date & Time</p>
        <p class="txt">     Payment</p>
      </div>
      
    <div class="box">
        
        <form method="post" action="update">
        	<center>
	        <h2 style="margin-top: 10px;">Summary</h2>
	        <i class="bi bi-blockquote-left"></i>
	        <label for="ty">Type  </label> <input type="text" name="ty" class="form-control" style="width:80%; margin-bottom: 18px;" value="<c:forEach var="cha" items="${channelDetail}"> ${cha.type}</c:forEach>">
	        <i class="bi bi-person-heart"></i>
	        <label for="doc">Doctor </label> <input type="text" name="doc" class="form-control" style="width:80%; margin-bottom: 18px;" value="<c:forEach var="cha" items="${channelDetail}"> ${cha.doc}</c:forEach>">
	        <i class="bi bi-calendar3"></i>
	        <label for="datee">Date </label> <input type="text" name="datee" class="form-control" style="width:80%; margin-bottom: 18px;" value="<c:forEach var="cha" items="${channelDetail}"> ${cha.date}</c:forEach>">
	        <i class="bi bi-alarm-fill"></i>
	        <label for="timee">time </label> <input type="text" name = "timee" class="form-control" style="width:80%; margin-bottom: 18px;" value="<c:forEach var="cha" items="${channelDetail}"> ${cha.time}</c:forEach>">
	        </center>
	        <hr style="border: 2px solid white;">
	        <p style="font-size: 18px; margin-left: 10%;">Doctor fee       RS<c:forEach var="doc" items="${DocDetail}"> ${doc.charge}</c:forEach></p>
	        <p style="font-size: 18px; margin-left: 10%;">Hopital fee      RS  500</p>
	        <hr>
	        
	        <p style="font-size: 18px; margin-left: 10%;">Total fee        RS</p>
	        <div style="float:left; margin-left: 10%;">
	            <button class="btn btn-primary" >Update</button>
	        </div>
	    </form>
	    <form method="post" action="delete">
	   	<div style="float: right; margin-right: 10%;" >
	        <button class="btn btn-danger" type="submit">Delete</button>
	   </div>
        </form>
        <br><br>
        <p style="margin-left: 5%;">Click Help me to see more information</p>
    </div>

    <div class="box2">
        <center><h2 style="margin-top: 4%;">Payment</h2></center><br><br>
        <center><div>
            <form method="post" action="payment">
                <input type="radio" class="btn-check" name="options" id="option1" autocomplete="off" >
                <label class="btn btn-outline-primary" for="option1"><img src="Img/visa.png" style= "width: 30px; height:20px;">Visa</label>

                <input type="radio" class="btn-check" name="options" id="option2" autocomplete="off">
                <label class="btn btn-outline-warning" for="option2"><img src="Img/Master.png" style="width: 20px; height:20px"> Master</label>

                <input type="radio" class="btn-check" name="options" id="option3" autocomplete="off">
                <label class="btn btn-outline-info" for="option3"><img src="Img/AE.png" style="width: 25px; height:25px"> American Express</label>
            </div>
            <br>
            <br>
            <div class="mb-3">
                <label for="card" class="form-label">Card Number</label>
                <input type="text" class="form-control" name="card" placeholder="123456789" style="width:80%" pattern="(?=.*\d)(?=.*[0-9]).{16}" title="16 Digits number">
            </div>
            <div class="mb-3">
                <label for="exp" class="form-label">Expire</label>
                <input type="text" class="form-control" name="exp" placeholder="mm/yyyy" style="width:80%" >
            </div>
            <div class="mb-3">
                <label for="cvv" class="form-label">CVV</label>
                <input type="text" class="form-control" name="cvv" placeholder="123" style="width:80%" pattern="(?=.*\d)(?=.*[0-9]).{3}" title="3 Digits number">
            </div>
            <br>
            <br>
            <div >
                <input type="submit" value="Pay " name="submitBtn" class="btn btn-success" >
            </div>
            </form>
      
    </div></center>

</div>
<br>

<div style="position: absolute; top:120%; right:0%">
    <button type="button" class="btn btn-warning"
    data-bs-toggle="popover" data-bs-placement="right"
    data-bs-custom-class="custom-popover" data-bs-trigger="focus" data-bs-html="true"
    data-bs-title="What to do"
    data-bs-content="# Family Physician - routine checkups and screening tests <br/>
                     # Endocrinologists -  diabetes, thyroid problems, infertility, and calcium <br/>
                     # Gastroenterologist -  abdominal pain, ulcers, diarrhea, jaundice <br/>
                     # Cardiologist - heart failure, a heart attack, high blood pressure <br/>
                     # Immunologists -  asthma, eczema, food allergies, insect sting allergies"
                     >
    Help Me
    </button>
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

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
<script>
    const popoverTriggerList = document.querySelectorAll('[data-bs-toggle="popover"]')
    const popoverList = [...popoverTriggerList].map(popoverTriggerEl => new bootstrap.Popover(popoverTriggerEl))
    var popover = new bootstrap.Popover(document.querySelector('.popover-dismiss'), {
    trigger: 'focus'
    })
    $(this).popover({
            html:true
        });
</script>


</html>