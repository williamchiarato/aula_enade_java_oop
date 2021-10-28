package porta;

public interface Movivel {

	public void abrir() throws ExceptionPortaJaAberta;
	public void fechar() throws ExceptionPortaJaFechada;
	public String getNome();
	
}
