package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.ListaDeNumeros;
import src.NumeroComplejo;
import src.NumeroEntero;
import src.NumeroReal;

class ListaDeNumeroTest {

	@Test
	void test_crear_lista_de_numeros() {
		
		ListaDeNumeros lista = new ListaDeNumeros();
		assertNotEquals(null, lista);
	}
	
	@Test
	void test_agregar_numero_entero_a_lista() {
		
		ListaDeNumeros lista = new ListaDeNumeros();
		NumeroEntero numero = new NumeroEntero(3);
		
		lista.add(numero);
		
		assertEquals(lista.size(), 1);
	}
	
	@Test
	void test_agregar_numero_real_a_lista() {
		
		ListaDeNumeros lista = new ListaDeNumeros();
		NumeroReal numero = new NumeroReal(3.5);
		
		lista.add(numero);
		
		assertEquals(lista.size(), 1);
	}
	
	@Test
	void test_agregar_numero_complejo_a_lista() {
		
		ListaDeNumeros lista = new ListaDeNumeros();
		NumeroComplejo numero = new NumeroComplejo(3, 9);
		
		lista.add(numero);
		
		assertEquals(lista.size(), 1);
	}
	
	@Test
	void test_agregar_numeros_enteros_reales_complejos_a_lista() {
		
		ListaDeNumeros lista = new ListaDeNumeros();
		
		NumeroEntero numeroA = new NumeroEntero(3);
		NumeroReal numeroB = new NumeroReal(3.5);
		NumeroComplejo numeroC = new NumeroComplejo(3, 9);
		
		lista.add(numeroA);
		lista.add(numeroB);
		lista.add(numeroC);
		
		assertEquals(lista.size(), 3);

	}

}
