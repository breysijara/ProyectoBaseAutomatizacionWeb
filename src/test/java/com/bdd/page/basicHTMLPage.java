package com.bdd.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basicHTMLPage {

    WebDriver driver;

    public basicHTMLPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.name("username");
    By password = By.name("password");
    By comments = By.name("comments");
    By filename = By.name("filename");
    By checkbox= By.xpath("//input[@type='checkbox']");


    public WebElement name() {
        return  driver.findElement(name);
    }

    public WebElement password() {
        return  driver.findElement(password);
    }

    public WebElement comments() {
        return  driver.findElement(comments);
    }

    public WebElement filename() {
        return  driver.findElement(filename);
    }

    public WebElement checkbox() {
        return  driver.findElement(checkbox);
    }

}
