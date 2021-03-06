package src;

public class NumeroEntero extends Numero{

	private int valor;
	
	public NumeroEntero(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void sumar(Numero num) {
		this.sumar(num);
	}
	public void restar(Numero num) {
		this.restar(num);
	}
	public void multiplicarPor(Numero num) {
		this.multiplicarPor(num);
	}
	public void dividirPor(Numero num) {
		this.dividirPor(num);
	}
	public String toString() {
		return String.valueOf(this.valor);
	}
	
	public void sumar(NumeroEntero num) {
		this.valor += num.getValor();
	}
	public void restar(NumeroEntero num) {
		this.valor -= num.getValor();
	}
	public void multiplicarPor(NumeroEntero num) {
		this.valor *= num.getValor();
	}
	public void dividirPor(NumeroEntero num) {
		this.valor /= num.getValor();
	}
	
	public void sumar(NumeroReal num) {
		this.valor += (int)num.getValor();
	}
	public void restar(NumeroReal num) {
		this.valor -= (int)num.getValor();
	}
	public void multiplicarPor(NumeroReal num) {
		this.valor *= (int)num.getValor();
	}
	public void dividirPor(NumeroReal num) {
		this.valor /= (int)num.getValor();
	}

	
}
