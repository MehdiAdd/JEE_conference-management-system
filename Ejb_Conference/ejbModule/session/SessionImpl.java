package session;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Blob;
import java.sql.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.ImageIcon;

import ejb.entity.Comite;
import ejb.entity.Dates;
import ejb.entity.Fichier;
import ejb.entity.Listener;

import ejb.entity.Participant;
import ejb.entity.Session_speciale;
import ejb.entity.Speaker;
import sun.misc.IOUtils;
@Stateless(name="SI")
public class SessionImpl implements SessionRemote,SessionLocal {

	  @PersistenceContext
		EntityManager em;
	  public Dates ajouterDate(Dates date){
		  em.persist(date);
		   return date;
	  }
	  public Dates afficherDate(int id) {
		  Dates date=em.find(Dates.class,id);
		  return date;
	  }
	  public Dates modifierDate(int id,String d,String nomDate){
		  Dates date=em.find(Dates.class, id);
		  
		  date.setDate(d);
		  date.setNomDate(nomDate);
		  em.merge(date);
		  return date;
	  }
	  public List<Dates> listeDates() {
			Query query=em.createQuery("select d from Dates d ");
			return query.getResultList();
		}
		
	  public List<Listener> listeListenersVerifies() {
		Query query=em.createQuery("select l from Listener l where l.statut = true order by l.nom   ");
		return query.getResultList();
	    }
	  public List<Listener> listeListenersAVerifier()
	  {
			Query query=em.createQuery("select l from Listener l where l.statut = false and l.montant is not null and l.recu is not null");
			return query.getResultList();
		    }
	  public List<Listener> listeListenersAPayer()
		  {
				Query query=em.createQuery("select l from Listener l where l.statut = false and (montant is null or l.recu is null)");
				return query.getResultList();
			    }
	  public List<Listener> listeListenersPresent(){
		  Query query=em.createQuery("select l from Listener l where l.presence = true order by l.nom   ");
			return query.getResultList();
		  
	  }
	  public Listener afficherListener(int id) {
		  Listener l=em.find(Listener.class, id);
		  return l;
	  }
	  public Listener confirmerListener(int id) {
		  Listener l=afficherListener(id);
		  l.setStatut(true);
		  em.merge(l);
		  return l;
	  }
	  public Listener AverifierListener(int id) {
		  Listener l=afficherListener(id);
		  l.setStatut(false);
		  em.merge(l);
		  return l;
	  }
	  public Listener ajouterListener(Listener l){
		em.persist(l);
		return l;
	    }
	  public Listener upDateListener(Listener l) {
		  em.merge(l);
		  return l;
	  }
	  public Listener saveAttestationListener(int id,byte[] in) {
		 Listener l=afficherListener(id);
		 // byte[] targetArray = IOUtils.toByteArray(in);
		   
				
				l.setAttestation(in);
				l.setPresence(true);
				em.merge(l);
				return l;
	  }
	  public Participant saveAttestationParticipant(int id,byte[] in) {
		  Participant l=afficherParticipant(id);
			 // byte[] targetArray = IOUtils.toByteArray(in);
			   
					
					l.setAttestation(in);
					l.setPresence(true);
					em.merge(l);
					return l;
	  }
	@Override
	public Listener deleteListener(int id) {
		Listener l=afficherListener(id);
		em.remove(l);
		return l;
	}
	@Override
	public Dates deleteDate(int id) {
		Dates d=afficherDate(id);
		em.remove(d);
		return d;
	}
	@Override
	public Participant ajouterParticipant(Participant s) {
		em.persist(s);
		return s;
	}
	  public Participant afficherParticipant(int id) {
		  Participant l=em.find(Participant.class, id);
		  return l;
	  }
		@Override
		public List<Participant> listeParticipantsAccepte1() {
			Query query=em.createQuery("select l from Participant l where  l.status = true and l.refusResponsableSession = false   order by l.session,l.nom ");
			
			return query.getResultList();
		}
		public List<Participant> listeParticipantsNonAccepte(){
       Query query=em.createQuery("select l from Participant l where  l.status = false order by l.session,l.nom ");
			
			return query.getResultList();
		}
	@Override
	public List<Participant> listeParticipantsAccepte(Session_speciale s) {
		Query query=em.createQuery("select l from Participant l where l.session=:X and l.status = true and l.refusResponsableSession = false ");
		query.setParameter("X",s.getTitre_session());
		return query.getResultList();
	}
	@Override
	public List<Participant> listeParticipantsNonAccepte(Session_speciale s) {
		Query query=em.createQuery("select l from Participant l where l.session=:X and l.status = false and l.refusResponsableSession = false");
		
		query.setParameter("X",s.getTitre_session());
		return query.getResultList();
	}
	
