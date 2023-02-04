package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniverstyPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinations {

    WebUniverstyPage webUniverstyPage=new WebUniverstyPage();
    Actions actions=new Actions(Driver.getDriver());

    String ilkSayfaHandleDegeri;

    Faker faker=new Faker();

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {

        ilkSayfaHandleDegeri=Driver.getDriver().getWindowHandle();
        webUniverstyPage.loginPortalButonu.click();

    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {


        //eger yeni windowa geciyorsa yeni window
        // acilmadan ilk sayfanin window handle degerini kaydetmeliyiz
        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri = "";

        for (String each : windowHandlesSeti) {

            if(!each.equals(ilkSayfaHandleDegeri))
            {
                ikinciSayfaHandleDegeri=each;
            }

        }

        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {

        webUniverstyPage.userNameKutusu.sendKeys(faker.name().username());

    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {

        webUniverstyPage.passwordKutusu.sendKeys(faker.internet().password());
    }
    @Then("webuniversty login butonuna basar")
    public void webuniversty_login_butonuna_basar() {

        webUniverstyPage.loginButonu.click();
    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {

        String actualPopupyazi=Driver.getDriver().switchTo().alert().getText();
        String expectedyazi="validation failed";
        Assert.assertEquals(actualPopupyazi, expectedyazi);
    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);

    }
    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {

        Assert.assertTrue(webUniverstyPage.contactUsLinki.isDisplayed());

    }



}
