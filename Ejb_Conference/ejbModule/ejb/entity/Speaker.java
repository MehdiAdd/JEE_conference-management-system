package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Speaker
 *
 */
@Entity

public class Speaker implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_speaker;
	private String nom;
	private String prenom;
	private static final long serialVersionUID = 1L;
	@Column(columnDefinition = "boolean default false")
	private boolean presence;
	@Lob
	private byte[] attestation;
	public Speaker() {
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
   
}
