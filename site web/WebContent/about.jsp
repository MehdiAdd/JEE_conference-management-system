<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<meta charset="utf-8"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
<link rel="stylesheet" href="style/style.css" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" >
<link rel="stylesheet" href="style/pagecss.css" >
 
 
 <style type="text/css">
    blockquote::before
    {
     content:'\93';
     font-size:50px;
     color:#007bff;
     position:relative;
       line-height:20px;
       bottom:-15px;
       right:5px;
     }
    
    
 blockquote::after{
     content:'\94';
     font-size:50px;
     color:#007bff;
     position:relative;
       line-height:10px;
       bottom:-15px;
       left:5px;
     } 
  h1{
	
	color:#013f7e;margin-bottom:10px;text-transform:uppercase;
}
  h1::after{
     content:'';
     background:#013f7e;
     display : block;
     height:3px;
     width:100px;
     margin:10px auto 5px;
     border-radius:100%;
     }
     
    
 .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}
   
 </style>
</head>
<body>


 <header >

  <nav class="navbar navbar-expand-lg navbar-light fixed-top">
  <div class="container">
  <span class="navbar-brand" >CNIA-2020</span>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav ml-auto">
      <li class="nav-item active">
        <a class="nav-link" href="http://localhost:8080/site_web/Home">Accueil </a>
      </li>
    <li class="nav-item">
         <a  class="nav-link" href="http://localhost:8080/site_web/CallForPaper" >programme</a>
      </li>
       <li class="nav-item">
          <a  class="nav-link" href="http://localhost:8080/site_web/CallForSession" >appel à session</a> 
      </li>

	  <li class="nav-item">
        <a class="nav-link" href="comite.jsp">COMITÉS</a>
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="speakers.jsp">SPEAKERS</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="http://localhost:8080/site_web/Participants">participants</a>
      </li>
  <li class="nav-item dropdown" >
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          inscription
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color:#002b55">
          <a class="dropdown-item" href="http://localhost:8080/site_web/Registration" style="font-size:12.5px;text-align:center">sans acte</a>
          <a class="dropdown-item" href="http://localhost:8080/site_web/Submission" style="font-size:12.5px;text-align:center">avec acte</a> 
          </div> 
      </li>
	  <li class="nav-item">
        <a class="nav-link" href="about.jsp">
apropos </a>
      </li>
      
    </ul>
  
  </div>
  </div>
  
  </nav>


<div  class="menu">
 <img src="menu1.jpg" class="d-block w-100   responsive" alt="Responsive image" style="height:200px;">
  <div class="topleft"> Apropos</div>
</div>

 

</header>
 


<!-- a props du site -->
  
<div class="jumbotron jumbotron-fluid   text animated bounceInRight" style="background:#efefef; margin-left:120px; margin-right:120px; border-radius:40px;">
	  <div class="container" style="padding-left:8%;padding-right:8%" >
		<p style="font-size: 15.5px;font-family:new romane ; text-align:justify;">           Ce site est un projet de fin d'étude de gestion des évènements scientifiques. 
			il permet aux professeurs et les étudiants   chercheurs récemment titulaires d’un doctorat 
			de s'inscrire pour assister à la conférence de l'intelligence artificielle.
			la conférence précedante offert aux participants de présenter des éléments de leurs projets de recherches, 
			et de bénéficier ainsi des publications périodiques et des observations d’académiciens spécialistes de ces domaines. 
			Cette conférence, offrira également à ces étudiants l’opportunité de se familiariser avec les agendas de la recherche 
			dans cette région et contribuera à leur mise en réseau, tant professionnelle qu’au niveau de la recherche, avec les
		    académiciens des universités de la région.
		    La participation à la conférence permettra aux étudiants de publier leurs travaux de recherche ,
		    ce qui contribue à promouvoir, dans la communauté universitaire  .
		</p>
	  </div>
 
    </div>
    <!-- a props du site -->
    
    
    



