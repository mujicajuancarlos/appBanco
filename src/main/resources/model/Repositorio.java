package model;

import java.util.ArrayList;
import java.util.List;

import poi.modelo.puntoDeInteres.POI;

public class Repositorio {
	private static Repositorio instance = null;
	private Banco banco = new.Banco();
	   protected Repositorio() {
	      // Exists only to defeat instantiation.
	   }
	   public static Repositorio getInstance() {
	      if(instance == null) {
	         instance = new Repositorio();
	         instance.cargarPersonas();
	      }
	      return instance;
	   }
	private void cargarPersonas(){
		Persona persona;
		persona = Persona('Juan Mujica',35215452);
		
		banco.agregarPersona()
	}
}
