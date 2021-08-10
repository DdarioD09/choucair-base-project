package co.com.choucair.certification.baseProject.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UC_CATEGORY_LINK = Target.the("Link to select the universidad Choucair category").
            located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target COURSE_INPUT = Target.the("Input to search for the course").
            located(By.id("coursesearchbox"));
    public static final Target GO_BUTTTON = Target.the("Button to search for the course").
            located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Link to course search result").
            located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Has the name of the course")
            .located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
