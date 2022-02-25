package infoBanco;


import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Getter
public class Banco {
	@Setter
	 private String nome;
	 private List<Conta> contas;
	 
	 
	public void addContaBanco(Conta e) {
		contas.add(e);
		
	}
	
	public void mostrarListaContas() {
		System.out.println("Banco: " + this.nome);
		for (Conta conta : contas) {
			conta.imprimirExtrato();
		}
	}

	public Banco(String nome) {
		super();
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}
	
}
