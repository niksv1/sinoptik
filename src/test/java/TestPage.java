
import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPage extends SinoptikPage{

        @BeforeTest
        public void gotoSinoptikPage(){
                openSinoptikPage();
        }

    @Test(priority = 1)
public void userCanSeeSinoptikLogo() {
        System.out.println("Test userCanSeeSinoptikLogo is running...");
        checkSinoptikLogo();
        System.out.println("Test userCanSeeSinoptikLogo successfully completed");
        }

@org.testng.annotations.Test(priority=2)
public void userCanClickOnSinoptikLogo() {
        System.out.println("Test userCanClickOnSinoptikLogo is running...");
        clickOnSinoptikLogo();
        System.out.println("Test userCanClickOnSinoptikLogo successfully completed");
        }

@org.testng.annotations.Test(priority=3)
public void userCanSeeSearchField() {
        System.out.println("Test userCanSeeSearchField is running...");
        checkSearchField();
        System.out.println("Test userCanSeeSearchField successfully completed");
        }

        @org.testng.annotations.Test(priority=4)
public void userCanTypeOnSearchField() {
        System.out.println("Test userCanTypeOnSearchField is running...");
        typeOnSearchField("good job");
        System.out.println("Test userCanTypeOnSearchField successfully completed");
        }

        @org.testng.annotations.Test(priority=5)
public void userCanSeeSearchButton() {
        System.out.println("Test userCanSeeSearchButton is running...");
        checkSearchButton();
        System.out.println("Test userCanSeeSearchButton successfully completed");
        }

        @org.testng.annotations.Test(priority=6)
public void userCanClickOnSearchButton() {
        clickOnSearchButton();
        System.out.println("Test userCanClickOnSearchButton is running...");
        System.out.println("Test userCanClickOnSearchButton successfully completed");
        }

        @org.testng.annotations.Test(priority=7)
public void userCanSeeSinoptikSlang() {
        System.out.println("Test userCanSeeSinoptikSlang is running...");
        checkSinoptikSlang();
        System.out.println("Test userCanSeeSinoptikSlang successfully completed");
        }

        @org.testng.annotations.Test(priority=8)
public void userCanSeeLanguageLink() {
        System.out.println("Test userCanSeeLanguageLink is running...");
        checkLanguageLink();
        System.out.println("Test userCanSeeLanguageLink successfully completed");
        }

        @org.testng.annotations.Test(priority=9)
public void userCanClickOnLanguageLink() {
        System.out.println("Test userCanClickOnLanguageLink is running...");
        clickOnLanguageLink();
        System.out.println("Test userCanClickOnLanguageLink successfully completed");
        }

        @org.testng.annotations.Test(priority=10)
public void userCanSeeCitiesButton() {
        System.out.println("Test userCanSeeCitiesButton is running...");
        checkCitiesButton();
        System.out.println("Test userCanSeeCitiesButton successfully completed");
        }

        @org.testng.annotations.Test(priority=11)
public void userCanClickOnCitiesButton() {
        System.out.println("Test userCanClickOnCitiesButton is running...");
        clickOnCitiesButton();
        System.out.println("Test userCanClickOnCitiesButton successfully completed");
        }

        @org.testng.annotations.Test(priority=12)
public void userCanSeeTextLabel() {
        System.out.println("Test userCanSeeTextLabel is running...");
        checkTextLabel();
        System.out.println("Test userCanSeeTextLabel successfully completed");
        }

        @org.testng.annotations.Test(priority=13)
public void userCanSeeSevenDaysLink() {
        System.out.println("Test userCanSeeSevenDaysLink is running...");
        checkSevenDaysLink();
        System.out.println("Test userCanSeeSevenDaysLink successfully completed");
        }

        @org.testng.annotations.Test(priority=14)
public void userCanClickOnSevenDaysLink() {
        System.out.println("Test userCanClickOnSevenDaysLink is running...");
        clickOnSevenDaysLink();
        System.out.println("Test userCanClickOnSevenDaysLink successfully completed");
        }

        @org.testng.annotations.Test(priority=15)
public void userCanSeeTenDaysLink() {
        System.out.println("Test userCanSeeTenDaysLink is running...");
        checkTenDaysLink();
        System.out.println("Test userCanSeeTenDaysLink successfully completed");
        }

        @org.testng.annotations.Test(priority=16)
public void userCanClickOnTenDaysLink() {
        System.out.println("Test userCanClickOnTenDaysLink is running...");
        clickOnTenDaysLink();
        System.out.println("Test userCanClickOnTenDaysLink successfully completed");
        }

        @org.testng.annotations.Test(priority=17)
public void userCanSeeWeatherOnMapLink() {
        System.out.println("Test userCanSeeWeatherOnMapLink is running...");
        checkWeatherOnMapLink();
        System.out.println("Test userCanSeeWeatherOnMapLink successfully completed");
        }

        @org.testng.annotations.Test(priority=18)
public void userCanClickOnWeatherOnMapLink() {
        System.out.println("Test userCanClickOnWeatherOnMapLink is running...");
        clickOnWeatherOnMapLink();
        System.out.println("Test userCanClickOnWeatherOnMapLink successfully completed");
        }

        @org.testng.annotations.Test(priority=19)
public void userCanSeeFirstDayWeather() {
        System.out.println("Test userCanSeeFirstDayWeather is running...");
        checkFirstDayWeather();
        System.out.println("Test userCanSeeFirstDayWeather successfully completed");
        }

        @org.testng.annotations.Test(priority=20)
public void userCanClickOnFirstDayWeather() {
        System.out.println("Test userCanClickOnFirstDayWeather is running...");
        clickOnFirstDayWeather();
        System.out.println("Test userCanClickOnFirstDayWeather successfully completed");
        }
        @org.testng.annotations.Test(priority=21)
public void userCanSeeSecondDayWeather() {
        System.out.println("Test userCanSeeSecondDayWeather is running...");
        checkSecondDayWeather();
        System.out.println("Test userCanSeeSecondDayWeather successfully completed");
        }

        @org.testng.annotations.Test(priority=22)
public void userCanClickOnSecondDayWeather() {
        System.out.println("Test userCanClickOnSecondDayWeather is running...");
        clickOnSecondDayWeather();
        System.out.println("Test userCanClickOnSecondDayWeather successfully completed");
        }

        @org.testng.annotations.Test(priority=23)
public void userCanSeeThirdDayWeather() {
        System.out.println("Test userCanSeeThirdDayWeather is running...");
        checkThirdDayWeather();
        System.out.println("Test userCanSeeThirdDayWeather successfully completed");
        }

        @org.testng.annotations.Test(priority=24)
public void userCanClickOnThirdDayWeather() {
        System.out.println("Test userCanClickOnThirdDayWeather is running...");
        clickOnThirdDayWeather();
        System.out.println("Test userCanClickOnThirdDayWeather successfully completed");
        }






        }