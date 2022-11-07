package desafio.dio.banco;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente fabio = new Cliente();
		fabio.setNome("Fabio");
		
		Conta cc = new ContaCorrente(fabio);
		Conta poupanca = new ContaPoupanca(fabio);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
