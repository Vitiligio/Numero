package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.NumeroEntero;
import src.NumeroReal;

import java.util.Random;


class NumeroEnteroTest {

	@Test
	public void test_crear_numero_entero() {
		
		NumeroEntero numero = new NumeroEntero(5);
		assertNotEquals(null, numero);
	}
	
	@Test
	public void test_crear_entero_random() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		assertEquals(numeroRandom, numero.getValor());
	}
	
	@Test
	public void test_sumar_dos_enteros_random() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		int otroNumeroRandom = rand.nextInt();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroEntero otroNumero = new NumeroEntero(otroNumeroRandom);
		
		numero.sumar(otroNumero);
		
		int suma = numeroRandom + otroNumeroRandom; 
				
		assertEquals(suma, numero.getValor());
	}
	
	@Test
	public void test_restar_dos_enteros_random() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		int otroNumeroRandom = rand.nextInt();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroEntero otroNumero = new NumeroEntero(otroNumeroRandom);
		
		numero.restar(otroNumero);
		
		int resta = numeroRandom - otroNumeroRandom; 
				
		assertEquals(resta, numero.getValor());
	}
	
	@Test 
	public void test_multiplicar_dos_enteros_random() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		int otroNumeroRandom = rand.nextInt();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroEntero otroNumero = new NumeroEntero(otroNumeroRandom);
		
		numero.multiplicarPor(otroNumero);
		
		int producto = numeroRandom * otroNumeroRandom; 
				
		assertEquals(producto, numero.getValor());
	}
	
	@Test
	public void test_dividir_dos_enteros_random() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		int otroNumeroRandom = rand.nextInt();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroEntero otroNumero = new NumeroEntero(otroNumeroRandom);
		
		numero.dividirPor(otroNumero);
		
		int division = numeroRandom / otroNumeroRandom; 
				
		assertEquals(division, numero.getValor());
	}
	
	@Test
	public void test_sumar_numero_entero_y_real() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		numero.sumar(otroNumero);
		
		int suma = numeroRandom + (int)otroNumeroRandom; 
				
		assertEquals(suma, numero.getValor());
	}

	@Test
	public void test_restar_numero_entero_y_real() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		numero.restar(otroNumero);
		
		int resta = numeroRandom - (int)otroNumeroRandom; 
				
		assertEquals(resta, numero.getValor());
	}
	
	@Test
	public void test_multiplicar_numero_entero_y_real() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		numero.multiplicarPor(otroNumero);
		
		int producto = numeroRandom * (int)otroNumeroRandom; 
				
		assertEquals(producto, numero.getValor());
	}

	@Test
	public void test_dividir_numero_entero_y_real() {
		
		Random rand = new Random();
		int numeroRandom = rand.nextInt();
		double otroNumeroRandom = 1 + rand.nextFloat();
		
		NumeroEntero numero = new NumeroEntero(numeroRandom);
		
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		numero.dividirPor(otroNumero);
		
		int division = numeroRandom / (int)otroNumeroRandom; 
				
		assertEquals(division, numero.getValor());
	}
}
