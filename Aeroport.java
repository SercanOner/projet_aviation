package JPAClass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Aeroport {
	 @OneToMany(mappedBy="aeroport")
	private List<Ville> villes = new ArrayList<>();
	 
	 @OneToMany(mappedBy="aeroports")
	 private List<Escale>escales=new ArrayList<>();
	
	 @Id
	 @GeneratedValue
	private Long id_Aeroport;
	private String nom_Aeroport;
	@Version
	private int version;
	
	
	
	public Aeroport() {
		super();
	}
	public Aeroport(List<Ville> villes, long id_Aeroport, String nom_Aeroport) {
		super();
		this.villes = villes;
		this.id_Aeroport = id_Aeroport;
		this.nom_Aeroport = nom_Aeroport;
	}
	public long getId_Aeroport() {
		return id_Aeroport;
	}
	public void setId_Aeroport(long id_Aeroport) {
		this.id_Aeroport = id_Aeroport;
	}
	public String getNom_Aeroport() {
		return nom_Aeroport;
	}
	public void setNom_Aeroport(String nom_Aeroport) {
		this.nom_Aeroport = nom_Aeroport;
	}
	public List<Ville> getVilles() {
		return villes;
	}
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	public List<Escale> getEscales() {
		return escales;
	}
	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public void setId_Aeroport(Long id_Aeroport) {
		this.id_Aeroport = id_Aeroport;
	}

	
}