<section id="about" >
<h1 class="text-center text animated wobble" style="	color:#013f7e; padding-top:4%;  ">Encadrant</h1>
<div class="container" style="  padding-top :20px ; padding-bottom :20px ;background:white;"> 
<div class="row" style="   margin-top:30px;">
 <div class="col-md-4 text-center  text animated bounceInRight" style="     margin :40px auto ; ">
  <div class="profile" style="padding:70px 10px 10px; background-color: #efefef ;border-radius:10px;">
   <img src="imges/la.jpg" class="user" alt="encdrnt" style="top:-60px ;position : absolute;   left:34%;     border:8px solid white;    width:120px;  height:120px; border-radius:50%;">
     <blockquote style=" text-align:justify" >Professeur de mathématiques appliquées, Université Sultan Moulay Slimane, FST, Béni Mellal, Maroc</blockquote>
		<h3 class="text-center" style="   font-size:20px; margin-top:15px;  color:#007bff;">Lekbir Afraites  <span class="text-muted" style="font-size:12px; color:#333;">Ecadrant des createurs</span></h3>
  </div>
  </div>

  
 </div>
</div>
</section>



 <section id="about" >

<h1 class="text-center text animated wobble"  style="color:#013f7e; padding-top:4%; ">Createurs Du Site</h1>
<div class="container" style="  padding-top:20px; padding-bottom:20px;  background:white;margin-bottom:40px;max-size:300px;" >
<div class="row" style="   margin-top:30px;"> 

 <div class="col-md-4 text-center  text animated bounceInRight" style="     margin :40px auto ; ">
  <div class="profile" style="padding:70px 10px 10px; background-color: #efefef ;border-radius:10px;">
   <img src="imges/hmz1.jpg" class="user" alt="hmz pic" style="top:-60px ;position : absolute;  left:34%;border:8px solid white;    width:120px;  height:120px; border-radius:50%;">
     <blockquote style=" text-align:justify" >Etudiant à la faculté des sciences et technique de beni-mellal , licence Genie Informatique
		</blockquote>
		<h3 class="text-center" style="   font-size:20px; margin-top:15px;  color:#007bff;">ASSEMLALI Hamza <span class="text-muted" style="font-size:12px; color:#333;">co-founder of this site</span></h3>
  </div>
  </div>


 <div class="col-md-4 text-center  text animated bounceInRight" style="     margin :40px auto ; ">
  <div class="profile" style="padding:70px 10px 10px; background-color: #efefef ;border-radius:10px;">
   <img src="imges/mhd.jpg" class="user" alt="mhd pic" style="top:-60px ;position : absolute;  left:34%;border:8px solid white;    width:120px;  height:120px; border-radius:50%;">
     <blockquote style=" text-align:justify" >Etudiant à la faculté des sciences et technique de beni-mellal , licence Genie Informatique
		</blockquote>
		<h3 class="text-center" style="   font-size:20px; margin-top:15px;  color:#007bff;"> ADNANI El Mehdi  <span class="text-muted" style="font-size:12px; color:#333;">co-founder of this site</span></h3>
  </div>
  </div>  
 </div>
</div>
</section>


 







<footer class="section footer-classic context-dark bg-image" style="background: #2d3246; position: relative; top: 100px; padding-top: 50px;  color: rgba(255, 255, 255, 0.8);font-size: 15px margin-top:0;">
        <div class="container" >
          <div class="row row-30">
            <div class="col-md-4 col-xl-5">
              <div class="brand pr-xl-4 ">
                <h3 class="brand-title">ICIA-2020</h3>
               
                <!-- Rights-->
                <p class="rights"><span>Copyright ©  </span><span class="copyright-year">2020</span><span> </span><span>. </span><span>The International Conference on Artificiel Intelegence | All rights reserved.</span></p>
              </div>
            </div>
            <div class="col-md-4" >
              <h3>Contacts</h3>
              <dl class="contact-list" >
                <dt>Address:</dt>
                <dd>Faculté Polydisciplinaire - Université Sultan Moulay Slimane<br>
Mghila BP: 592 Beni Mellal</dd>
              </dl>
              <dl class="contact-list">
                <dt>email:</dt>
                <dd><a href="mailto:#">mehdi.adnani2@gmail.com</a></dd>
                 <dd><a href="mailto:#">assemlalihamza@gmail.com</a></dd>
              </dl>
           
            </div>
            <div class="col-md-4 col-xl-3" >
	            <div class="span8" style="">
	              <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3369.634151843718!2d-6.320936684981355!3d32.37535848109522!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x8a466a76995ad38e!2sUniversity%20Library%20The%20Faculty%20polydisciplinary!5e0!3m2!1sen!2sma!4v1575797638433!5m2!1sen!2sma" width="400" height="250" frameborder="0" style="border:0; padding-bottom: 10px;" allowfullscreen=""></iframe>
	       	   </div>
            </div>
          </div>
        </div>
		</footer>








 <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"  ></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>