package ejb.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Dates
 *
 */
@Entity
public class Dates implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_date;
	private String date;
	private String nomDate;
	private static final long serialVersionUID = 1L;

	public Dates() {
		super();
	} 
	
	public Dates( String date, String nomDate) {
		super();
		
		this.date = date;
		this.nomDate = nomDate;
	}

	public int getId_date() {
		return this.id_date;
	}

	public void setId_date(int id_date) {
		this.id_date = id_date;
	}   
	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}   
	public String getNomDate() {
		return this.nomDate;
	}

	public void setNomDate(String nomDate) {
		this.nomDate = nomDate;
	}
   
}
