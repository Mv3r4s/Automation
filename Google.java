import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        System.out.println("Hello Wold!");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        String googleTitle = driver.getTitle();
        if (googleTitle.equals("Hi Google")) {
            System.out.println("pass");
        } else {
            System.out.println("didnt pass");
        }

        driver.navigate().to("https://amazon.com");
        System.out.println(driver.getTitle());
        String amazonTitle = driver.getTitle();
        if (amazonTitle.equals("Hey Google")) {
            System.out.println("pass");
        } else {
            System.out.println("didnt pass");
        }


        driver.navigate().to("https://cashwise.us");
        System.out.println(driver.getTitle());
        String cashwiseTitle = driver.getTitle();
        if (cashwiseTitle.equals("Cashwise is the best")) {
            System.out.println("pass");
        } else {
            System.out.println("didnt pass");
        }
        driver.navigate().back();
        driver.navigate().to("https://cashwise.us/home");




        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();



    }
}
