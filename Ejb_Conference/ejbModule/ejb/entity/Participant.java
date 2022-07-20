package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Speakers
 *
 */
@Entity
public class Participant implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_speaker;
	private String nom;
	private String prenom;
	private String ville;
	private String titre;
	private String session;
	@Lob
	private byte[] resume;
	 boolean status=false;
	 boolean refusResponsableSession=false;
	 private boolean presence=false;
	 @Lob
	 private byte[] attestation;
	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}

	public byte[] getAttestation() {
		return attestation;
	}

	public void setAttestation(byte[] attestation) {
		this.attestation = attestation;
	}

	public boolean isRefusResponsableSession() {
		return refusResponsableSession;
	}

	public void setRefusResponsableSession(boolean refusResponsableSession) {
		this.refusResponsableSession = refusResponsableSession;
	}

	public Participant(String nom, String prenom, String ville, String etablissement, String email,
			String titre_academique,String titre,String session,byte[] resume) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.etablissement = etablissement;
		this.email = email;
		this.titre_academique = titre_academique;
		this.titre=titre;
		this.session=session;
		this.resume=resume;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public byte[] getResume() {
		return resume;
	}
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	private String etablissement;
	private String email;
	private String titre_academique; 
	private static final long serialVersionUID = 1L;

	public Participant() {
		super();
	}   
	public int getId_speaker() {
		return this.id_speaker;
	}

	public void setId_speaker(int id_speaker) {
		this.id_speaker = id_speaker;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}   
	public String getEtablissement() {
		return this.etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTitre_academique() {
		return this.titre_academique;
	}

	public void setTitre_academique(String titre_academique) {
		this.titre_academique = titre_academique;
	}
   
}
