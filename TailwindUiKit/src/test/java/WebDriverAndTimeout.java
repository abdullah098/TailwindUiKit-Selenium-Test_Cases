import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverAndTimeout {

    WebDriver driver;


    //Starts the web brouser Chrome
    public void StartWebBro(){

        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        this.driver = new ChromeDriver();

    }

    public void timeOut3Sec(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
