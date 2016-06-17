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
		Cliente persona = Cliente('Juan Mujica',35215452);
		persona.agregarCuenta(Cuenta(001,35));
		persona.agregarCuenta(Cuenta(002,25));
		persona.agregarCuenta(Cuenta(003,10));
		banco.agregarPersona();
	}
}
