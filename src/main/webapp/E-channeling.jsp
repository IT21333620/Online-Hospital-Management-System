<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel ="stylesheet" type="text/css" href = "css/header.css">
<link rel ="stylesheet" type="text/css" href = "css/E-channeling.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  
<body>
    <center><a href="../homepage.php"><img src="Img/head_logo2.jpg" id="header"></a></center>
    <div id="nav">
		<a href="home.jsp">Home</a>
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
    <div style="text-align:center">
        <span class="dot" style="background-image:radial-gradient(#4568dc , #b06ab3);"></span>
        <span class="dot" style=" cursor:no-drop;"></span>
        <span class="dot" style=" cursor:no-drop;"></span>
      </div>
      <div id="gg">
        <p class="txt">Doctor</p>
        <p class="txt"> Date & Time</p>
        <p class="txt">     Payment</p>
      </div>
      
    <div class="box">
        <img src="Img/doca_wallpep.jpg" style="width: 800px; height: 600px;">
    </div>

    <div class="box2">
        <center><h2 style="margin-top: 4%;">E-Channeling</h2></center><br><br>
        <center><div>
            <form method="post" action="E-channeling">
                <select name="Type" class="dtype"><ul class="dropdown-menu dropdown-menu-dark" >
                    <option value="Family Physician"><li >Family Physician</li></option>
                    <option value="Endocrinologists"><li>Endocrinologists</li></option>
                    <option value="Gastroenterologist"><li>Gastroenterologist</li></option>
                    <option value="Cardiologist"><li>Cardiologist</li></option>
                    <option value="Immunologists"><li>Immunologists</li></option></ul>
                  </select><br><br><br><br>
                <input type="text" name="doc" placeholder="Doctor" class="input" required><br><br><br><br>
                <input type="text" name="dat" class="input" onfocus="(this.type='date')" placeholder="Date"><br><br><br><br>
            </div>
            <div style="float:left; margin-left: 5%;" > 
                <button type="button" class="btn btn-outline-danger" >Cancle</button>
            </div>
            <div style="float: right; margin-right:5%; ;">
                <input type="submit" value="Next" name="submitBtn" class="btn btn-outline-primary" >
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