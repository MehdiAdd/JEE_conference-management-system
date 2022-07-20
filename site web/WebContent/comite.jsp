 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"> 
 <meta  name="viewport" conten="width=device-width",initial-scale="1">
    <title>liste_des_comités</title>
    	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" > 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.5.2/css/buttons.bootstrap4.min.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap4.min.css">

<link rel="stylesheet" href="style/style.css" >
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
 <link rel="stylesheet" href="style/styles1.css" > 
<link rel="stylesheet" href="style/style1.css" >

<link rel="stylesheet" href="style/pagecss.css">

 
 <style>
 .dropdown:hover>.dropdown-menu{
 display:block;
 
 }
 
 
 .dropdown .dropdown-item:hover{
	background-color:#6da2f8;
}

h1{
  color:#013f7e;text-transform:uppercase;margin-top:4%;
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
     
  #example img{
 
       max-width:50px;
       max-height:50px;
      border-radius:50%;
       
  }
  #example  th{
   text-align:center;
   text-transform:uppercase;
   font-size:14px;
}
#example td{
vertical-align:middle;
   text-align:center;
  font-family:new romane;
 
}
.card,.card-header{
background-color:#cfd8dc !important; 
border:none  !important; 
padding: 0 !important; 
margin-bottom:20px;
}
.card{ 
box-shadow: 0px 0px 10px rgba(0,0,0,.5);
    border-radius:20px;
}
 
.btn-link{
width:100%;
height:60px;
color:#000;
font-weight:bold ;
text-align:left;
text-decoration:none;

}
.btn-link:after{
   content:'\2212';
   width:35px;
   font-size:25px;
   text-align:center;
   border-radius:5px;
   right:15px;
   top:11px;
   position:absolute;
}
.btn-link.collapsed:after{
   content:'\002B';
}


  
 .card-body{
   background:white;
   padding-top:3%;
 }
