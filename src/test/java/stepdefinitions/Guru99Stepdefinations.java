package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.ReusableMethods;

import java.util.List;

public class Guru99Stepdefinations {

    Guru99Page guru99Page = new Guru99Page();

    List<String> companyListStr;


    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        List<WebElement> companyElementList = guru99Page.companyElementList;
       companyListStr = ReusableMethods.getElementsText(companyElementList);
        System.out.println(companyListStr);


    }

    @Then("{string} in listede oldugunu test eder")
    public void in_listede_oldugunu_test_eder(String istenenCompany) {

        Assert.assertTrue(companyListStr.contains(istenenCompany));

    }
}
