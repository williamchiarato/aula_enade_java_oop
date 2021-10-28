package porta;

public class EstadoMeioAberto extends AbstractEstadoDaPorta implements Movivel{

	private Porta porta;

	public EstadoMeioAberto(Porta porta) {
		this.porta = porta;
	}
	
	@Override
	public void abrir() throws ExceptionPortaJaAberta {
		porta.setEstado(new EstadoDaPortaAberta(porta));
	}

	@Override
	public void fechar() throws ExceptionPortaJaFechada {
		porta.setEstado(new EstadoDaPortaFechado(porta));
	}

	@Override
	public String getNome() {
		return "Estado meio aberto";
	}
	
}
