package com.bdd.step;

import com.bdd.page.BlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BlazeSteps extends ScenarioSteps {

    WebDriver driver;

    private BlazePage BlazePage() {return  new BlazePage(driver);}

    @Step
    public void openPage(String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println(url);
        driver.manage().window().maximize();
        driver.get(url);

    }


    @Step
    public void selectProducts(String mobile) throws InterruptedException {
        BlazePage().getProduct(mobile).click();
        TimeUnit.SECONDS.sleep(5);
    }

    @Step("se añade al carrito")
    public void addCart() throws InterruptedException {
        BlazePage().getButtonAddToCart().click();
        TimeUnit.SECONDS.sleep(2);
        driver.switchTo().alert().accept();
    }

    public void irACart() throws InterruptedException {
        BlazePage().getTabCart().click();
        TimeUnit.SECONDS.sleep(2);
    }

    public void purchase() throws InterruptedException {
        BlazePage().getButtonComprar().click();
        TimeUnit.SECONDS.sleep(2);
        BlazePage().getInputName().sendKeys("Breysi");
        BlazePage().getInputCity().sendKeys("Jara");
        BlazePage().getInputCountry().sendKeys("Huanuco");
        BlazePage().getInputCreditCar().sendKeys("9844444");
        BlazePage().getInputMonth().sendKeys("20");
        BlazePage().getInputYear().sendKeys("2023");
        BlazePage().getButtonPurchase().click();
    }

    public void success() {
        Assert.assertTrue("ERROR: No muestra el mensaje", BlazePage().getSuccess());

    }

    @After
    public void quit(){
        driver.quit();
    }
}
