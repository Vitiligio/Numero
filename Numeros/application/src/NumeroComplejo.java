package src;

public class NumeroComplejo extends Numero {
	
	private int parteReal;
	private int parteImaginaria;
	
	public NumeroComplejo(int parteReal, int parteImaginaria) {
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public int getValorReal() {
		return this.parteReal;
	}
	public int getValorImaginario() {
		return this.parteImaginaria;
	}
	public int calcularModuloCuadrado() {
		return (this.parteReal * this.parteReal + this.parteImaginaria * this.parteImaginaria);
	}
	public NumeroComplejo calcularConjugado() {
		NumeroComplejo numero = new NumeroComplejo(this.getValorReal(), (-1)*this.getValorImaginario());
		return numero;
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
		return (String.valueOf(this.parteReal) + " i" + String.valueOf(this.parteImaginaria));
	}
	
	public void sumar(NumeroComplejo num) {
		this.parteReal += num.getValorReal();
		this.parteImaginaria += num.getValorImaginario();
	}
	public void restar(NumeroComplejo num) {
		this.parteReal -= num.getValorReal();
		this.parteImaginaria -= num.getValorImaginario();
	}
	public void multiplicarPor(NumeroComplejo num) {
		
		int productoParteReal =  (this.parteReal * num.getValorReal()) - (this.parteImaginaria * num.getValorImaginario());
		int productoParteImaginaria =  (this.parteReal *  num.getValorImaginario()) + (this.parteImaginaria * num.getValorReal());
	
		this.parteReal = productoParteReal;
		this.parteImaginaria = productoParteImaginaria;
	}
	public void dividirPor(NumeroComplejo num) {
		
		int moduloCuadrado = num.calcularModuloCuadrado();
		NumeroComplejo conjugado = num.calcularConjugado();
		this.multiplicarPor(conjugado);
		this.parteReal = this.parteReal / moduloCuadrado;
		this.parteImaginaria = this.parteImaginaria / moduloCuadrado;
	}
}

