package src;

import java.util.ArrayList;

public class ListaDeNumeros {
	 
	private ArrayList<Numero> lista;
	
	public ListaDeNumeros() {
		this.lista = new ArrayList<Numero>();
	}
	
	public void add(Numero num) {
		this.lista.add(num);
	}
	
	public int size() {
		return this.lista.size();
	}
}
