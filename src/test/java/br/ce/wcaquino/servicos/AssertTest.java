package br.ce.wcaquino.servicos;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Usuario;

public class AssertTest {
	
	@Test
	public void testAssertTrue() {
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void testAssertFalse() {
		Assert.assertFalse(false);
	}
	
	
	@Test
	public void testAssertEquals() {
		Assert.assertEquals(1.0, 1.2, 0.3);		// 0.3 eh margem de erro de comparacao, delta
	}
	
	
	@Test
	public void testDifferentObjects() {
		int i = 5;
		Integer i2 = 5;
		
		Assert.assertEquals(Integer.valueOf(i), i2);
		Assert.assertEquals(i, i2.intValue());
	}
	
	
	@Test
	public void testStringComVariacoes() {
		//Assert.assertEquals("bola", "Bola");
		// variacao da assertiva acima, que ignora letra maiuscula
		Assert.assertTrue("bola".equalsIgnoreCase("Bola"));
		
		// Radical
		Assert.assertTrue("bola".startsWith("bo"));
	}
	
	
	@Test
	public void testStringComUsuario() {
		Usuario u1 = new Usuario("Usuario 1");
		Usuario u2 = new Usuario("Usuario 1");
		
		Assert.assertEquals(u1, u2);
	}
	
	
	@Test
	public void testObjetoDeMesmaInstanciaMesmoComEqualsImplementado() {
		Usuario u1 = new Usuario("Beatriz");
		Usuario u2 = new Usuario("Beatriz");
		
		//Assert.assertSame(u1, u2);
		
		Usuario u3 = u2;
		
		Assert.assertSame(u2, u3);
	}
	
	
	@Test
	public void testObjetoENull() {
		Usuario u1 = new Usuario("User 1");
		Usuario u2 = new Usuario("User 1");
		Usuario u3 = null;
		
		Assert.assertNull(u3);
	}
	
	@Test
	public void testObjetoNotNull() {
		Usuario u1 = new Usuario("User 1");
		Usuario u2 = new Usuario("User 1");
		Usuario u3 = null;
		
		Assert.assertNotNull(u3);
	}
	
	
	@Test
	public void testErroComMensagemTratatada() {
		Assert.assertEquals("Erro de comparacao", 1, 2);
	}
}
