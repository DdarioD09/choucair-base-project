package co.com.choucair.certification.baseProject.tasks;

import co.com.choucair.certification.baseProject.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchCoursePage.UC_CATEGORY_LINK),
                Enter.theValue(course).into(SearchCoursePage.COURSE_INPUT),
                Click.on(SearchCoursePage.GO_BUTTTON),
                Click.on(SearchCoursePage.SELECT_COURSE)
        );
    }
}
