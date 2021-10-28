package porta;

public class EstadoDaPortaAberta implements Movivel {

	private Porta porta;

	public EstadoDaPortaAberta(Porta porta) {
		this.porta = porta;
	}
	
	@Override
	public void abrir() throws ExceptionPortaJaAberta {
		throw new ExceptionPortaJaAberta();
	}

	@Override
	public void fechar() throws ExceptionPortaJaFechada {
		porta.setEstado(new EstadoMeioAberto(porta));
	}

	@Override
	public String getNome() {
		return "Estado aberto";
	}

}
