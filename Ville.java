package JPAClass;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Ville {
	
	@ManyToOne
	@JoinColumn(name="airport_id")
	private Aeroport aeroport;
	
	@Id
	@GeneratedValue
	private long id_Ville;
	private String nom;
	
	public Ville(){
		
	}

	
	public Ville(Aeroport aeroport, long id_Ville, String nom) {
		super();
		this.aeroport = aeroport;
		this.id_Ville = id_Ville;
		this.nom = nom;
	}


	public long getId_Ville() {
		return id_Ville;
	}

	public void setId_Ville(long id_Ville) {
		this.id_Ville = id_Ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	
}
