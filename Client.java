package JPAClass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "titre", discriminatorType = DiscriminatorType.STRING, length = 10)
public class abstract Client {
		
		@Id @GeneratedValue
		private long id_Client;
		private String nom;
		private int  numeroTel;
		private int numeroFax;
		private String email;
		
		public Client()
		{
			
		}
		public long getId_Client() {
			return id_Client;
		}
		public void setId_Client(long id_Client) {
			this.id_Client = id_Client;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public int getNumeroTel() {
			return numeroTel;
		}
		public void setNumeroTel(int numeroTel) {
			this.numeroTel = numeroTel;
		}
		public int getNumeroFax() {
			return numeroFax;
		}
		public void setNumeroFax(int numeroFax) {
			this.numeroFax = numeroFax;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
