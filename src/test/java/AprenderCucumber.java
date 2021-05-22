import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
	    System.out.println("Primeiro");
	}

	@Quando("^executa-lo$")
	public void executa_lo() throws Throwable {
		System.out.println("Segundo");
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
		System.out.println("Terceiro");
	}
}