.btn-link:before{
  content:'';
  height:25px;
   width:25px;
   position:absolute;
   background:#cfd8dc;
   z-index: 1;
   transform:rotate(45deg);
   left:50px;
   top:45px;
   
   
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
  <div class="topleft">Comités</div>
</div>

 

</header>

<h1 class="text-center"   >rencontrer nos comités</h1>
<p class="text-center text-muted" style="margin-bottom:15px;">réunion des professeur et des spécialistes  chargés d'admettre ou de rejeter des articles, des pièces.</p>
 
<div class="container">
<div class="accordion" id="accordionExample">
  <div class="card">
    <div class="card-header" id="headingOne">
      <h2 class="mb-0">
        <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
 comité de coordination
        </button>
      </h2>
    </div>

    <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
      <div class="card-body">
            <table id="example" class="table  table-striped   table-bordered dt-responsive nowrap table-borderless" style="width:100%">
	       <thead>
				    <tr>
				      <th scope="col">photo</th>
				      <th scope="col">nom</th>
				      <th scope="col">prenom</th>
				      <th scope="col">ville</th>
				      <th scope="col">email</th>
				      <th scope="col">etablissement</th>
				      <th scope="col">titre acdémique</th>
				      <th scope="col">affiliation</th>  
				      
	
				    </tr>
				  </thead>
	        <tbody>
	       		    <tr>
			      <td scope="col"><img alt="participant" src="imges/la.jpg"></td>
			      <td scope="col"> afraites</td>
			      <td scope="col">lekbir</td>
			      <td scope="col">béni-mellal</td>      
			      <td scope="col">lekbir.afraites@gmail.com</td>
			      <td scope="col">FST-Beni Mellal</td>
			      <td scope="col">professeur</td>
			      <td scope="col">président Génerale</td> 
			    </tr>
			   
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/jamal.png"></td>
			      <td scope="col">Jamal </td>
			      <td scope="col">Zbitou</td>
			      <td scope="col">settat</td>      
			      <td scope="col">jamal.zbitou@gmail.com</td>
			      <td scope="col">FST-Settat</td>
			      <td scope="col">professeur</td>
			       <td scope="col">Président de conférence</td> 
			    </tr>
		 
			    <tr>
			      <td scope="col"><img alt="participant" src="imges/salma.png"></td>
			      <td scope="col">Salma </td>
			      <td scope="col">Azzouzi</td>
			      <td scope="col">kenitra</td>      
			      <td scope="col">Azzouzi@gmail.com</td>
			      <td scope="col">FS-kenitra</td>
			      <td scope="col">professeur</td>
			         <td scope="col">co-président de conférence</td> 
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/hasan.png"></td>
			      <td scope="col">My El Hassan</td>
			      <td scope="col"> Charaf</td>
			      <td scope="col">kenitra</td>      
			      <td scope="col"> Charaf123@gmail.com</td>
			  	  <td scope="col">FS-kenitra</td>
			      <td scope="col">professeur</td>
			         <td scope="col">président de publication</td> 
			    </tr>
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/badr.png"></td>
			      <td scope="col"> Badr Eddine </td>
			      <td scope="col">El Mohajir</td>
			      <td scope="col">tetuan</td>      
			      <td scope="col">badreddin@gmail.com</td>
			      <td scope="col">FS-tetuan</td>
			      <td scope="col">profeeseur</td>
			         <td scope="col">co-président de publication</td> 
			    </tr>
			   
	            <tr>
			      <td scope="col"><img alt="participant" src="imges/otmanchakour.png"></td>
			      <td scope="col">otmane</td>
			      <td scope="col">chakour</td>
			      <td scope="col">tetouan</td>      
			      <td scope="col">otmanechakour@gmail.com</td>
			      <td scope="col">ensa-tetuan</td>
			      <td scope="col">professeur</td>
			         <td scope="col">co-président de publication</td> 
			    </tr>
			   
	              <tr>
			      <td scope="col"><img alt="participant" src="imges/hair.jpg"></td>
			      <td scope="col">Abdelatif	</td>
			      <td scope="col">Hair</td>
			      <td scope="col">casablanca</td>      
			      <td scope="col">abd_hair@yahoo.fr</td>
			      <td scope="col">FST-beni mellal</td>
			      <td scope="col">professeur</td>
			         <td scope="col">president du comité scientifique</td> 
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/rachid.jpg"></td>
			      <td scope="col">El Ayachi	</td>
			      <td scope="col">rachid</td>
			      <td scope="col">beni mellal</td>      
			      <td scope="col">rachidieea@yahoo.fr</td>
			      <td scope="col">FST-beni mellal</td>
			 <td scope="col">professeur</td>
			         <td scope="col">co-president du comité scientifique</td> 
			    </tr>
			      <tr>
				      <td scope="col"><img alt="participant" src="imges/nacha.jpg"></td>
				      <td scope="col"> Nachaoui	</td>
				      <td scope="col">Mourad</td>
				      <td scope="col">beni mellal</td>      
				      <td scope="col">m.nachaoui@usms.ma</td>
			         <td scope="col">FST-beni mellal</td>
			         <td scope="col">professeur</td>
			         <td scope="col">co-president du comité scientifique</td> 
			     </tr>
		 <tr> 
			   <td scope="col"><img alt="participant" src="imges/baslam.jpg"></td>
			      <td scope="col"> Baslam	</td>
			      <td scope="col">Mohamed</td>
			      <td scope="col">beni mellal</td>      
			      <td scope="col">m.baslam@usms.ma</td>
			         <td scope="col">FST-beni mellal</td>
			 <td scope="col">professeur</td>
			         <td scope="col">president du comité d'organisation</td>
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/er.jpg"></td>
			      <td scope="col">Erritali	</td>
			      <td scope="col">mohammed</td>
			      <td scope="col">beni mellal</td>      
			      <td scope="col">mederritali@yahoo.fr</td>
				    <td scope="col">FST-beni mellal</td>
				 <td scope="col">professeur</td>
				         <td scope="col">co-president du comité d'organisation</td>
			    </tr>
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/Najlae_Idrissi.jpg"></td>
				      <td scope="col">Idrissi	</td>
				      <td scope="col">najlae</td>
				      <td scope="col">beni mellal</td>      
				      <td scope="col">idrissi.najlae@gmail.com</td>
			         <td scope="col">FST-beni mellal</td>
		        	 <td scope="col">professeur</td>
			         <td scope="col">co-president du comité d'organisation</td>
			    </tr>
			   
	            <tr>
			      <td scope="col"><img alt="participant" src="imges/El_Mourabit_Yousef.jpg"></td>
			      <td scope="col">el mourabite</td>
			      <td scope="col">youssef</td>
			      <td scope="col">beni mellal</td>      
				  <td scope="col">youssef.mourabite@gmail.com</td>
			      <td scope="col">FST-beni mellal</td>
		          <td scope="col">professeur</td>
			      <td scope="col">co-president du comité d'organisation</td>
			    </tr>
			   <tr>
			      <td scope="col"><img alt="participant" src="imges/saadi.jpg"></td>
			      <td scope="col">saadi</td>
			      <td scope="col">youssef</td>
			      <td scope="col">beni mellal</td>      
				  <td scope="col">youssef.saadi@gmail.com</td>
			      <td scope="col">FST-beni mellal</td>
		          <td scope="col">professeur</td>
			      <td scope="col">co-president du comité d'organisation</td>
			    </tr>
	        </tbody>
	    </table>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingTwo">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
           comité scientifique
        </button>
      </h2>
    </div>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
      <div class="card-body table-responsive">
           <table id="example" class="table  table-striped  table-xs  table-bordered dt-responsive nowrap table-borderless" style="width:100%">
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
	       		       <tr>
	       		           <td scope="col"><img alt="participant" src="imges/jamal.png"></td>
			      <td scope="col">Zbitou</td>
			      <td scope="col">Jamal </td>
			     
			      <td scope="col">settat</td>      
			      <td scope="col">jamal.zbitou@gmail.com</td>
			      <td scope="col">FST-Settat</td>
			      <td scope="col">professeur</td> 
			    </tr>
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/asma.jpg"></td>
			      <td scope="col">benghabrit</td>
			        <td scope="col">Asmaa</td>
			    
			      <td scope="col">marrakech</td>      
			      <td scope="col">asmaabenghabrit@gmail.com</td>
			      <td scope="col"> ENIM-RABAT</td>
			      <td scope="col">professeur</td> 
			    </tr>
		 
			    <tr>
			      <td scope="col"><img alt="participant" src="imges/bouh.jpg"></td>
			      <td scope="col">bouhaddou</td>
			         <td scope="col"> Imane  </td>
			   
			      <td scope="col">meknes</td>      
			      <td scope="col">imane.bouh@gmail.com</td>
			      <td scope="col">ENSAM-meknes</td>
			      <td scope="col">professeur</td>  
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/Chaira.jpg"></td>
			      <td scope="col"> Abdellatif  </td>
			      <td scope="col">chaira</td>
			      <td scope="col">marrakech</td>      
			      <td scope="col">abdellatif@gmail.com</td>
			      <td scope="col">FS-meknes</td>
			      <td scope="col">professeur</td> 
			    </tr>
			        <tr>
			       <td scope="col"><img alt="participant" src="imges/adib.jpg"></td>
			      <td scope="col"> 	 adib	  </td>
			      <td scope="col">Abdellah</td>
			      <td scope="col">Mohammedia</td>      
			      <td scope="col">adibabdellah@gmail.com</td>
			      <td scope="col">FST-Mohammedia</td>
			      <td scope="col">professeur</td> 
			    </tr>  
			        <tr>
			       <td scope="col"><img alt="participant" src="imges/kissi.jpg"></td>
			      <td scope="col"> 	 kissi	  </td>
			      <td scope="col">mohammed</td>
			      <td scope="col">Mohammedia</td>      
			      <td scope="col">kissimed@gmail.com</td>
			      <td scope="col">FST-Mohammedia</td>
			      <td scope="col">professeur</td> 
			    </tr>
			        <tr>
			       <td scope="col"><img alt="participant" src="imges/om.jpg"></td>
			      <td scope="col"> el baggar	  </td>
			      <td scope="col">omar</td>
			     <td scope="col">Mohammedia</td>      
			      <td scope="col">omarelbaggar@gmail.com</td>
			      <td scope="col">FST-Mohammedia</td>
			      <td scope="col">professeur</td> 
			    </tr>
			        <tr>
			       <td scope="col"><img alt="participant" src="imges/ram.jpg"></td>
			      <td scope="col"> ramdani	  </td>
			      <td scope="col">mohammed</td>
			      <td scope="col">Mohammedia</td>      
			      <td scope="col">ramdani@gmail.com</td>
			      <td scope="col">FST-Mohammedia</td>
			      <td scope="col">professeur</td> 
			    </tr>
		    <tr>
			       <td scope="col"><img alt="participant" src="imges/bra.jpg"></td>
			      <td scope="col"> aksasse	  </td>
			      <td scope="col"> Brahim</td>
			      <td scope="col">errachidia</td>      
			      <td scope="col">aksasse@gmail.com</td>
			      <td scope="col">FST-errachidia</td>
			      <td scope="col">professeur</td> 
			    </tr>
			        <tr>
			       <td scope="col"><img alt="participant" src="imges/azz.jpg"></td>
			      <td scope="col"> boulmakoul	  </td>
			      <td scope="col">Azedine</td>
			      <td scope="col">marrakech</td>      
			      <td scope="col">boulmakoul@gmail.com</td>
			      <td scope="col">FST-Mohammedia</td>
			      <td scope="col">professeur</td> 
			    </tr>
		       <tr>
			       <td scope="col"><img alt="participant" src="imges/ag.png"></td>
			      <td scope="col"> agoujil	  </td>
			      <td scope="col">said</td>
			   <td scope="col">errachidia</td>      
			      <td scope="col">saidagoujil@gmail.com</td>
			      <td scope="col">FST-errachidia</td>
			      <td scope="col">professeur</td>
			    </tr>
		
	        </tbody>
	    </table>
      </div>
    </div>
  </div>
  <div class="card">
    <div class="card-header" id="headingThree">
      <h2 class="mb-0">
        <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
			comité d'organisation
        </button>
      </h2>
    </div>
    <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
      <div class="card-body table-responsive">  
           <table id="example" class="table  table-striped  table-xs  table-bordered dt-responsive nowrap table-borderless" style="width:100%">
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
	             		       <tr>
			      <td scope="col"><img alt="participant" src="imges/la.jpg"></td>
			      <td scope="col"> afraites</td>
			      <td scope="col">lekbir</td>
			      <td scope="col">béni-mellal</td>      
			      <td scope="col">lekbir.afraites@gmail.com</td>
			      <td scope="col">FST-Beni Mellal</td>
			      <td scope="col">professeur</td> 
			    </tr>
			   
		
	        
	          <tr> 
			   <td scope="col"><img alt="participant" src="imges/baslam.jpg"></td>
			      <td scope="col"> Baslam	</td>
			      <td scope="col">Mohamed</td>
			      <td scope="col">beni mellal</td>      
			      <td scope="col">m.baslam@usms.ma</td>
			         <td scope="col">FST-beni mellal</td>
			 <td scope="col">professeur</td>
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/er.jpg"></td>
			      <td scope="col">Erritali	</td>
			      <td scope="col">mohammed</td>
			      <td scope="col">beni mellal</td>      
			      <td scope="col">mederritali@yahoo.fr</td>
				    <td scope="col">FST-beni mellal</td>
				 <td scope="col">professeur</td>
			    </tr>
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/Najlae_Idrissi.jpg"></td>
				      <td scope="col">Idrissi	</td>
				      <td scope="col">najlae</td>
				      <td scope="col">beni mellal</td>      
				      <td scope="col">idrissi.najlae@gmail.com</td>
			         <td scope="col">FST-beni mellal</td>
		        	 <td scope="col">professeur</td>
			    </tr>
			   
	            <tr>
			      <td scope="col"><img alt="participant" src="imges/El_Mourabit_Yousef.jpg"></td>
			      <td scope="col">el mourabite</td>
			      <td scope="col">youssef</td>
			      <td scope="col">beni mellal</td>      
				  <td scope="col">youssef.mourabite@gmail.com</td>
			      <td scope="col">FST-beni mellal</td>
		          <td scope="col">professeur</td> 
			    </tr>
			   <tr>
			      <td scope="col"><img alt="participant" src="imges/saadi.jpg"></td>
			      <td scope="col">saadi</td>
			      <td scope="col">youssef</td>
			      <td scope="col">beni mellal</td>      
				  <td scope="col">youssef.saadi@gmail.com</td>
			      <td scope="col">FST-beni mellal</td>
		          <td scope="col">professeur</td> 
			    </tr>
	       	 
	       		    
	       		    
	  
		 
			    
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/hasan.png"></td>
			      <td scope="col">My El Hassan</td>
			      <td scope="col"> Charaf</td>
			      <td scope="col">kenitra</td>      
			      <td scope="col"> Charaf123@gmail.com</td>
			  	  <td scope="col">FS-kenitra</td>
			      <td scope="col">professeur</td> 
			    </tr>
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/badr.png"></td>
			      <td scope="col"> Badr Eddine </td>
			      <td scope="col">El Mohajir</td>
			      <td scope="col">tetuan</td>      
			      <td scope="col">badreddin@gmail.com</td>
			      <td scope="col">FS-tetuan</td>
			      <td scope="col">profeeseur</td> 
			    </tr>
			   
	            <tr>
			      <td scope="col"><img alt="participant" src="imges/otmanchakour.png"></td>
			      <td scope="col">otmane</td>
			      <td scope="col">chakour</td>
			      <td scope="col">tetouan</td>      
			      <td scope="col">otmanechakour@gmail.com</td>
			      <td scope="col">ensa-tetuan</td>
			      <td scope="col">professeur</td> 
			    </tr>
	       		<tr>    
			      <td scope="col"><img alt="participant" src="imges/abou.jpg"></td>  
			      <td scope="col">abou el majd</td>
			      <td scope="col">Badr</td>
			      <td scope="col">rabat</td>      
			      <td scope="col">badr.abou@gmail.com</td>
			      <td scope="col">FS-rabat</td>
			      <td scope="col">professeur</td> 
			    </tr>
			    <tr>
			       <td scope="col"><img alt="participant" src="imges/ahmadi.jpg"></td>
			      <td scope="col"> Abdessalam </td>
			      <td scope="col">AHMADI</td>
			      <td scope="col">meknes</td>      
			      <td scope="col">ahmadi@gmail.com</td>
			      <td scope="col">ENSAM-meknes</td>
			      <td scope="col">professeur</td> 
			    </tr>
			    	      
			
			      <tr>
			       <td scope="col"><img alt="participant" src="imges/char.jpg"></td>
			      <td scope="col"> Abdelkabir</td>
			      <td scope="col">Charkaoui</td>
			      <td scope="col">settat</td>      
			      <td scope="col">charkaoui@gmail.com</td>
			      <td scope="col">FST-Settat</td>
			      <td scope="col">professeur</td> 
			    </tr>
			 
		 <tr>
			      <td scope="col"><img alt="participant" src="imges/salma.png"></td>
			      <td scope="col">Salma </td>
			      <td scope="col">Azzouzi</td>
			      <td scope="col">kenitra</td>      
			      <td scope="col">Azzouzi@gmail.com</td>
			      <td scope="col">FS-kenitra</td>
			      <td scope="col">professeur</td> 
			    </tr>
	        </tbody>
	    </table>
      </div>
    </div>
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



 
 <!--
 <script>
	$(document).ready(function() {
	    var table = $('#example').DataTable( {
	        lengthChange:true,
	        lengthMenu:[[10,20,50,-1],[10,20,50,"all"]],
	        buttons: [ 'copy', 'excel', 'csv', 'pdf', 'colvis' ]
	    } );
	 
	    table.buttons().container()
	        .appendTo( '#example_wrapper .col-md-6:eq(0)' );
	} );
     </script>  --> 
     <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
     <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.bootstrap4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script> 
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap4.min.js"></script> 
    <script>
	$(document).ready(function() {
	    var table = $('#example').DataTable( {
	        lengthChange: true,

	        lengthMenu:[[7,10,20,50,-1],[7,10,20,50,"all"]],
	        buttons: [ 'copy', 'excel', 'csv', 'pdf']
	    } );
	 
	    table.buttons().container()
	        .appendTo( '#example_wrapper .col-md-6:eq(0)' );
	} );
     </script>
 

</body>
</html>