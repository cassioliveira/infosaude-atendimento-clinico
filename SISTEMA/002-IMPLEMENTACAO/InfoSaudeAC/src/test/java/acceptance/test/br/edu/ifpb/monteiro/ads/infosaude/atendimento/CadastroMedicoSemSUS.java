package acceptance.test.br.edu.ifpb.monteiro.ads.infosaude.atendimento.medico;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CadastroMedicoSemSUS {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCadastroMedicoSemSUS() throws Exception {
    driver.get(baseUrl + "/InfoSaudeAC/medico/CapaMedico.xhtml");
    driver.findElement(By.id("tabMedico:formCadastroMedico:crm")).clear();
    driver.findElement(By.id("tabMedico:formCadastroMedico:crm")).sendKeys("78451");
    driver.findElement(By.id("tabMedico:formCadastroMedico:cpf")).clear();
    driver.findElement(By.id("tabMedico:formCadastroMedico:cpf")).sendKeys("515.124.304-71");
    driver.findElement(By.id("tabMedico:formCadastroMedico:nome")).clear();
    driver.findElement(By.id("tabMedico:formCadastroMedico:nome")).sendKeys("Luis Ganso");
    driver.findElement(By.id("tabMedico:formCadastroMedico:saveButton")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.cssSelector("span.ui-growl-title"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    try {
      assertEquals("O número do cartão do SUS é obrigatório", driver.findElement(By.cssSelector("span.ui-growl-title")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
