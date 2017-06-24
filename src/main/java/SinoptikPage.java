import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Никита on 21.06.2017.
 */
public class SinoptikPage extends BasePage {

//    Locators of SinoptikPage:

    public WebElement sinoptikLogo = $(By.xpath(".//*[@id='header']/div[1]/a"));
    public WebElement searchField = $(By.xpath(".//*[@id='search_city']"));
    public WebElement searchButton = $(By.xpath(".//*[@id='form-search']/p[1]/input[2]"));
    public WebElement sinoptikSlang = $(By.xpath(".//*[@id='sLang']"));
    public WebElement languageLink = $(By.xpath(".//*[@id='sLang']/a"));
    public WebElement citiesButton = $(By.xpath(".//*[@id='form-search-examples']/a"));
    public WebElement textLabel = $(By.xpath(".//*[@id='header']/div[4]/h1"));
    public WebElement sevenDaysLink = $(By.xpath(".//*[@id='topMenu']/span"));
    public WebElement tenDaysLink = $(By.xpath(".//*[@id='topMenu']/a[1]"));
    public WebElement weatherOnMapLink = $(By.xpath(".//*[@id='topMenu']/a[2]"));
    public WebElement firstDayWeather = $(By.xpath(".//*[@id='bd1']"));
    public WebElement secondDayWeather = $(By.xpath(".//*[@id='bd2']"));
    public WebElement thirdDayWeather = $(By.xpath(".//*[@id='bd3']"));
    public WebElement fourthDayWeather = $(By.xpath(".//*[@id='bd4']"));
    public WebElement fifthDayWeather = $(By.xpath(".//*[@id='bd5']"));
    public WebElement sixthDayWeather = $(By.xpath(".//*[@id='bd6']"));
    public WebElement seventhDayWeather = $(By.xpath(".//*[@id='bd7']"));
    public WebElement weatherYearAgoLink = $(By.xpath(".//*[@id='bd1c']/div[3]/div[2]/div[2]/a"));
    public WebElement weatherInCountryButton = $(By.xpath(".//*[@id='tenOtherCities']/div/h2/a"));
    public WebElement firstCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[1]/li[1]/a/span"));
    public WebElement secondCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[1]/li[2]/a/span"));
    public WebElement thirdCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[1]/li[3]/a/span"));
    public WebElement fourthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[1]/li[4]/a/span"));
    public WebElement fifthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[1]/li[5]/a/span"));
    public WebElement sixthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[2]/li[1]/a/span"));
    public WebElement seventhCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[2]/li[2]/a/span"));
    public WebElement eighthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[2]/li[3]/a/span"));
    public WebElement ninethCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[2]/li[4]/a/span"));
    public WebElement tenthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[2]/li[5]/a/span"));
    public WebElement eleventhCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[3]/li[1]/a/span"));
    public WebElement twelvethCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[3]/li[2]/a/span"));
    public WebElement thirteenthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[3]/li[3]/a/span"));
    public WebElement fourteenthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[3]/li[4]/a/span"));
    public WebElement fifteenthCityLink = $(By.xpath(".//*[@id='weatherLinks']/ul[3]/li[5]/a/span"));

//    Methods of SinoptikPage:

    public void openSinoptikPage(){
        getSystemProperty();
        open(baseURL);
    }

    public void checkSinoptikLogo(){$(sinoptikLogo).shouldNot(visible);}

    public void clickOnSinoptikLogo(){$(sinoptikLogo).click();}

    public void checkSearchField(){$(searchField).shouldBe(visible);}

    public void typeOnSearchField(String text){
        $(searchField).clear();
        $(searchField).sendKeys(text);
        $(searchField).sendKeys(Keys.ENTER);
    }

    public void checkSearchButton(){$(searchButton).shouldBe(visible);}

    public void clickOnSearchButton(){$(searchButton).click();}

    public void checkSinoptikSlang(){
        $(sinoptikSlang).shouldBe(visible);
        $(sinoptikSlang).shouldHave(text("Sinoptik.ua"));
    }

    public void checkLanguageLink(){
        $(languageLink).shouldBe(visible);
        $(languageLink).shouldHave(text("українською"));
    }

    public void clickOnLanguageLink(){$(languageLink).click();}

    public void checkCitiesButton(){
        $(citiesButton).shouldBe(visible);
        $(citiesButton).shouldHave(text("Киев"));
    }

    public void clickOnCitiesButton(){$(citiesButton).click();}

    public void checkTextLabel(){
        $(textLabel).shouldBe(visible);
        $(textLabel).shouldHave(text("Погода"));
    }

    public void checkSevenDaysLink(){
        $(sevenDaysLink).shouldBe(visible);
        $(sevenDaysLink).shouldHave(text("7 дней"));
    }

    public void clickOnSevenDaysLink(){$(sevenDaysLink).click();}

    public void checkTenDaysLink(){
        $(tenDaysLink).shouldBe(visible);
        $(tenDaysLink).shouldHave(text("10 дней"));
    }

    public void clickOnTenDaysLink(){$(tenDaysLink).click();}

    public void checkWeatherOnMapLink(){
        $(weatherOnMapLink).shouldBe(visible);
        $(weatherOnMapLink).shouldHave(text("погода на карте"));
    }

    public void clickOnWeatherOnMapLink(){$(weatherOnMapLink).click();}

    public void checkFirstDayWeather(){$(firstDayWeather).shouldBe(visible);}

    public void clickOnFirstDayWeather(){$(firstDayWeather).click();}

