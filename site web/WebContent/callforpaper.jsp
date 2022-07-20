<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 

<link rel="stylesheet" href="style/style.css" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" >
<link rel="stylesheet" href="style/pagecss.css" >
<style>
  .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}
h1{
  color:#013f7e;text-transform:uppercase; 
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
     
#conf{
margin-left:30px;
margin-bottom:40px; 
text-align:justify;
font-size:14px;
font-family:sans-serif;
} 
#conf .btn{
    
    color:#3498db;   
	padding-left: 8px;  
	padding-right: 8px;  
	font-size: 15px;
	cursor: pointer;
	font-family:montserrat;
	border: 1px solid #3498db;
	border-radius:15px;
	font-weight:bold;
	 position: relative;
	  overflow: hidden;
	  background: none;
	  cursor: pointer; 
	  transition: 0.9s;
    
}
#conf .btn::before{
  content: "";
  position: absolute;
  left: 0;
  width: 100%;
  height: 0%;
  background: #3498db;
  color:white;
  z-index: -1;
  transition: 0.8s;
}
 
#conf .btn1{
  color: #3498db; 
   float:right;
}

#conf .btn2{
  color: #3498db;
 float:right;
}
  #conf p{
  border-radius:15px;
  border: 1px solid #3498db;
  margin-right:5%;
  padding:15px 15px 40px 15px; 
  }
#conf .btn1:hover,#conf .btn2:hover{
  color: white;
}

#conf .btn1::before{
  top: 0;
  border-radius: 0 0 50% 50%;
}
#conf .btn2::before{
  bottom: 0;
  border-radius: 50% 50% 0 0;
}
#conf .btn1:hover::before,#conf .btn2:hover::before{
  height: 160%;
  color:white;
}
</style>
 </head>
<body>
 <!-- navbar -->
 
 
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
  <div class="topleft">programme</div>
</div>

 

</header>
 
 
 <!-- end navbar -->
<!--   call 4 paper -->
<section>
<div class="paper4" >
<div class="container-fluide  shadow-lg p-3 mb-5 bg-white rounded " >
<div class="container "><p  class="lead  text animated bounceInRight" style="font-size:14px;font-family:sans-serif;margin-left:3%; padding-top:40px; text-align:justify; ">
    La conférence CNIA-2020 vise à fournir une plateforme idéale pour discuter,
 partager des expériences et ouvrir des opportunités de collaboration entre les différents groupes de travail existants dans les domaines
  de l'ingénierie et des technologies de l'information. 
  C'est aussi une excellente occasion pour les jeunes chercheurs de se lancer dans les travaux de publication et de diffusion de ses 
  travaux et apports de recherche. Nous invitons tous les auteurs à participer et à contribuer à leurs travaux de communication,
   de recherche dans les domaines de l'
intelligence artificielle.</p>
  <div class="row" style="margin-left:2%;">
   <div class="col-md-6">
   <img alt="ai.jpg" src="imges/ai.jpg" class="d-block w-100 h-100 responsive  animated wobble" style="border-radius:2%"></img>
   </div>
     <div class="col-md-6 text animated bounceInRight">
     <p style="font-size:14px;font-family:sans-serif;margin-left:3%; text-align:justify;">
L'objectif de cette conférence est de rassembler des chercheurs et des praticiens pour discuter des expériences dans diverses
 approches et techniques d'IA appliquées à la gestion des connaissances et à l'innovation. Les participants   bénéficieront des observations, 
 des publications, des évaluations et des propositions critiques fournies par les spécialites du domaine.
Cette conférence, offrira également à ces étudiants l’opportunité de se familiariser avec les agendas de la recherche
 dans cette région et contribuera à leur mise en réseau, tant professionnelle qu’au niveau de la recherche, avec les académiciens des universités de la région. La participation à la conférence permettra aux
 étudiants de publier leurs travaux de recherche , ce qui contribue à promouvoir, dans la communauté universitaire  .
  </p> </div>
   </div>
   
   <p class="text animated bounceInRight" style="font-size:14px; text-align:justify;font-family:sans-serif;margin-left:3%;margin-top:2%;" > Le <span style="color:#013f7e;">CNIA-2020</span> invite les chercheurs
    souhaitant participer à la conférence à soumettre une demande de participation ,en suivant ces étapes:
    
    
     <ul class="text animated bounceInRight" style="margin-left:4%;margin-bottom:40px; text-align:justify;font-size:14px;font-family:sans-serif;">
     <li>Remplir le formulaire de demande de participation à la conférence, en y joignant une proposition de recherche</li>
     <li>Le comité scientifique de la conférence recevra les demandes de participation</li>
     <li>Les candidats seront informés du résultat, par courrier électronique</li>
     </ul>
     <div id="conf" class="text animated bounceInRight">
 <div class="row">
 <div class="col-md-6"><p> Pour vous assurer d'avoir la plus récente résumés soumise de notre conférence, veuillez utiliser
  le lien que vous trouverez ci-dessous. qui vous permet de télécharger le livre qui contient toute les resumés soumise 
