package porta;

public class EstadoDaPortaFechado extends AbstractEstadoDaPorta implements Movivel {

	private Porta porta;

	public EstadoDaPortaFechado(Porta porta) {
		this.porta = porta;
	}
	
	@Override
	public void abrir() throws ExceptionPortaJaAberta {
		porta.setEstado(new EstadoDaPortaAberta(porta));
	}

	@Override
	public void fechar() throws ExceptionPortaJaFechada {
		throw new ExceptionPortaJaFechada();
	}

	@Override
	public String getNome() {
		return "Estado fechado";
	}

}
