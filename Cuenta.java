
public class Cuenta {
	private Long num_cuenta;
	private Banco banco;
	private Moneda moneda;
	private Cliente cliente;
	private float saldo_contable;
	private float saldo_disponible;
	private int clave;
	private String tipo;
	private  float tasa_interes;
	
	public Cuenta(Long num_cuenta, Banco banco, Moneda moneda, Cliente cliente, float saldo_contable,
			float saldo_disponible, int clave, String tipo, float tasa_interes) {
		this.num_cuenta = num_cuenta;
		this.banco = banco;
		this.moneda = moneda;
		this.cliente = cliente;
		this.saldo_contable = saldo_contable;
		this.saldo_disponible = saldo_disponible;
		this.clave = clave;
		this.tipo = tipo;
		this.tasa_interes = tasa_interes;
	}

	public Long getNum_cuenta() {
		return this.num_cuenta;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public Moneda getMoneda() {
		return this.moneda;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public float getSaldo_contable() {
		return this.saldo_contable;
	}

	public float getSaldo_disponible() {
		return this.saldo_disponible;
	}

	public int getClave() {
		return this.clave;
	}

	public String getTipo() {
		return this.tipo;
	}

	public float getTasa_interes() {
		return this.tasa_interes;
	}

	
	public void setSaldoRetiro(float retiro) {
		this.saldo_contable -= retiro;
		this.saldo_disponible -= retiro;
	}

	
	public void setSaldoDeposito(float deposito) {
		this.saldo_contable += deposito;
		this.saldo_disponible += deposito;
	}
	
}
