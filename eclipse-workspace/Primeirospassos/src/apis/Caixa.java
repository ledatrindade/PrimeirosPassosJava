package apis;

public class Caixa<T> {
	
	 private T valor;

	    public void guardar(T valor) {
	    	
	        this.valor = valor;
	        
	    }

	    public T abrir() {
	        return valor;
	    }

}
