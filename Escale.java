package JPAClass;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Escale {
	@Id
	@GeneratedValue
	private Long id_Escale;
	private Date heureDepart;
	private Date heureArrivee;
	@ManyToOne
	@JoinColumn(name="aeroport_Id")
	private Aeroport aeroports;
	
	@ManyToOne
	@JoinColumn(name="vol_Id")
	private Vol vols;
	
	public Escale(){

	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

	public Aeroport getAeroports() {
		return aeroports;
	}

	public void setAeroports(Aeroport aeroports) {
		this.aeroports = aeroports;
	}

	public Vol getVols() {
		return vols;
	}

	public void setVols(Vol vols) {
		this.vols = vols;
	}

	public Long getId_Escale() {
		return id_Escale;
	}

	public void setId_Escale(Long id_Escale) {
		this.id_Escale = id_Escale;
	}
	

}
