package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import src.NumeroComplejo;

class NumeroComplejoTest {

	@Test
	void test_crear_numero_complejo() {

		NumeroComplejo numero = new NumeroComplejo(6, 7);
		
		assertNotEquals(null, numero);
	}
	
	@Test
	void test_generar_string_de_numero_complejo(){
		
		NumeroComplejo numero = new NumeroComplejo(6, 7);
		
		String string = "6 i7";
		String otroString = numero.toString();
		
		assertEquals(otroString, string);
	}
	
	@Test
	void test_crear_numero_complejo_random() {
		
		Random rand = new Random();
		int parteRealRandom = rand.nextInt();
		int parteImaginariaRandom = rand.nextInt();
		
		NumeroComplejo numero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		
		assertNotEquals(null, numero);
	}

	@Test
	void test_suma_numeros_complejos_random() {
		
		Random rand = new Random();
		
		int parteRealRandom = rand.nextInt();
		int parteImaginariaRandom = rand.nextInt();
		
		int otraParteRealRandom = rand.nextInt();
		int otraParteImaginariaRandom = rand.nextInt();
		
		NumeroComplejo numero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		NumeroComplejo otroNumero = new NumeroComplejo(otraParteRealRandom, otraParteImaginariaRandom);
		
		int sumaParteReal = parteRealRandom + otraParteRealRandom;
		int sumaParteImaginaria = parteImaginariaRandom + otraParteImaginariaRandom;
		
		numero.sumar(otroNumero);
		
		assertEquals(sumaParteReal, numero.getValorReal());
		assertEquals(sumaParteImaginaria, numero.getValorImaginario());
	
	}
	
	@Test
	void test_resta_numeros_complejos_random() {
		
		Random rand = new Random();
		
		int parteRealRandom = rand.nextInt();
		int parteImaginariaRandom = rand.nextInt();
		
		int otraParteRealRandom = rand.nextInt();
		int otraParteImaginariaRandom = rand.nextInt();
		
		NumeroComplejo numero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		NumeroComplejo otroNumero = new NumeroComplejo(otraParteRealRandom, otraParteImaginariaRandom);
		
		int restaParteReal = parteRealRandom - otraParteRealRandom;
		int restaParteImaginaria = parteImaginariaRandom - otraParteImaginariaRandom;
		
		numero.restar(otroNumero);
		
		assertEquals(restaParteReal, numero.getValorReal());
		assertEquals(restaParteImaginaria, numero.getValorImaginario());
	}
	
	@Test
	void test_multiplicar_numeros_complejos_random() {
		
		Random rand = new Random();
		
		int parteRealRandom = rand.nextInt();
		int parteImaginariaRandom = rand.nextInt();
		
		int otraParteRealRandom = rand.nextInt();
		int otraParteImaginariaRandom = rand.nextInt();
		
		NumeroComplejo numero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		NumeroComplejo otroNumero = new NumeroComplejo(otraParteRealRandom, otraParteImaginariaRandom);
		
		int productoParteReal = (parteRealRandom * otraParteRealRandom) - (parteImaginariaRandom * otraParteImaginariaRandom);
		int productoParteImaginaria = (parteRealRandom * otraParteImaginariaRandom) + (parteImaginariaRandom * otraParteRealRandom);
		
		numero.multiplicarPor(otroNumero);
		
		assertEquals(productoParteReal, numero.getValorReal());
		assertEquals(productoParteImaginaria, numero.getValorImaginario());
	}
	
	@Test
	void test_dividr_numeros_complejos_random() {
		
		Random rand = new Random();
		
		int parteRealRandom = rand.nextInt();
		int parteImaginariaRandom = rand.nextInt();
		
		int otraParteRealRandom = rand.nextInt();
		int otraParteImaginariaRandom = rand.nextInt();
		
		NumeroComplejo numero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		NumeroComplejo copiaNumero = new NumeroComplejo(parteRealRandom, parteImaginariaRandom);
		NumeroComplejo otroNumero = new NumeroComplejo(otraParteRealRandom, otraParteImaginariaRandom);
		
		numero.dividirPor(otroNumero);
		
		int moduloCuadrado = otroNumero.calcularModuloCuadrado();
		
		otroNumero = otroNumero.calcularConjugado();
		
		copiaNumero.multiplicarPor(otroNumero);
	
		assertEquals(copiaNumero.getValorReal() / moduloCuadrado, numero.getValorReal());
		assertEquals(copiaNumero.getValorImaginario() / moduloCuadrado, numero.getValorImaginario());
	}
}
