package session;

import java.io.File;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;


import javax.ejb.Remote;
import javax.swing.ImageIcon;

import ejb.entity.Comite;
import ejb.entity.Dates;
import ejb.entity.Fichier;
import ejb.entity.Listener;
import ejb.entity.Participant;
import ejb.entity.Session_speciale;
import ejb.entity.Speaker;

@Remote
public interface SessionRemote {

	public Dates ajouterDate(Dates date);
	  public Dates afficherDate(int id);
	  public Dates modifierDate(int id,String d,String nomDate);
	  public List<Dates> listeDates();
	  public List<Listener> listeListenersVerifies();
	  public List<Listener> listeListenersAVerifier();
	  public List<Listener> listeListenersAPayer();
	  public List<Listener> listeListenersPresent();
	  public Listener afficherListener(int id);
	  public Listener ajouterListener(Listener l);
	  public Listener deleteListener(int id);
	  public Listener upDateListener(Listener l);
	  public Dates deleteDate(int id);
	  public Participant afficherParticipant(int id);
	  public List<Participant> listeParticipantsAccepte1();
	  public List<Participant> listeParticipantsAccepte();
	  public List<Participant> listeParticipantsAccepte(Session_speciale s);
	  public List<Participant> listeParticipantsNonAccepte(Session_speciale s);
	  public List<Participant> listeParticipantsNonAccepte();
	  public List<Participant> listeParticipantsAccepteParAdmin();
	  public List<Participant> listeParticipantsNonAccepteParAdmin();
	  public List<Participant> listeParticipantPresent();
	  public Participant upDateParticipant(Participant l);
	  public Participant refuserParticipant(int Id);
	  public Participant deleteParticipant(int Id);
	  public Participant accepterParticipant(int id);
	  public Session_speciale accepterSession(int id,byte[] b);
	  public List<Session_speciale> listeSessionsAccepte();
	  public List<Session_speciale> listeSessionsNonAccepte();
	  public Session_speciale afficherSession(int id);
	  public List<Session_speciale> connectToSession(String nom,String password);
	  public Session_speciale deleteSession(int id);
	  public Session_speciale modifierProfil(Session_speciale s);
	  public Session_speciale ajouterSession(Session_speciale s);
	  public ImageIcon getImage(Session_speciale s);
	  public Listener confirmerListener(int id);
	  public Listener AverifierListener(int id);
	  public Fichier uploadFichier(Fichier f);
	  public Fichier downloadFichier(String type);
	  public Fichier deletefichier(String type);
	  public Listener saveAttestationListener(int id,byte[] in);
	  public Participant saveAttestationParticipant(int id,byte[] in);
	  
	  public List<Comite> listeComites();
	  public List<Speaker> listeSpeaker();
	  public Comite afficherComite(int id);
	  public Speaker afficherSpeaker(int id);
	  public Comite upDateComite(Comite c);
	  public Speaker upDateSpeaker(Speaker s);
	  public Comite saveAttestationComite(int id,byte[] in);
	  public Speaker saveAttestationSpeaker(int id,byte[] in);
	  public List<Comite> listeComitePresent();
	  public List<Speaker> listeSpeakerPresent();
	
}
