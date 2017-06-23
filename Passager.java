
package JPAClass;

import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Passager {
	
	
	@EmbeddedId
	private Adresse id;
	
	private long id_Passager;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy="passager")
	private Reservation reservation;
	
	
	
	
	

	
	public Passager(){
		
	}
	
	
	





	public Passager(Adresse id, long id_Passager, String nom, String prenom, Reservation reservation) {
		super();
		this.id = id;
		this.id_Passager = id_Passager;
		this.nom = nom;
		this.prenom = prenom;
		this.reservation = reservation;
	}








	public long getId_Passager() {
		return id_Passager;
	}

	public void setId_Passager(long id_Passager) {
		this.id_Passager = id_Passager;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Reservation getReservation() {
		return reservation;
	}




	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}








	public Adresse getId() {
		return id;
	}








	public void setId(Adresse id) {
		this.id = id;
	}
	
	
	
	
	
	
}
