package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepdefinitions {



    HerokuappPage herokuappPage=new HerokuappPage();
    @Then("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButonu.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() throws InterruptedException {

        Thread.sleep(2000);

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {

        herokuappPage.deleteButonu.click();
    }


    @And("Delete butonunn gorunmedigini test eder")
    public void deleteButonunnGorunmediginiTestEder() {


        int flag=3;
        try {
            herokuappPage.deleteButonu.click();
            Assert.assertFalse(flag==3);

            //exception olusmazsa bekledigimiz durum gerceklessmedi demektir
            // bu durumda test failed olmali
            //bunun icin 36 .satırda failde olacak bir assertion yazdik

        } catch (NoSuchElementException e) {
            Assert.assertTrue(flag==3);
            // 35.satirda delete butonu gorunmuyorsa exception olusur
            // bu bizim bekledigimiz durum oldugundan testin passed olmasi gerekir
            // exception olusunca onu catch ile yakaladik ve
            // 41.satirda PASSED olacak bir assertion yazdik


        }

    }
}
