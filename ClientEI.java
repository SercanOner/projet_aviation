package JPAClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TitrePhysique")
public class ClientEI extends ClientMoral{

	private String prenom;
	
	
	
	public ClientEI(){	
	}

	
	
	
	public ClientEI(String prenom) {
		super();
		this.prenom = prenom;
	}




	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
