import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente(){
		System.out.println("Primeiro");
	}

	@Quando("^executa-lo$")
	public void executaLo(){
		System.out.println("Segundo");
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso(){
		System.out.println("Terceiro");
	}

	private int contador = 0;

	@Dado("^que o valor do contador é (\\d+)$")
	public void que_o_valor_do_contador_é(int arg1){
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1){
		contador += arg1;
	}

	@Então("^o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_sera(int arg1){
		Assert.assertEquals(arg1, contador);
	}
}
