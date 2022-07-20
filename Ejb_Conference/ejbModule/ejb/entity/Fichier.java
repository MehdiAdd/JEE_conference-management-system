package ejb.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Fichier  implements Serializable  {
	   
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id_fichier;
		private String nom;
		private String type;
	

		@Lob
		private byte [] fichier;
		
		public Fichier() {}
		
		public int getId_fichier() {
			return id_fichier;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		public void setId_fichier(int id_fichier) {
			this.id_fichier = id_fichier;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public byte[] getFichier() {
			return fichier;
		}

		public void setFichier(byte[] fichier) {
			this.fichier = fichier;
		}

		public Fichier(String nom, byte[] fichier) {
			super();
			this.nom = nom;
			this.fichier = fichier;
		}
}
