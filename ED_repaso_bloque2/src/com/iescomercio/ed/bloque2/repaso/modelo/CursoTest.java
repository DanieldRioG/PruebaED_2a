package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		final List<Persona> listaAlumnos = null;
		
		String dni = "12341234R";
		try {
			listaAlumnos.remove(dni);
		} catch (Exception e) {
			
			assertThrows(Exception.class, ()-> listaAlumnos.remove(dni));
			assertEquals("El dni no tiene la longitud adecuada", e.getMessage());
		}
	}

	@Test
	void testAniadirAlumno() {
		final List<Persona> listaAlumnos = null;
		Persona p = new Persona();
		
		listaAlumnos.add(p);
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

	@Test
	void testMostrarTodos() {
		fail("Not yet implemented");
	}

}
