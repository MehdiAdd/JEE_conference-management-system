package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Listener
 *
 */
@Entity
public class Listener implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_listener;
	private String nom;
	private String prenom;
	private String ville;
	private String email;
	private String etablissement;
	private String titre_academique;
	private boolean statut=false;
	@Lob
	private byte [] recu;
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

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public byte[] getRecu() {
		return recu;
	}

	public void setRecu(byte[] recu) {
		this.recu = recu;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	private String montant;
	private static final long serialVersionUID = 1L;

	public Listener() {
		super();
	}   
	

	public Listener(String nom, String prenom, String ville, String email, String etablissement,
			String titre_academique, byte[] recu, String montant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.email = email;
		this.etablissement = etablissement;
		this.titre_academique = titre_academique;
		this.recu = recu;
		this.montant = montant;
	}

	public int getId_listener() {
		return this.id_listener;
	}

	public void setId_listener(int id_listener) {
		this.id_listener = id_listener;
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
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getEtablissement() {
		return this.etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}   
	public String getTitre_academique() {
		return this.titre_academique;
	}

	public void setTitre_academique(String titre_academique) {
		this.titre_academique = titre_academique;
	}
   
}
