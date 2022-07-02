import java.time.LocalDate;

public class Cambio {
	Moneda moneda;
	LocalDate fecha;
	float compra;
	float venta;
	
	public Cambio(Moneda moneda, float compra, float venta) {
		this.moneda = moneda;
		this.compra = compra;
		this.venta = venta;
		this.fecha = LocalDate.now();
	}

	public float getCompra() {
		return this.compra;
	}

	public void setCompra(float compra) {
		this.compra = compra;
	}

	public float getVenta() {
		return this.venta;
	}

	public void setVenta(float venta) {
		this.venta = venta;
	}

	public Moneda getMoneda() {
		return this.moneda;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
}
