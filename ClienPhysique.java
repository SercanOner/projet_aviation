package JPAClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TitrePhysique")
public class ClienPhysique extends Client{
	private String prenom;
	
	public ClienPhysique()
	{
		super();
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
