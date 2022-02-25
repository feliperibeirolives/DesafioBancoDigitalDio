package infoBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente felipe = new Cliente("Felipe");
		Cliente jose = new Cliente("José");
		Banco banco = new Banco("BancoDesafio");
		
		
		Conta ccFelipe = new  ContaCorrente(felipe);
		Conta poupancaFelipe = new ContaPoupanca(felipe);
		
		Conta ccJose = new  ContaCorrente(jose);
		Conta poupancaJose = new ContaPoupanca(jose);
		
		banco.addContaBanco(ccFelipe);
		banco.addContaBanco(ccJose);
		banco.addContaBanco(poupancaFelipe);
		banco.addContaBanco(poupancaJose);
		
		
		ccFelipe.depositar(100);
		ccFelipe.depositar(100);
		ccJose.depositar(200);
		ccJose.transferir(150, ccFelipe);
		banco.mostrarListaContas();
		
		System.out.println();
		System.out.println();
		System.out.println("=========Teste=======");
		System.out.println();
		ccFelipe.depositar(13);
		ccJose.sacar(2);
		ccJose.sacar(5000);
		ccFelipe.transferir(0, ccJose);
	}

}