	 public List<Participant> listeParticipantsAccepteParAdmin(){
		 Query query=em.createQuery("select l from Participant l where l.status = true and l.refusResponsableSession = true ");
			
			return query.getResultList();
	 }
	 
	 public List<Participant> listeParticipantsNonAccepteParAdmin(){
		 Query query=em.createQuery("select l from Participant l where l.status = false and l.refusResponsableSession = true ");
			
			return query.getResultList();
	 }
	 
	@Override
	public List<Participant> listeParticipantsAccepte() {
		Query query=em.createQuery("select l from Participant l where  l.status = true  order by l.session,l.nom");
		
		return query.getResultList();
	}
	public List<Participant> listeParticipantPresent(){
		Query query=em.createQuery("select l from Participant l where  l.presence = true order by l.session,l.nom ");
		
		return query.getResultList();
	}
	public Participant upDateParticipant(Participant l) {
		
		 em.merge(l);
		  return l;
	}
	@Override
	public Participant deleteParticipant(int Id) {
		Participant l=afficherParticipant(Id);
		em.remove(l);
		return l;
	}
	
	public Participant refuserParticipant(int Id) {
		Participant l=afficherParticipant(Id);
		l.setRefusResponsableSession(true);
		em.merge(l);
		return l;
	}
	
	@Override
	public Participant accepterParticipant(int id) {
		Participant l=afficherParticipant(id);
		l.setStatus(true);
		em.merge(l);
		return l;
	}

