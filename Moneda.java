
public class Moneda {
	private int cod_moneda;
	private String descripcion;
	private String simbolo;
	
	public Moneda(int cod_moneda, String descripcion, String simbolo) {
		this.cod_moneda = cod_moneda;
		this.descripcion = descripcion;
		this.simbolo = simbolo;
	}
	
	public int getCod_moneda() {
		return cod_moneda;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getSimbolo() {
		return this.simbolo;
	}

}
