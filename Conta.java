package testando;

public class Conta {
	
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		saldo = saldo - valor;
	}
	
	public void transferir(Conta conta1, Conta conta2, double valor) {
		conta1.saldo = conta1.saldo - valor;
		conta2.saldo = conta2.saldo + valor;
	}
	
	public double getSaldo() {
		System.out.println(numero);
		return saldo;
	}
}