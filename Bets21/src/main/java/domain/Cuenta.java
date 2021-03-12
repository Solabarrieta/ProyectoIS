package domain;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuenta {
	@Id
	String usuario;
	String password;
	boolean admin;
	
	public Cuenta(String usuario, String password, Boolean admin) {
		this.admin=admin;
		this.password=password;
		this.usuario=usuario;
	}

	public Cuenta(String login, String password) {
		this.usuario=login;
		this.password=password;
		admin=false;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
