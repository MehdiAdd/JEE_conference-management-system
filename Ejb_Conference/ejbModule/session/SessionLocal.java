package session;

import java.sql.Date;
import java.util.List;

import javax.ejb.Local;
import javax.swing.ImageIcon;

import ejb.entity.Dates;
import ejb.entity.Fichier;
import ejb.entity.Listener;

import ejb.entity.Participant;
import ejb.entity.Session_speciale;
@Local
public interface SessionLocal {
	public Dates ajouterDate(Dates date);
	  public Dates afficherDate(int id);
	  public Dates modifierDate(int id,String d,String nomDate);
	  public List<Dates> listeDates();
	  public Listener afficherListener(int id);
	  public Listener ajouterListener(Listener l);
	  public Participant ajouterParticipant(Participant s);
	  public Participant afficherParticipant(int id);
	  public List<Participant> listeParticipantsAccepte(Session_speciale s);
	  public List<Participant> listeParticipantsAccepte();
	  public List<Participant> listeParticipantsAccepte1();
	  public List<Participant> listeParticipantsAccepteParAdmin();
	  //public Resume ajouterResume(Resume r);
	  public Session_speciale ajouterSession(Session_speciale s);
	  public Session_speciale afficherSession(int id);
	  public ImageIcon getImage(Session_speciale s);
	  public List<Session_speciale> listeSessionsAccepte();
	  public Fichier downloadFichier(String type);
}
