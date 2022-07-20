package ejb.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Session_speciale
 *
 */
@Entity
public class Session_speciale implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Session_speciale() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private int id_session;
    private String titre_session;
    private String nom_resp_session;
    private String prenom_resp_session;
    private String password;
    private String email;
    private String etablissement;
    private String titreAcadimique;
    private String interet;
    private boolean statut=false;
    @Lob
    private byte[] profilImage;
    
    
    
    
    public byte[] getProfilImage() {
		return profilImage;
	}

	public void setProfilImage(byte[] profilImage) {
		this.profilImage = profilImage;
	}

	public String getInteret() {
		return interet;
	}

	public void setInteret(String interet) {
		this.interet = interet;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public Session_speciale(String nom_resp_session, String prenom_resp_session, String password, String email) {
		super();
		this.nom_resp_session = nom_resp_session;
		this.prenom_resp_session = prenom_resp_session;
		this.password = password;
		this.email = email;
	}

	public Session_speciale(String titre_session, String nom_resp_session, String prenom_resp_session, 
			String email, String password, String etablissement, String titreAcadimique,String interet) {
		super();
		this.titre_session = titre_session;
		this.nom_resp_session = nom_resp_session;
		this.prenom_resp_session = prenom_resp_session;
		this.password = password;
		this.email = email;
		this.etablissement = etablissement;
		this.titreAcadimique = titreAcadimique;
		this.interet=interet;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getTitreAcadimique() {
		return titreAcadimique;
	}

	public void setTitreAcadimique(String titreAcadimique) {
		this.titreAcadimique = titreAcadimique;
	}

	public String getPrenom_resp_session() {
		return prenom_resp_session;
	}

	public void setPrenom_resp_session(String prenom_resp_session) {
		this.prenom_resp_session = prenom_resp_session;
	}

	
    

public int getId_session() {
		return id_session;
	}

	public void setId_session(int id_session) {
		this.id_session = id_session;
	}

	public String getTitre_session() {
		return titre_session;
	}

	public void setTitre_session(String titre_session) {
		this.titre_session = titre_session;
	}

	public String getNom_resp_session() {
		return nom_resp_session;
	}

	public void setNom_resp_session(String nom_resp_session) {
		this.nom_resp_session = nom_resp_session;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

 

}
