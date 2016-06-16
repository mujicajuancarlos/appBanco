package model;

import java.util.ArrayList;

public class Cliente {
	public List<Cuenta> cuentas = new ArrayList<Cuenta>();
	public String dni;
	public String getDni(){
		return dni;
	}
	public void setDni(String unDni){
		dni = unDni;
	}
	public List<Cuenta> cuentasQueSuperan(int unSaldo){
		return this.getCuentas.stream().filter(c -> c.superaSaldo(unSaldo)).collect(Collectors.toList());
	}
	public List<Cuenta> getCuentas(){
		return this.cuentas;
	}
	public void agregarCuenta(Cuenta unaCuenta){
		this.cuentas.add(unaCuenta);
	}
}
