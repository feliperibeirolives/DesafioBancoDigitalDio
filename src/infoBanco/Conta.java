package infoBanco;

import lombok.Getter;

public abstract class Conta implements iConta{
	@Getter
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	@Getter
	protected int agencia;
	
	@Getter
	protected int numero;
	
	@Getter
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		if (valor <= 20) {
			System.out.println("Valor minimo para sacar é de R$ 20");
		}else if(valor >= 3000){
			System.out.println("Valor máximo para sacar é de R$ 3.000");
		}else {
			saldo -= valor;	
		}
		
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 20) {
			System.out.println("Valor minimo para deposito é de R$ 20");
		}else {
			saldo += valor;
		}
			
	}

	@Override
	public void transferir(double valor, iConta contaDestino) {
		if (valor <= 0) {
			System.out.println("Valor deve ser maior que R$ 0");
		}else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
			
	}

	protected void imprimirInfoComuns() {
		System.out.println((String.format("Titular: %s", this.cliente.getNome())));
		System.out.println((String.format("Agencia: %d", this.agencia)));
		System.out.println((String.format("Numero: %d", this.numero)));
		System.out.println((String.format("Saldo: %.2f", this.saldo)));
	}	
}
