<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" > 
<link rel="stylesheet" href="style/style.css"> 

<link rel="stylesheet" href="style/pagecss.css">
<style>
  .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}
 
#inscription #input{
	margin:8px;
} 
#inscription #input1 label {
position:absolute;
margin-top:1.5%;
margin-bottom:40px;
right:60%;
pointer-events: none;
}
#inscription #input1 textarea{
 
margin-bottom: 20px;
margin-left: 60px;
padding: 4px 20px;
color: white;
font-size: 14px;
font-family: sans-serif;
 
outline: none;
border-bottom: 1px solid white;
 background:transparent;
margin-top:10%;
border-color:white; 
 border-radius:6px;
 } 

 

*::-webkit-input-placeholder{
 padding-top:4px;
 text-align:justify;
   color: #b0bec5; 
   font-family:sans-serif;
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
  <div class="topleft">Appel à Session</div>
</div>

 

</header>
 


<div class="row">
<div class="col-sm-6 col-xs-12 inscription-text animated bounceInLeft" style="margin-bottom:auto;margin-top:auto; padding-left:5%; padding-bottom:10px; ">
<h2> 
Proposer une session</h2>
<p>Ce formulaire permet aux professeurs et aux étudiants chercheurs de proposer une session et la gérer dans la conférence , il suffit
 de remplir ce formulaire et d'attendre la reponse du coordinateur du congrés ,
 s'il accepte un compte sera crée avec lequel le responsable de cette session va connecte 
 pour   bien gérer les participants qui veulent participer a cette session. 
 l'utilisateur qui va proposer une session, represent un groupement de participant qui veulent présernter leurs propre session lors de la conférence</p>
</div>
<div class="col-sm-6 col-xs-12 animated bounceInRight" style="animation-delay: 0.5s; ">
<div id=inscription>
<h2>Appel à Session</h2>
<form method="post" action="CallForSession">
	

<div id="input"><input type="text" name="nom" required=""><label>Nom</label></div>
<div id="input"><input type="text" name="prenom" required=""><label>Prenom</label></div> 
<div id="input"><input type="text" name="email" required=""><label>Email</label></div>
<div id="input"><input type="text" name="etablissement" required=""><label>Etablissement</label></div>
<div id="input"><input type="password" name="password" required=""><label>password</label></div>
 <label name="titreAcademique" style="position: relative;left: 65px;">Titre Acadimique    </label>
		<select name="titreAcadimique" style="position: relative;left: 90px; width: 180px; border-radius: 5px;">
			<option value="professeur">Professeur</option>
			<option value="etudiant">Etudiant</option>
			<option value="autre">Autre</option>		
		</select>
		

<div id="input" style="margin-top:22px;"><input type="text" name="session" required=""><label>Session</label></div>

<div id="input1"><textarea rows="3" cols="40" placeholder="veuillez saisir l'intéret de votre session , ici!" name="description" required=""></textarea><label>description</label> </div>	
<div id="button">
<input type="submit" name="envoyer" value="s'inscrire" >
</div>
<c:if test="${message != null}">
<p style="float:right;margin-right:42%;">votre demande est envoyé </p>
</c:if>
</form>
</div>
</div>
</div>








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
            <div class="span8">
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