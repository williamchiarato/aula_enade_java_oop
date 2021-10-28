package porta.visao;
import java.util.Scanner;

import porta.ExceptionPortaJaAberta;
import porta.ExceptionPortaJaFechada;
import porta.Porta;

public class InteracaoPorta {

	private Scanner scan;
	private String resposta;
	private Porta porta;

	public InteracaoPorta(Porta porta) {
		this.porta = porta;
		scan = new Scanner(System.in);
		resposta = "";
	}

	public void interacaoInfinitaDeEstadosDePorta() {
		while (true) {
			System.out.println("voce quer abrir ou fechar a porta? \n");
			resposta = scan.next();
			if (resposta.equals("abrir")) {
				try {
					porta.abrir();
				} catch (ExceptionPortaJaAberta e) {
					e.printStackTrace();
				}
			} else if (resposta.equals("fechar")) {
				try {
					porta.fechar();
				} catch (ExceptionPortaJaFechada e) {
					e.printStackTrace();
				}
			} else
				continue;
			System.out.println("o estado da porta é: " + porta.getNomeDoEstadoDaPorta());
		}
	}
	
	public static void main(String[] args) {
		Porta porta = new Porta();
		InteracaoPorta interacaoPorta = new InteracaoPorta(porta);
		interacaoPorta.interacaoInfinitaDeEstadosDePorta();
	}
}