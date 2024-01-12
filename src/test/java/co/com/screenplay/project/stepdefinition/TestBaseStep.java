package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.task.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;

import org.hamcrest.Matchers;

import static co.com.screenplay.project.Utils.Constant.MR_ROBOT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Slf4j
public class TestBaseStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que deseo abrir una pagina web")
    public void whatIWantToOpenAWebPage() {
       OnStage.theActorCalled(MR_ROBOT).attemptsTo(OpenWeb.browserURL());
    }

    @When("busco cualquier palabra")
    public void IAmLookingForAnyWord() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheWebPage.title(), Matchers.containsString("Google"))
        );
    }

    @Then("valido la pagina")
    public void validThePage() {
        log.info("Finaliza prueba basica");
    }
}