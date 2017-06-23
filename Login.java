package JPAClass;

public class Login {
	
	private long id_Login;
	private String login;
	private String motDePasse;
	private boolean admin;
	
	public Login() {
		
	}

	public long getId_Login() {
		return id_Login;
	}

	public void setId_Login(long id_Login) {
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
	
}
