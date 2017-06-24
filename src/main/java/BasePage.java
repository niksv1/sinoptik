import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage {
    String baseURL = "https://sinoptik.ua";

    public void getSystemProperty(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Никита\\IdeaProjects\\sinoptikTest\\src\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        System.setProperty("selenide.timeouts", "60000");
    }

    public void pageRefresh(){
        getWebDriver().navigate().refresh();
    }

}
