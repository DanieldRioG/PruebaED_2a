package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testPersona() {
		Persona p = new Persona("12341234R","pepe","pepo");
		assertEquals(p.getDni(), p.getNombre(), p.getApellido1());
		
	}


	@Test
	void testGetDni() {
		Persona p = new Persona(); 
		String res = "12341234R";
		
		String real = p.getDni();
		assertEquals(res, real);
		
	}

	@Test
	void testSetDni() {
		Persona p = new Persona();
		String dni = "12341234R";
		try {
			p.setDni(dni);
		} catch (Exception e) {
			
			assertThrows(Exception.class, ()-> p.setDni("123412341"));
			assertEquals("El ultimo caracter introducido no es una letra", e.getMessage());
		}
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
