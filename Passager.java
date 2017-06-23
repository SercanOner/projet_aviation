package JPAClass;

public class Passager {
	
	@Id @GeneratedValue
	private long id_Passager;
	private String nom;
	private String prenom;
	
	public Passager(){
		
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
	
	
	
}
