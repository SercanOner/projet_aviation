package JPAClass;

import javax.persistence.OneToOne;

public class Login {
	
	private Long id_Login;
	private String login;
	private String motDePasse;
	private boolean admin;
	
	
	@OneToOne(mappedBy="login")
	private Client client;
	
	
	
	public Login() {
		
	}
	
	

	public Login(Long id_Login, String login, String motDePasse, boolean admin, Client client) {
		super();
		this.id_Login = id_Login;
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
		this.client = client;
	}



	public Long getId_Login() {
		return id_Login;
	}

	public void setId_Login(Long id_Login) {
		this.id_Login = id_Login;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
