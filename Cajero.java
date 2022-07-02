
public class Cajero {
	private String cod_cajero;
	private Banco banco;
	private String direccion;
	
	public Cajero(String cod_cajero, Banco banco, String direccion) {
		this.cod_cajero = cod_cajero;
		this.banco = banco;
		this.direccion = direccion;
	}

	public String getCod_cajero() {
		return cod_cajero;
	}

	public Banco getBanco() {
		return banco;
	}

	public String getDireccion() {
		return direccion;
	}
	
}
