import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumber {
	@Given("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
		System.out.println("primeiro");
	}

	@When("^executa-lo$")
	public void executa_lo() throws Throwable {
		System.out.println("segundo");
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void a_especificação_deve_finalizar_com_sucesso() throws Throwable {
		System.out.println("terceiro");
	}
}
