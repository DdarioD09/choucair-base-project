package co.com.choucair.certification.baseProject.tasks;

import co.com.choucair.certification.baseProject.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Login implements Task {
    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.USER_INPUT),
                Enter.theValue(strPassword).into(ChoucairLoginPage.PASSWORD_INPUT),
                Hit.the(Keys.TAB).into(ChoucairLoginPage.PASSWORD_INPUT)
                //Hit.the(Keys.ENTER).into(ChoucairLoginPage.ENTER_BUTTON)
                //Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );
    }
}
