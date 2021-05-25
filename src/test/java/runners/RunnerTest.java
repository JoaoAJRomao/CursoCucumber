package runners;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature", 
		glue = "steps", 
		tags = {"~@Ignore"},
		plugin = {"pretty", "html:target/report-html","json:target/report.json"}, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		dryRun = false, 
		strict = false)
public class RunnerTest {

	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		driver.get("http://seubarriga.wcaquino.me/logout");
		driver.findElement(By.id("email")).sendKeys("arthur@joao");
		driver.findElement(By.name("senha")).sendKeys("qwerty");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
}
