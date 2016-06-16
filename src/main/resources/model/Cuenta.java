package model;

public class Cuenta {
	public double saldo = 0;
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
