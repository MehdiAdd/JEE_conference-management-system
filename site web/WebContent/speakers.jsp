<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" > 
<link rel="stylesheet" href="style/style.css"> 

<link rel="stylesheet" href="style/pagecss.css">

<style type="text/css">
h1{
  color:#013f7e;text-transform:uppercase;
} 
 .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}
 
  #testimonials span{
   color:#0277bd;font-weight:600;font-size:20px;
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
        #testimonials img{
      width:70px; 
       height:70px;border-radius:50%;margin-left:0.5%;margin-top:-5%;margin-bottom:20px; 
       border:6px solid white; 
   }  
 
   .review{
	   font-size:14px;
	   border-radius:10px; box-shadow: 0px 0px 10px rgba(0,0,0,.5);
     text-align:justify;
     background:#e0e0e0;margin-left:4%;margin-right:3%; 
     padding:24px 24px 24px 24px;
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
  <div class="topleft">Speakers</div>
</div>

 

</header> 


 
<!-- speakers -->


<section id="testimonials" >
<div class="container">
<h1 class="text-center"  style="color:#013f7e;text-transform:uppercase;">rencontrer nos conférenciers</h1>
<p class="text-center text-muted" style="margin-bottom:8%;">
</p>
 
<div class="container animated tada" > 
<p class="review" style="">
Hajar Moussannif est une passionnée d’intelligence artificielle (IA) et d’innovation. Une passion
 qu’elle veille à transmettre à ses étudiants de la faculté des sciences Semlalia de Marrakech. L’enseignante-chercheure, 
 ingénieur d’Etat de l’INPT (Institut national des postes et télécoms), docteur en informatique de Cadi Ayyad, est à l’origine 
 du premier master en data sciences de son université.

closevolume_off
Les étudiants se bousculent pour s’y inscrire. Car chez elle, pas question de théorie. Elle les embarque 
ans des projets concrets, leur apprend à viser très haut et à croire en leur potentiel. «Ils sont capables de nous étonner, 
il faut juste les motiver et les accompagner. Un seul mot d’encouragement est susceptible de les transformer», confie-t-elle.
<br><span  >Hajar Moussannif</span></p>
<img alt="team" src="imges/speaker5.jpeg" class="img-responsive"  >
</div>
<br><br>

<div class="container animated tada" >
<p class="review"  >
Ben Hammersley est un futuriste incitant à la réflexion des auditoires du monde entier lors de conférences,
 depuis plus de 15 ans. Il opte pour une approche pratique et proactive de l’ère numérique, incitant son public
  à être présent dans l’instant pour se préparer à l’avenir.

Hammersley explore les effets de l’Internet sur l’économie, la société et la géopolitique. Il décrypte notamment comment
 l’intelligence artificielle, la robotique et l’Internet des objets révolutionnent le monde des entreprises à un rythme de
  plus en plus rapide chaque année. Des salles de conférences aux ventes et au service client, la révolution numérique impacte 
  la stratégie et la culture de votre organisation à tous les niveaux.
Dans sa présentation, il relie les tendances technologiques dans les domaines du management, de la communication et du marketing,
 offrant ainsi un cours accéléré pour apprendre à évoluer au sein de cette nouvelle ère numérique.
<br><span  >Ben Hammersley</span></p>
<img alt="team" src="imges/speaker2.jpg" class="img-responsive  "  >
</div>
<br><br>
<div class="container animated tada">
<p class="review">
Le futur est son métier mais pourtant son sac à dos l'accompagne partout à travers la planète !

Passionné de nouvelles technologies, Jean-Christophe Bonis est un aventurier des temps modernes.

Conférencier, auteur, nomade, blogueur, coach, doctorant, éternel chasseur de projets innovants,
 voyageur infatigable; Jean-Christophe Bonis est un expert avisé qui parcourt le monde, pose sa tente, 
 et prêche pour un nouveau monde orienté autour de l'usage du consommateur.

Spécialiste des nouvelles technologies depuis plus de quinze ans pour le compte de fonds d'investissement 
puis en tant que consultant, il consacre sa vie professionnelle à l'analyse des conséquences des nouvelles 
technologies sur le comportement des consommateurs et les implications stratégiques sur les organisations.
<br><span  >Jean-Christophe Bonis</span></p>
<img alt="team" src="imges/speaker3.jpg" class="img-responsive  "  >
</div>
<br><br>
<div class="container animated tada">
<p class="review" >
Sophie Hackford est une futuriste, entrepreneure et une conférencière, synthétisant des technologies explosives 
et interconnectées et des découvertes scientifiques du monde entier. Des essaims satellites au fait que l’IA démontre de l’intuition,
 nos vies quotidiennes sont de plus en plus reliées aux machines, ce qui risque de provoquer des conséquences surprenantes.

Auparavant, Sophie a lancé et dirigé les activités de conseil du magazine WIRED, amenant des entrepreneurs 
de tous horizons à imaginer l’avenir dans des salles de conférence. Elle a passé deux ans à la Silicon Valley 
au sein de l’Université Singularity, un groupe basé dans un parc de recherche de la NASA, chargé de comprendre
 et d’exploiter les technologies exponentielles.
<br><span  >Sophie Hackford</span></p>
<img alt="team" src="imges/speaker1.jpg" class="img-responsive  "  >
</div>
<br><br>
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