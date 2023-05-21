package br.ce.wcaquino.servicos;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	
	@Test
	public void teste() {
		// Cen�rio
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Beatriz");
		Filme filme = new Filme("John Wick III", 2, 5.00);
		
		// Acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		// Verificacao
		Assert.assertTrue(locacao.getValor() == 5.00);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
}