	@Override
	public Session_speciale ajouterSession(Session_speciale s) {
		/*BufferedImage bImage;
		try {
			
			 BufferedImage bufferedImage = ImageIO.read(getClass().getResource("/images/compte.png"));

			 // get DataBufferBytes from Raster
			 WritableRaster raster = bufferedImage .getRaster();
			 DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
			
	      byte [] b = data.getData();
	      s.setProfilImage(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
		em.persist(s);
		return s;
	}
	  public Session_speciale afficherSession(int id) {
		  Session_speciale s=em.find(Session_speciale.class, id);
		  return s;
	  }
	@Override
	public Session_speciale accepterSession(int id,byte[] b) {
		Session_speciale s=afficherSession(id);
		s.setStatut(true);
		s.setProfilImage(b);
		em.merge(s);
		return s;
	}
	@Override
	public List<Session_speciale> listeSessionsAccepte() {
    Query query=em.createQuery("select s from Session_speciale s where s.statut = true ");
		
		return query.getResultList();
	}
	@Override
	public List<Session_speciale> listeSessionsNonAccepte() {
        Query query=em.createQuery("select s from Session_speciale s where s.statut = false ");
		
		return query.getResultList();
	}
	@Override
	public List<Session_speciale> connectToSession(String email, String password) {
		 Query query=em.createQuery("select s from Session_speciale s where s.email=:X and s.password =:Y and s.statut = true ");
		 
			query.setParameter("X", email);
			query.setParameter("Y", password);
			List<Session_speciale> list=query.getResultList();
			for(Session_speciale s:list) {
			System.out.println(s.getNom_resp_session());
			}
			return list;
	}
	@Override
	public Session_speciale deleteSession(int id) {
		Session_speciale s=afficherSession(id);
		em.remove(s);
		return s;
	}
	@Override
	public Session_speciale modifierProfil(Session_speciale s) {
		em.merge(s);
		return s;
	}
    public ImageIcon getImage(Session_speciale s) {
    	Session_speciale d=afficherSession(12);
    /*	try {
    		InputStream input=new ByteArrayInputStream(d.getProfilImage());
    		
    		BufferedImage imag=ImageIO.read(input);
    		 File outputfile = new File("saved.png");
    		
    		 if(input==null) System.out.println("nuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuull2");
			ImageIO.write(imag,"png",outputfile);
			ImageIcon img=new ImageIcon(getClass().getResource("saved.png"));
			return img;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("nooooooooooooooooooooooooooooooooooooooooooooo");
			return null;
    	/*System.out.println(d.getProfilImage().length+"llllllllllllllllllllllllllllllllllll");
    	        try {  
    	        	File file=new File("C:\\Users\\mehdi\\OneDrive\\Desktop\\sample_image.png");
        	        FileOutputStream fos=new FileOutputStream(file);
        	        byte b[]=d.getProfilImage();
        	        System.out.println(b.length+"llllllllllllllllllllllllllllllllllll");
					fos.write(b);
					 fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
    	       
    	        ImageIcon img=new ImageIcon(s.getProfilImage());
    			return img;
    	        
		}
	@Override
	public Fichier uploadFichier(Fichier f) {
		deletefichier(f.getType());
		em.persist(f);
		return f;
	}
	@Override
	public Fichier downloadFichier(String type) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select f from Fichier f where f.type =:X ");
		query.setParameter("X", type);
		if(query.getResultList().size()==0) {
			return null;
		}
		return (Fichier)query.getSingleResult();
	}
	public Fichier deletefichier(String type) {
		Query query=em.createQuery("select fich from Fichier fich where fich.type =:X ");
		
		query.setParameter("X", type);
		List<Fichier> list=query.getResultList();
		if(list.size()>0) {
		Fichier r=(Fichier)query.getResultList().get(0);
		if(r!=null)
		em.remove(r);
		return r;
		}
		return null;
	}
	@Override
	public List<Comite> listeComites() {
		 Query query=em.createQuery("select s from Comite s  order by s.nom  ");
			
			return query.getResultList();
	}
	@Override
	public List<Speaker> listeSpeaker() {
		 Query query=em.createQuery("select s from Speaker s order by s.nom");
			
			return query.getResultList();
	}
	@Override
	public Comite afficherComite(int id) {
		Comite s=em.find(Comite.class, id);
		  return s;
	}
	@Override
	public Speaker afficherSpeaker(int id) {
		Speaker s=em.find(Speaker.class, id);
		  return s;
	}
	@Override
	public Comite upDateComite(Comite c) {
		em.merge(c);
		return c;
	}
	@Override
	public Speaker upDateSpeaker(Speaker s) {
		em.merge(s);
		return s;
	}
	@Override
	public Comite saveAttestationComite(int id, byte[] in) {
		 Comite l=afficherComite(id);
		 // byte[] targetArray = IOUtils.toByteArray(in);
		   
				
				l.setAttestation(in);
				l.setPresence(true);
				em.merge(l);
				return l;
	}
	@Override
	public Speaker saveAttestationSpeaker(int id, byte[] in) {
		Speaker l=afficherSpeaker(id);
		 // byte[] targetArray = IOUtils.toByteArray(in);
		   
				
				l.setAttestation(in);
				l.setPresence(true);
				em.merge(l);
				return l;
	}
	@Override
	public List<Comite> listeComitePresent() {
      Query query=em.createQuery("select l from Comite l where  l.presence = true order by l.nom ");
		
		return query.getResultList();
	}
	@Override
	public List<Speaker> listeSpeakerPresent() {
		 Query query=em.createQuery("select l from Speaker l where  l.presence = true order by l.nom ");
			
			return query.getResultList();
	}
	

	
	/*public Resume ajouterResume(Resume r) {
		Query query = em.createQuery("from Participants order by id_speaker DESC");
		query.setMaxResults(1);
		Participants last = (Participants)query.getSingleResult();
		r.setSp(last);
		System.out.println(r.getSp().getNom());
		System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"+last.getId_speaker());
		r.setId_resume(last.getId_speaker());
		em.persist(r);
		return r;
	}*/
}
