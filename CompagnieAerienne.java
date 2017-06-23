package JPAClass;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompagnieAerienne {
	
	@Id 
	@GeneratedValue
	private Long id_CompagnieAerienne;
	private String nom;
	
	@OneToMany(mappedBy="compagnieAerienne")
	private List<CompagnieAerienneVol> compagnieAerienneVol = new ArrayList<>();
	
	public CompagnieAerienne(){
		
	}
	public long getId_CompagnieAerienne() {
		return id_CompagnieAerienne;
	}
	public void setId_CompagnieAerienne(long id_CompagnieAerienne) {
		this.id_CompagnieAerienne = id_CompagnieAerienne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<CompagnieAerienneVol> getCompagnieAerienneVol() {
		return compagnieAerienneVol;
	}
	public void setCompagnieAerienneVol(List<CompagnieAerienneVol> compagnieAerienneVol) {
		this.compagnieAerienneVol = compagnieAerienneVol;
	}
	public void setId_CompagnieAerienne(Long id_CompagnieAerienne) {
		this.id_CompagnieAerienne = id_CompagnieAerienne;
	}
	
	

}

