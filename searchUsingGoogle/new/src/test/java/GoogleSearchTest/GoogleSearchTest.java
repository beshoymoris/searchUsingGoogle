package GoogleSearchTest;

import org.example.GoogleSearchScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchTest extends BaseTest {
    public void searchOpenAIAutomation() {
        WebDriver driver = null;
        driver.get("https://www.google.com");
        GoogleSearchScreen googleSearchPage = new GoogleSearchScreen(driver);
        googleSearchPage.search("OpenAI automation");


        // Get search results
        List<WebElement> results = driver.findElements(By.cssSelector("h3"));
        System.out.println("Search Results:");
        for (WebElement result : results) {
            System.out.println(result.getText());
        }
    }

    public static void main(String[] args) {
        GoogleSearchTest test = new GoogleSearchTest();
        test.setUp();
        test.searchOpenAIAutomation();
        test.tearDown();
    }
}

