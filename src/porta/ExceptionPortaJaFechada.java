package porta;
public class ExceptionPortaJaFechada extends Exception {

	public ExceptionPortaJaFechada() {
		super("porta ja esta fechada");
	}

	private static final long serialVersionUID = 6637275519511065269L;
}