<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" > 
<link rel="stylesheet" href="style/pagecss.css">
 
<link rel="stylesheet" href="style/style.css">
 <style>
 .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}
 </style>
 </head>
<body>


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


  <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="imges/1.png" class="d-block w-100 " alt="...">
	  <div class="carousel-caption d-none d-md-block animated pulse" style="animation-delay: 0.7s">
        <h5 class="animated bounceInLeft" style="animation-delay: 1s">CONFERENCE NATIONALE DE L'INTELLIGENCE ARTIFICIELLE
</h5>
       <p class="animated bounceInRight" style="animation-delay: 2s">4éme édition au 22-23 Juin 2020</p>
		<p class="animated bounceInRight" style="animation-delay: 2s"> FST Beni Mellal </p>
		<p class="animated bounceInUp" style="animation-delay: 2s"><a href="#introduction"  class="btn btn-info">Plus d'infos</a></p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="imges/2.png" class="d-block w-100" alt="...">
	  <div class="carousel-caption d-none d-md-block animated pulse" style="animation-delay: 0.7s">
        <h5 class="animated bounceInLeft" style="animation-delay: 1s">CONFERENCE NATIONALE DE L'INTELLIGENCE ARTIFICIELLE
</h5>
       <p class="animated bounceInRight" style="animation-delay: 2s">4éme édition au 22-23 Juin 2020</p>
		<p class="animated bounceInRight" style="animation-delay: 2s"> FST Beni Mellal </p>
		<p class="animated bounceInUp" style="animation-delay: 2s"><a href="#introduction"  class="btn btn-info">Plus d'infos</a></p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="imges/3.png" class="d-block w-100" alt="...">
	  <div class="carousel-caption d-none d-md-block animated pulse" style="animation-delay:0.7s">
        <h5 class="animated bounceInLeft" style="animation-delay: 1s">CONFERENCE NATIONALE DE L'INTELLIGENCE ARTIFICIELLE
</h5>
       <p class="animated bounceInRight" style="animation-delay: 2s">4éme édition au 22-23 Juin 2020</p>
		<p class="animated bounceInRight" style="animation-delay: 2s"> FST Beni Mellal </p>
		<p class="animated bounceInUp" style="animation-delay: 2s"><a href="#introduction"  class="btn btn-info">Plus d'infos</a></p>
      </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div class="container-fluid welcome">
<div class="row">
<div class="col-sm-8 text animated bounceInLeft">
<p>Le Comité d'organisation a le plaisir de vous inviter à rejoindre la Conférence NATIONALE sur l’intelligence artificiel, 
qui se tiendra à FST de Beni Mellal, Maroc, du 19 au 20 novembre, 2020.La conférence CNIA-2020  est destinée à fournir une plate-forme
 idéale pour discuter, partager des expériences et ouvrir des opportunités de collaboration entre les différents groupes de travail existants 
 dans les domaines de l’ingénierie et des technologies de l’information. C'est aussi une excellente occasion pour les jeunes chercheurs de se 
 lancer dans les travaux de publication et de diffusion de ses travaux et apports de recherche. Nous invitons tous les auteurs à participer et 
 à contribuer à leurs travaux de recherche innovante ou de développement technologique.</p>
</div>
<a name="introduction"></a>
<div class="col-sm-4 logo animated bounceInRight">
<h1>Bienvenue à CNIA-2020</h1>
<p><a href="http://localhost:8080/site_web/CallForPaper" class="btn btn-primary">Voir Plus</a></p>
</div>
</div>
</div>
<div class="container-fluid registration">
<div class="row">
<div class="col-sm-4 image animated bounceInLeft">
<img src="imges/registration.png" class="responsive mx-auto d-block">
</div>
<div class="col-sm-8 text animated bounceInRight">
<h2>Inscription et participation des auditeurs</h2>
<p>Veuillez noter que les auditeurs potentiels qui souhaitent assister à la conférence
  vous devez vous inscrire en ligne au préalable. <br>L'inscription à la conférence est possible
  via le formulaire en ligne jusqu'à la date limite du 20 mai 2020. Après cette date,
  le formulaire d'inscription sera désactivé.<br> Veuillez remplir le formulaire suivant:</p>
<p style="text-align:center;"><a href="http://localhost:8080/site_web/Registration" class="btn btn-primary">Voir Plus</a></p>
</div>
</div>
</div>


<div class="container-fluid submission">
<div class="row">

<div class="col-sm-8 text animated bounceInRight">
<h2 >Soumission des résumés</h2>
<p>
Instructions pour la préparation des résumés:<br>

Chaque résumé ne doit pas avoir moins d'une page normalement, y compris toutes les figures et références.
 Étapes pour la soumission d'un résumé<br>
Inscrivez-vous en cliquant sur l'URL du lien suivant:<br>
Remplissez les détails et téléchargez le résumé pdf et tous ses fichiers source correspondants .
Attendez la réponse de l'équipe CNIA-2020</p>
<p style="text-align:center;"><a href="http://localhost:8080/site_web/Submission" class="btn btn-primary">Voir Plus</a></p>
</div>
<div class="col-sm-4 image animated bounceInLeft">
<img src="imges/submission.png" class="responsive mx-auto d-block">
</div>
</div>
</div>


<div class="container-fluid registration">
<div class="row">
<div class="col-sm-4 image animated bounceInLeft">
<img src="imges/session.png" class="responsive mx-auto d-block">
</div>
<div class="col-sm-8 text animated bounceInRight">
<h2>Proposer une Session</h2>
<p>
Ce formulaire permet aux professeurs et aux étudiants chercheurs de proposer une session et la gérer dans la conférence , il suffit
 de remplir ce formulaire et d'attendre la reponse du coordinateur du congrés ,
 s'il accepte un compte sera crée avec lequel le responsable de cette session va connecte 
 pour   bien gérer les participants qui veulent participer a cette session. 
 l'utilisateur qui va proposer une session, represent un groupement de participant qui veulent présernter leurs propre session lors de la conférence
</p>
<p style="text-align:center;"><a href="http://localhost:8080/site_web/CallForSession" class="btn btn-primary">Voir Plus</a></p>
</div>
</div>
</div>



<div class="container-fluid deadline" style="background:white">
<div  class="row">


<div class="col-md-8 text animated bounceInLeft" >

<h2 class="text-center" style="margin-bottom:2%">Dates importantes</h2>
<p><div  class="table" style=" width:80%;border-radius:100px;">  

    
 <table class="table table-borderless table-dark" style=" border-radius:18px;">
<c:if test="${liste != null}">
<c:forEach items="${liste}" var="ligne">
    <tr>
      <th scope="row"><b><c:out value="${ligne.getNomDate()}"/></b></th>
      <td><c:out value="${ligne.getDate()}"/></td>
     
    </tr>
 </c:forEach>
 </c:if>   
</table> 
</div> 
  
</div> 
<div class="col-md-4 image animated bounceInRight">
<img src="imges/b.png" class="responsive mx-auto d-block"  >
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