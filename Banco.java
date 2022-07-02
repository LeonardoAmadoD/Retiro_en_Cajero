
public class Banco {
	private int cod_banco;
	private String nombre;
	private int telefono;
	private String web;
	
	public Banco(int cod_banco, String nombre, int telefono, String web) {
		this.cod_banco = cod_banco;
		this.nombre = nombre;
		this.telefono = telefono;
		this.web = web;
	}

	public int getCod_banco() {
		return this.cod_banco;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
}