    public void checkSecondDayWeather(){$(secondDayWeather).shouldBe(visible);}

    public void clickOnSecondDayWeather(){$(secondDayWeather).click();}

    public void checkThirdDayWeather(){$(thirdDayWeather).shouldBe(visible);}

    public void clickOnThirdDayWeather(){$(thirdDayWeather).click();}

    public void checkFourthDayWeather(){$(fourthDayWeather).shouldBe(visible);}

    public void clickOnFourthDayWeather(){$(fourthDayWeather).click();}

    public void checkFifthDayWeather(){$(fifthDayWeather).shouldBe(visible);}

    public void clickOnFifthDayWeather(){$(fifthDayWeather).click();}

    public void checkSixthDayWeather(){$(sixthDayWeather).shouldBe(visible);}

    public void clickOnSixthDayWeather(){$(sixthDayWeather).click();}

    public void checkSeventhDayWeather(){$(seventhDayWeather).shouldBe(visible);}

    public void clickOnSeventhDayWeather(){$(seventhDayWeather).click();}

    public void checkWeatherYearAgoLink(){
        $(weatherYearAgoLink).shouldBe(visible);
        $(weatherYearAgoLink).shouldHave(text("10 дней"));
    }

    public void clickOnWeatherYearAgoLink(){$(weatherYearAgoLink).click();}

    public void checkWeatherInCountryButton(){
        $(weatherInCountryButton).shouldBe(visible);
        $(weatherInCountryButton).shouldHave(text("Погода в Украине"));
    }

    public void clickOnWeatherInCountryButton(){$(weatherInCountryButton).click();}

    public void checkFirstCityLink(){
        $(firstCityLink).shouldBe(visible);
        $(firstCityLink).shouldHave(text("Погода в Донецке"));
    }

    public void clickOnFirstCityLink(){$(firstCityLink).click();}

    public void checkSecondCityLink(){
        $(secondCityLink).shouldBe(visible);
        $(secondCityLink).shouldHave(text("Погода в Харькове"));
    }

    public void clickOnSecondCityLink(){$(secondCityLink).click();}

    public void checkThirdCityLink(){
        $(thirdCityLink).shouldBe(visible);
        $(thirdCityLink).shouldHave(text("Погода в Одессе"));
    }

    public void clickOnThirdCityLink(){$(thirdCityLink).click();}

    public void checkFourthCityLink(){
        $(fourthCityLink).shouldBe(visible);
        $(fourthCityLink).shouldHave(text("Погода в Запорожье"));
    }

    public void clickOnFourthCityLink(){$(fourthCityLink).click();}

    public void checkFifthCityLink(){
        $(fifthCityLink).shouldBe(visible);
        $(fifthCityLink).shouldHave(text("Погода в Днепре"));
    }

    public void clickOnFifthCityLink(){$(fifthCityLink).click();}

    public void checkSixthCityLink(){
        $(sixthCityLink).shouldBe(visible);
        $(sixthCityLink).shouldHave(text("Погода в Луганске"));
    }

    public void clickOnSixthCityLink(){$(sixthCityLink).click();}

    public void checkSeventhCityLink(){
        $(seventhCityLink).shouldBe(visible);
        $(seventhCityLink).shouldHave(text("Погода во Львове"));
    }

    public void clickOnSeventhCityLink(){$(seventhCityLink).click();}

    public void checkEighthCityLink(){
        $(eighthCityLink).shouldBe(visible);
        $(eighthCityLink).shouldHave(text("Погода в Чернигове"));
    }

    public void clickOnEighthCityLink(){$(eighthCityLink).click();}

    public void checkNinethCityLink(){
        $(ninethCityLink).shouldBe(visible);
        $(ninethCityLink).shouldHave(text("Погода в Николаеве"));
    }

    public void clickONinethCityLink(){$(ninethCityLink).click();}

    public void checkTenthCityLink(){
        $(tenthCityLink).shouldBe(visible);
        $(tenthCityLink).shouldHave(text("Погода в Сумах"));
    }

    public void clickOnTenthCityLink(){$(tenthCityLink).click();}

    public void checkEleventhCityLink(){
        $(eleventhCityLink).shouldBe(visible);
        $(eleventhCityLink).shouldHave(text("Погода в Полтаве"));
    }

    public void clickOnEleventhCityLink(){$(eleventhCityLink).click();}

    public void checkTwelwethCityLink(){
        $(twelvethCityLink).shouldBe(visible);
        $(twelvethCityLink).shouldHave(text("Погода в Херсоне"));
    }

    public void clickOnTwelvethCityLink(){$(twelvethCityLink).click();}

    public void checkThirteenthCityLink(){
        $(thirteenthCityLink).shouldBe(visible);
        $(thirteenthCityLink).shouldHave(text("Погода в Виннице"));
    }

    public void clickOnThirteenthCityLink(){$(thirteenthCityLink).click();}

    public void checkFourteenthCityLink(){
        $(fourteenthCityLink).shouldBe(visible);
        $(fourteenthCityLink).shouldHave(text("Погода в Симферополе"));
    }

    public void clickOnFourteenthCityLink(){$(fourteenthCityLink).click();}

    public void checkFifteenthCityLink(){
        $(fifteenthCityLink).shouldBe(visible);
        $(fifteenthCityLink).shouldHave(text("Погода в Житомире"));
    }

    public void clickOnFifteenthCityLink(){$(fifteenthCityLink).click();}
}


