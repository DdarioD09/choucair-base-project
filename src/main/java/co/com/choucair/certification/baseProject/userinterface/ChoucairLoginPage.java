package co.com.choucair.certification.baseProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target USER_INPUT = Target.the("Where do we write the user")
            .located(By.id("username"));
    public static final Target PASSWORD_INPUT = Target.the("Where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Button to confirm login")
            .located(By.id("//button[contains(@class,'btn btn-primary')]"));

}
