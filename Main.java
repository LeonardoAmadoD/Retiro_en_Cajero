import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Banco b1 = new Banco(101,"BCP",935876221,"www.bcp.com");
		Banco b2 = new Banco(102,"Interbank",945278481,"www.interbank.com");
		Banco b3 = new Banco(103,"Scotiabank",966721267,"www.scotiabank.com");
		
		ID i1 = new ID(1, "DNI");
		ID i4 = new ID(4, "Carnet de Extranjeria");
		ID i6 = new ID(6, "RUC");
		ID i7 = new ID(7, "Pasaporte");
		
		Moneda m1 = new Moneda(1, "Nuevo Sol", "S/.");
		Moneda m2 = new Moneda(2, "Dolar", "$");
		Moneda m3 = new Moneda(3, "Euro", "€");
		
		Cambio c1 = new Cambio(m1,1,1);
		Cambio c2 = new Cambio(m2,3,3);
		Cambio c3 = new Cambio(m3,4,4);
		
		Cliente cliente = new Cliente(1, i1, 71405548, "Leonardo", "Amado", "Tahuaycani");
		
		Cuenta cuenta = new Cuenta(21509755416714L, b1, m1, cliente, 2300.50f, 2299, 209280, "Ahorros", 1.1f);
		
		Tarjeta tarjeta = new Tarjeta(4557805677941354L, LocalDate.now(), 857, 9578, cuenta);
		
		Cajero cajero = new Cajero("D8C56T", b1, "Cayma");
		
		Retiro [] retiros = new Retiro[10];
		
		int repetir = 1;
		int i =0;
		
		while (repetir == 1) {
			System.out.println("Ingrese su DNI");
			int dni = scan.nextInt();
			System.out.println("Ingrese su PIN");
			int pin = scan.nextInt();
			if(validarDatos(dni, pin, tarjeta)) {
				System.out.println("Cuanto desea retirar");
				int condicion = 0;
				while (condicion == 0) {
					float retiro = scan.nextFloat();
					if (retiro >= 20 && retiro <=1000 && retiro <= tarjeta.getCuenta().getSaldo_disponible()) {
						retiros[i] = new Retiro(cajero, LocalDate.now(), LocalTime.now(), tarjeta, retiro);
						System.out.println(retiros[i]);
						i += 1;
						condicion = 1;
					}
					else
						System.out.println("Monto Inválido");
				}
			}
			else {
				System.out.println("Datos incorrectos");
			}
			
			System.out.println("\nDesea hacer otro retiro?");
			System.out.println("1 . Sí");
			System.out.println("0. No");
			repetir = scan.nextInt();
		}

		for (Retiro r : retiros) {
			if (r != null)
				System.out.println(r);
		}
		
	}
	
	static boolean validarDatos(int dni, int pin, Tarjeta tarjeta) {
		return dni == tarjeta.getCuenta().getCliente().getNumID() && pin == tarjeta.getClave();
	}

}
