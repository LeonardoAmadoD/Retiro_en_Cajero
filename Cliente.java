
public class Cliente {
	private int cod_cliente;
	private ID tipoID;
	private int numID;
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Cliente(int cod_cliente, ID tipoID, int numID, String nombre, String apellido, String direccion) {
		this.cod_cliente = cod_cliente;
		this.tipoID = tipoID;
		this.numID = numID;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCod_cliente() {
		return this.cod_cliente;
	}

	public ID getTipoID() {
		return this.tipoID;
	}

	public int getNumID() {
		return this.numID;
	}

	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}
	
	
}
