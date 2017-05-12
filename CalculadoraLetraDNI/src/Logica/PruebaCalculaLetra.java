package Logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCalculaLetra {

	@Test
	public void test() {
		CalcularLetra c = new CalcularLetra("29217803");
		assertEquals('Y', c.devolverLetra());
	}

}
