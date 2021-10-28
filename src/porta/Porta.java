package porta;

public class Porta {
	
	private Movivel estado;
	
	public Porta() {
		estado = new EstadoDaPortaFechado(this);
	}
	
	public void fechar() throws ExceptionPortaJaFechada {
		estado.fechar();
	}

	public void abrir() throws ExceptionPortaJaAberta {
		estado.abrir();
	}

	public String getNomeDoEstadoDaPorta() {
		return estado.getNome();
	}

	public void setEstado(Movivel estado) {
		this.estado = estado;
	}
}