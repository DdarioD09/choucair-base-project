package co.com.choucair.certification.baseProject.stepdefinitions;

import co.com.choucair.certification.baseProject.model.AcademyChoucairData;
import co.com.choucair.certification.baseProject.questions.Answer;
import co.com.choucair.certification.baseProject.tasks.Login;
import co.com.choucair.certification.baseProject.tasks.OpenUp;
import co.com.choucair.certification.baseProject.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinition {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActor("Brandon").wasAbleTo(OpenUp.thePage(), Login
                .onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword()));
    }


    @When("^he search for the course on the Choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }

}
