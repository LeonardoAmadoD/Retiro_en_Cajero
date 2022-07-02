import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Retiro {
	private static int cr = 1;
	private int cod_retiro;
	private Cajero cajero;
	private LocalDate fecha;
	private LocalTime hora;
	private Tarjeta tarjeta;
	private float retirado;
	private float saldo_restante;
	
	public Retiro(Cajero cajero, LocalDate fecha, LocalTime hora, Tarjeta tarjeta, float retirado) {
		this.setCod_retiro();
		this.cajero = cajero;
		this.fecha = LocalDate.now();
		this.hora = LocalTime.now().truncatedTo(ChronoUnit.MINUTES);
		this.tarjeta = tarjeta;
		this.retirado = retirado;
		this.retirar();
	}

	public int getCod_retiro() {
		return cod_retiro;
	}

	private void setCod_retiro() {
		this.cod_retiro = 1000 + Retiro.cr;
		Retiro.cr += 1;
	}

	public Cajero getCajero() {
		return this.cajero;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public LocalTime getHora() {
		return this.hora;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public float getSaldo_restante() {
		return this.saldo_restante;
	}

	@Override
	public String toString() {
		String str = "\n";
		str += "-------------\t" + this.cajero.getBanco().getNombre() + "\t-----------------\n";
		str += this.fecha + "\t  \t" + this.hora;
		str += "\nCajero:\t \t \t" + this.cajero.getCod_cajero();
		str += "\nCodigo:\t \t \t" + this.cod_retiro;
		str += "\nTarjeta:\t  \t" + this.tarjeta.getNum_tarjeta();
		str += "\nCliente:\t  \t" + this.tarjeta.getCuenta().getCliente().toString();
		str += "\nMonto Retirado:\t  \t" + this.tarjeta.getCuenta().getMoneda().getSimbolo() + " " + this.retirado;
		str += "\nSaldo Restante:\t  \t" + this.tarjeta.getCuenta().getMoneda().getSimbolo() + " " + this.saldo_restante;
		return str;
	}
	
	private void retirar() {
		this.tarjeta.getCuenta().setSaldoRetiro(this.retirado);
		this.saldo_restante = this.tarjeta.getCuenta().getSaldo_disponible();
	}
	
}
