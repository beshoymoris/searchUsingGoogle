package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchScreen {
    public GoogleSearchScreen(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnK");


    public void search(String query) {
        WebElement searchInput = driver.findElement(this.searchBox);
        searchInput.sendKeys(query);

        WebElement searchButton = driver.findElement(this.searchButton);
        searchButton.click();
    }
}
