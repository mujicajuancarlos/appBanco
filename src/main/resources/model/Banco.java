import java.util.ArrayList;

public class Banco {
	private static Banco instance = null;
	private List<Cliente> personas = = new ArrayList<Cliente>();
	   protected Banco() {
	      // Exists only to defeat instantiation.
	   }
	   public static Banco getInstance() {
	      if(instance == null) {
	         instance = new Banco();
	      }
	      return instance;
	   }
	public List<Cliente> buscarPersona(String dni){
		for (Cliente persona : personas) {
	        if (persona.getDni().equals(dni)) {
	            return persona;
	        }
	    }
		return null;
	}
}
