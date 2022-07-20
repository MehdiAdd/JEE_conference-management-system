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
<link rel="stylesheet" href="style/style.css"> <link rel="stylesheet" href="style/pagecss.css">
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
.par{
  list-style-type:none;
  position:relative;
 }
       
.par li{
    margin-top:40px; 
    border-raduis:50%;
    background:#fff;
    }
.par li h5{ 
       background-color:#333;
       padding:8px 0px 8px 60px;
        color:#fff;
       font-size:17px;
       
    }
.par li div {
       padding:5px 25px 0px 20px; 
       
    } 
   
   
 .wrapper{
   padding-top:50px;
   padding-left:50px;
   padding-right:50px;
   text-align:center;
     box-shadow: 0px 0px 10px rgba(0,0,0,.5);
 }
.wrapper th{
   vertical-align:middle;
   text-transform:uppercase;
   font-size:14px;
}
.wrapper td{
  vertical-align:middle;
  font-family:new romane;
  color:#21212;
}
.wrapper img{
       max-width:50px;
       max-height:50px;
      border-radius:50%;
 }
       <!--end participant -->
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
  <div class="topleft">Participants</div>
</div>

 

</header> 


<!-- participant -->

<div class="resume " id="resume" style="   padding-top:50px;  padding-bottom:30px; background:white;">
<div class="container"  style="width:82%">

<h1 class="text-center"  >RENCONTRER NOS PARTICIPANTS</h1>
<p class="text-center text-muted" >nos participants peuvent s'inscrire et soumettre leur article plus tôt afin qu'ils puissent expliquer leurs théories lors de la conférence</p>
 <div class="row">
<div class="col-md-12">
<ul class="par" >
 
 
  <c:if test="${listeSession != null }">
 <c:forEach items="${listeSession}" var="session">
 <li><h5><c:out value="${session.getTitre_session()}" /></h5>  
	   <div class="wrapper table-responsive " >
	 <table class="table table-sm table-borderless table-striped table-hover ">
			  <thead>
			    <tr>
			      <th scope="col">photo</th>
			      <th scope="col">nom</th>
			      <th scope="col">prenom</th>
			      <th scope="col">ville</th>
			      <th scope="col">email</th>
			      <th scope="col">etablissement</th>
			      <th scope="col">titre acdémique</th>

			    </tr>
			  </thead>
		  <tbody>
		  <c:forEach items="${listeParticipant}" var="ligne">
           <c:if test="${ligne.getSession() == session.getTitre_session() }">
		    <tr>
		      <td scope="col"><img alt="participant" src="imges/m.png"></td>
		      <td scope="col"><c:out value="${ligne.getNom()}" /></td>
		      <td scope="col"><c:out value="${ligne.getPrenom()}" /></td>
		      <td scope="col"><c:out value="${ligne.getVille()}" /></td>      
		      <td scope="col"><c:out value="${ligne.getEmail()}" /></td>
		      <td scope="col"><c:out value="${ligne.getEtablissement()}" /></td>
		      <td scope="col"><c:out value="${ligne.getTitre_academique()}" /></td>
		    </tr>
		</c:if>
        </c:forEach>

		   
		  </tbody>
		</table>
	 </div>
 </li>
  </c:forEach>
 </c:if>
 <c:if test="${ listeParticipantSessionOrdonnee != null}">
 <c:forEach items="${listeSession}" var="session">
 <c:set var="condition" value="0" scope="page" />
   <c:forEach items="${listeParticipantSessionOrdonnee}" var="ligne">
     <c:if test="${ligne.getSession() == session.getTitre_session() }">
      <c:set var="condition" value="1"/>
     </c:if>
     </c:forEach>
  <c:if test="${condition != 0 }">
 <li><h5><c:out value="${session.getTitre_session()}" /> (Session ordinnaire)</h5>  
 
	   <div class="wrapper table-responsive " >
	 <table class="table table-sm table-borderless table-striped table-hover ">
			  <thead>
			    <tr>
			      <th scope="col">photo</th>
			      <th scope="col">nom</th>
			      <th scope="col">prenom</th>
			      <th scope="col">ville</th>
			      <th scope="col">email</th>
			      <th scope="col">etablissement</th>
			      <th scope="col">titre acdémique</th>

			    </tr>
			  </thead>
		  <tbody>
		  <c:forEach items="${listeParticipantSessionOrdonnee}" var="ligne">
           <c:if test="${ligne.getSession() == session.getTitre_session() }">
		    <tr>
		      <td scope="col"><img alt="participant" src="imges/m.png"></td>
		      <td scope="col"><c:out value="${ligne.getNom()}" /></td>
		      <td scope="col"><c:out value="${ligne.getPrenom()}" /></td>
		      <td scope="col"><c:out value="${ligne.getVille()}" /></td>      
		      <td scope="col"><c:out value="${ligne.getEmail()}" /></td>
		      <td scope="col"><c:out value="${ligne.getEmail()}" /></td>
		      <td scope="col"><c:out value="${ligne.getTitre_academique()}" /></td>
		    </tr>
		</c:if>
        </c:forEach>

		   
		  </tbody>
		</table>
	 </div>
 </li>
 </c:if>
  </c:forEach>
 </c:if>
 
 
   
</ul>

</div>
</div>
</div>
</div> 


<!--end  themes -->







<footer class="section footer-classic context-dark bg-image" style="background: #2d3246; position: relative; top: 100px; padding-top: 50px;  color: rgba(255, 255, 255, 0.8);font-size: 15px ;margin-top:0;">
        <div class="container" >
          <div class="row row-30">
            <div class="col-md-4 col-xl-5">
              <div class="brand pr-xl-4 ">
                <h3 class="brand-title">CNIA-2020</h3>
               
                <!-- Rights-->
                <p class="rights"><span>Copyright ©  </span><span class="copyright-year">2020</span><span> </span><span>. </span><span>La Conférence Nationale d'Intelligence Artificielle | All rights reserved.</span></p>
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
              <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3369.634151843718!2d-6.320936684981355!3d32.37535848109522!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x8a466a76995ad38e!2sUniversity%20Library%20The%20Faculty%20polydisciplinary!5e0!3m2!1sen!2sma!4v1575797638433!5m2!1sen!2sma" width="400" height="250" frameborder="0" style="border:0; padding-bsaidm: 10px;" allowfullscreen=""></iframe>
          
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