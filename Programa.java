package testando;

public class Programa {

	public static void main(String[] args) {
		Conta conta1 = new Conta("1234", 20.0);
		Conta conta2 = new Conta("1235", 30.0);
		
		// Creditando
		System.out.println("Creditar:");
		conta1.creditar(10);
		System.out.println(conta1.getSaldo());
		
		// Debitando
		System.out.println("Debitar:");
		conta2.debitar(10);
		System.out.println(conta2.getSaldo());
		
		// Transferindo
		System.out.println("Transferir:");
		conta1.transferir(conta1, conta2, 10);
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	}
}
