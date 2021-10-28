package porta;
public class ExceptionPortaJaAberta extends Exception {

	private static final long serialVersionUID = 4770718384396607003L;
	
	public ExceptionPortaJaAberta() {
		super("porta ja esta aberta");
	}

}