package JPAClass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "titre", discriminatorType = DiscriminatorType.STRING, length = 10)
public abstract class Client {
		
	
		@EmbeddedId
		private Adresse id;
	
		private Long id_Client;
		private String nom;
		private int  numeroTel;
		private int numeroFax;
		private String email;
		
		
		
		@OneToMany(mappedBy="client")
		private Reservation reservation;
		
		
		
		@OneToOne
		@JoinColumn(name="id_Login")
		private Login login;
		
		
		public Client()
		{
			
		}
		
		
		
		



		


		public Client(Adresse id, Long id_Client, String nom, int numeroTel, int numeroFax, String email,
				Reservation reservation, Login login) {
			super();
			this.id = id;
			this.id_Client = id_Client;
			this.nom = nom;
			this.numeroTel = numeroTel;
			this.numeroFax = numeroFax;
			this.email = email;
			this.reservation = reservation;
			this.login = login;
		}












		public Adresse getId() {
			return id;
		}





		public void setId(Adresse id) {
			this.id = id;
		}





		public Long getId_Client() {
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










		public Reservation getReservation() {
			return reservation;
		}










		public void setReservation(Reservation reservation) {
			this.reservation = reservation;
		}










		public Login getLogin() {
			return login;
		}










		public void setLogin(Login login) {
			this.login = login;
		}
		
		
		
		
}
