package model;

public class Cuenta {
	public int numeroCuenta;
	public double saldo;
	public Cuenta(int unNumero,double unSaldo) {
	   this.numeroCuenta = unNumero;
	   this.saldo = unSaldo;
	}
	public boolean superaSaldo(double unSaldo){
		return this.getSaldo > unSaldo;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo( double unSaldo){
		this.saldo = unSaldo;
	}
}
