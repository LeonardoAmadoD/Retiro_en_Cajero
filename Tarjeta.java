import java.time.LocalDate;

public class Tarjeta {
	private Long num_tarjeta;
	private LocalDate vencimiento;
	private int cvv;
	private int clave;
	private Cuenta cuenta;
	
	public Tarjeta(Long num_tarjeta, LocalDate vencimiento, int cvv, int clave, Cuenta cuenta) {
		this.num_tarjeta = num_tarjeta;
		this.vencimiento = vencimiento;
		this.cvv = cvv;
		this.clave = clave;
		this.cuenta = cuenta;
	}

	public int getClave() {
		return this.clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public Long getNum_tarjeta() {
		return this.num_tarjeta;
	}

	public LocalDate getVencimiento() {
		return this.vencimiento;
	}

	public int getCvv() {
		return this.cvv;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

}
