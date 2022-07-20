package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: comite
 *
 */
@Entity

public class Comite implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_comite;
	

	private String nom;
	private String prenom;
	private String typeComite;
	@Column(columnDefinition = "boolean default false")
	private boolean presence;
	@Lob
	private byte[] attestation;
	private static final long serialVersionUID = 1L;

	public Comite() {
		super();
	}   
	public int getId_comite() {
		return this.id_comite;
	}

	public void setId_comite(int id_comite) {
		this.id_comite = id_comite;
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
	public String getTypeComite() {
		return this.typeComite;
	}

	public void setTypeComite(String typeComite) {
		this.typeComite = typeComite;
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