<br>
<c:if test="${messageLivre != null}">
<i style="color:red;margin-top:10%;">le livre sera disponible le plus tôt possible</i>
</c:if>
	 <a class="btn btn2" role="button" href="LivreDesResumes">e-book</a> 
</p></div>
<div class="col-md-6">
<p> 
Afin de vous aider à connaitre les différents details de la conference ,nous avons mis à votre disposition
 un  programme détaillé de la conférence de l'intelligence artificielle à travers la botton ci-dessous.
<br>
<c:if test="${messageProgramme != null}">
<i style="color:red;margin-top:10%;">le programme sera publié prochainement</i>
</c:if>
<a class="btn btn1" role="button" href="GetProgramme"> programme </a>  
</p>
</div>

      </div> 
</div>
</div> 

</section>  
<!--end important dates --> 
 
<!-- themes -->
<div class="resume" id="resume" style="   padding-top:50px;  padding-bottom:30px; background:#f9f9f9;">
<div class="container">

<h1 class="text-center"  >THÈMES INCLUS</h1>
<p class="text-center text-muted" >

Quelques autres questions qui seront discutées pendant les conférences, il peut s'agir de l'idée de certains participants ou du partage des dernières recherches </p>
<div class="row">
<div class="col-md-12">
<ul class="timeline" >
 
 <c:if test="${listeSession != null}">
 <c:forEach items="${listeSession}" var="session">
 <li><h5><c:out value="${session.getTitre_session()}" /></h5>  
<c:forEach items="${listeParticipant}" var="ligne">
<c:if test="${ligne.getSession() == session.getTitre_session() }">
<p style="    color:#002b55;"><b><c:out value="${ligne.getTitre()}" />  </b></p>
 </c:if>
 </c:forEach>
 </li>
  </c:forEach>
 </c:if>
</ul>

</div>
</div>
</div>
</div> 


<!--end  themes -->

<!-- important dates -->
 
 <div class="container" style="   padding-top:80px; padding-bottom:80px;  ">
<div class="row">
<div class="col-lg-6">
<div class="titre" style="background-color:white;margin-left:8.7%;margin-right:30%;margin-bottom:0%"><h4 class="text-center" style="margin-left:0%;padding-bottom:2%;margin-top:4%">Frais d'inscription</h4></div>
<div class="container" style="color:#fff;">
<table class="table table-condensed table-dark table-hover table-sm " style="margin-top:10%;  border-radius:10px; padding-top:80px;  padding-bottom:30px;background-color:#013f7e" >
  <thead>
    <tr>
      <th scope="col">Categorie</th>
      <th scope="col">  Avant le 15 mai 2020</th>
      <th scope="col">Aprés le 15 mai 2020</th> 
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">Etudiant</th>
      <td>800 MAD</td>
      <td>100 MAD</td> 
    </tr>
        <tr>
      <th scope="row">Etudiant chercheur</th>
      <td>1000 MAD</td>
      <td>1300 MAD</td> 
    </tr>
    <tr>
      <th scope="row">Auditeurs</th>
      <td>600 MAD</td>
      <td>600 MAD</td> 
    </tr>
    <tr>
      <th scope="row">Universitaires</th>
      <td > 300 Euro</td>
      <td>330 Euro</td>
    </tr>
     <tr>
      <th scope="row">  Universitaires International</th>
      <td> 250 Euro</td>
      <td>280 Euro</td>
    </tr>
  </tbody>
</table>
</div>
</div>   
<div class="col-lg-6"> 

<div class="titre" style="background-color:white;margin-left:8.7%;  ">
<h4 class="text-center" style="margin-left:0%;padding-bottom:2%;margin-top:4%; width:100%; margin-right:120px;">payement par transfert du banque</h4></div>
<div class="banki"> 
<ul  style="border-style: solid; border-color:   #013f7e;border-radius:10px; ">
<li><b>Numéro du Compte:</b> 1023 2035 0124 5681 9999</li>

<li><b>Name:</b> association maroccain de recherche scientifique</li>

<li><b>Adresse:</b> BENI MELLAL -  BP</li>
<li><b>Code rapide:</b> BCMAMAMC XXX </li> 
</ul>
</div> 
 </div></div> </div>
 
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