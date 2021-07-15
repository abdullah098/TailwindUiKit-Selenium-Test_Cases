import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Signup_to_components_logout {

    WebDriverAndTimeout wdat = new WebDriverAndTimeout();
    String webUrl = "https://tailwinduikit.com/";


    @Test
    public void SignupComponentsLogout(){
        wdat.StartWebBro();
        wdat.driver.get(webUrl);
        wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/a/button")).click();
        wdat.timeOut3Sec();
        wdat.driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[5]/p[2]/a")).click();
        wdat.timeOut3Sec();
        wdat.driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Abdullah");
        wdat.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abdullah.alphasquad@gmail.com");
        wdat.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789@.098");
        wdat.timeOut3Sec();

        WebElement element = wdat.driver.findElement(By.xpath("//*[@id=\"signupbtn\"]"));
        Actions actions = new Actions(wdat.driver);
        actions.moveToElement(element).click().perform();


//            wdat.driver.findElement(By.xpath("//*[@id=\"signupbtn\"]")).click();


        wdat.timeOut3Sec();
        wdat.driver.findElement(By.xpath("//*[@id=\"boxed_layout\"]/div[1]")).click();
        wdat.timeOut3Sec();

        //Add to collection button +
        wdat.driver.findElement(By.xpath("//*[@id=\"collectionTriggerBtn0\"]")).click();
        wdat.timeOut3Sec();
        wdat.driver.findElement(By.xpath("//*[@id=\"addNewCollection\"]")).click();
        wdat.timeOut3Sec();

        //Name of your collection
        wdat.driver.findElement(By.xpath("//*[@id=\"collectionName\"]")).sendKeys("Test");
        wdat.timeOut3Sec();
        //click create collection
        wdat.driver.findElement(By.xpath("//*[@id=\"addNewCollection\"]")).click();
        //click x to close create colection
        wdat.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/button")).click();
        wdat.timeOut3Sec();

        //click <> button
        wdat.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div")).click();
        wdat.timeOut3Sec();
        //click angular button
        wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[2]")).click();
        wdat.timeOut3Sec();
        //click reactjs button
        wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[3]")).click();
        wdat.timeOut3Sec();
        //click vue button
        wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[4]")).click();
        wdat.timeOut3Sec();

        //dropdown for logout
        wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div/div[1]")).click();
        wdat.timeOut3Sec();
        wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/div/div[2]/div/p[2]")).click();
    }



    //Sign in test
    @Test
    public void SignIn(){
        wdat.StartWebBro();
        wdat.driver.get(webUrl);
        wdat.timeOut3Sec();
        wdat.driver.manage().window().maximize();

        //click login
        wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/a/button")).click();
        wdat.timeOut3Sec();

        //enter email adn pass
        wdat.driver.findElement(By.xpath("//*[@id=\"email2\"]")).sendKeys("abdullah.alphasquad@gmail.com");
        wdat.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456789@.098");
        wdat.timeOut3Sec();

        //press login
        wdat.driver.findElement(By.xpath("//*[@id=\"btnlog\"]")).click();
        wdat.timeOut3Sec();

        //press component
        wdat.timeOut3Sec();
        try {
            WebElement componentButton = wdat.driver.findElement(By.xpath("//*[@id=\"componentsMenu\"]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(componentButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }

        wdat.timeOut3Sec();

        //click box layout
        try{
            WebElement BoxL = wdat.driver.findElement(By.xpath("//*[@id=\"boxed_layout\"]/div[1]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(BoxL).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();

        //click on add button +
        wdat.timeOut3Sec();
        try{
            WebElement addComponent = wdat.driver.findElement(By.xpath("//*[@id=\"collectionTriggerBtn0\"]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(addComponent).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //after popup new add+
        try{
            WebElement addComp = wdat.driver.findElement(By.xpath("//*[@id=\"addNewCollection\"]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(addComp).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //write name to the collection
        wdat.driver.findElement(By.xpath("//*[@id=\"collectionName\"]")).sendKeys("Test");
        wdat.timeOut3Sec();
        //click create
        try{
            WebElement CreateComp = wdat.driver.findElement(By.xpath("//*[@id=\"addNewCollection\"]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(CreateComp).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //close pop up add to cart
        try{
            WebElement closeCreateComp = wdat.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/button"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(closeCreateComp).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();


        //click <> code button
        try{
            WebElement clickCodeButton = wdat.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[2]/div"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(clickCodeButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //click on angular
        try{
            WebElement clickAngularButton = wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[2]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(clickAngularButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //click react button
        try{
            WebElement clickReactButton = wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[3]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(clickReactButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //click vue button
        try{
            WebElement clickVueButton = wdat.driver.findElement(By.xpath("//*[@id=\"filters\"]/div[4]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(clickVueButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();


        //click on info dropdown
        try{
            WebElement infoDropdownButton = wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/div[3]/div/div/div"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(infoDropdownButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();
        //click logout
        try{
            WebElement logoutButton = wdat.driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[2]/div[3]/div/div/div[2]/div/p[2]"));
            Actions actions = new Actions(wdat.driver);
            actions.moveToElement(logoutButton).click().perform();
        }catch (Exception e){
            System.out.println(e);
        }
        wdat.timeOut3Sec();

    }









}
