import java.util.Date;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class Principal {

	public static void main(String[] args) {
		// Cenário
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Beatriz");
		Filme filme = new Filme("John Wick III", 2, 5.00);
		
		// Acao
		Locacao locacao = service.alugarFilme(usuario, filme);
		
		// Verificacao
		System.out.println(locacao.getValor() == 2.0);
		System.out.println(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		System.out.println(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(2)));
	}

}
