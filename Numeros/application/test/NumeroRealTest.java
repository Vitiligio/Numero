package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import src.NumeroReal;

class NumeroRealTest {

	@Test
	void test_crear_numero_real() {
		
		NumeroReal numero = new NumeroReal(0.0);
		assertNotEquals(null, numero);
	}
	
	@Test
	void test_crear_numero_real_random() {
		
		Random rand = new Random();
		double numeroRandom = rand.nextFloat();
		
		NumeroReal numero = new NumeroReal(numeroRandom);
				
		assertEquals(numeroRandom, numero.getValor());
	}
	
	@Test
	void test_sumar_dos_numeros_reales_random() {
		
		Random rand = new Random();
		double numeroRandom = rand.nextFloat();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroReal numero = new NumeroReal(numeroRandom);
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		double suma = numeroRandom + otroNumeroRandom;
		
		numero.sumar(otroNumero);
		
		assertEquals(suma, numero.getValor());
		
	}
	
	@Test
	void test_restar_dos_numeros_reales_random() {
		
		Random rand = new Random();
		double numeroRandom = rand.nextFloat();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroReal numero = new NumeroReal(numeroRandom);
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		double resta = numeroRandom - otroNumeroRandom;
		
		numero.restar(otroNumero);
		
		assertEquals(resta, numero.getValor());
	}
	
	@Test
	void test_multiplicar_dos_numeros_reales_random() {
		
		Random rand = new Random();
		double numeroRandom = rand.nextFloat();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroReal numero = new NumeroReal(numeroRandom);
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		double producto = numeroRandom * otroNumeroRandom;
		
		numero.multiplicarPor(otroNumero);
		
		assertEquals(producto, numero.getValor());
	}
	
	@Test
	void test_dividir_dos_numeros_reales_random() {
		
		Random rand = new Random();
		double numeroRandom = rand.nextFloat();
		double otroNumeroRandom = rand.nextFloat();
		
		NumeroReal numero = new NumeroReal(numeroRandom);
		NumeroReal otroNumero = new NumeroReal(otroNumeroRandom);
		
		double division = numeroRandom / otroNumeroRandom;
		
		numero.dividirPor(otroNumero);
		
		assertEquals(division, numero.getValor());
	}

}
