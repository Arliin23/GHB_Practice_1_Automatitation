package Org.GBH.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PracticeGBH {

    private static ChromeDriver driver;
    private static WebDriverWait wait;
    private static WebElement solutionButton;
    private static WebElement aboutUsButton;

    public static void main(String[] args) {

        //Locate chromedriver

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        //Variable
        driver = new ChromeDriver();
        String BaseUrl = "https://gbh.com.do/es/";
        String homeTitle;
        WebElement genericBtn;


        //Open browser
        driver.get(BaseUrl);

        //HOME PAGE

        //Comparing the title of the page to know if you are in the home page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("GBH")) {
            System.out.print(" Estas en la página principal\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //INNOVATION SQUAD PAGE

        //Go to the Innovation Squad page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        genericBtn = driver.findElement(By.xpath("//*[@id=\"menu-item-4139\"]/a/span[1]"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the Innovation Squad page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Innovation Squad")) {
            System.out.print(" Estas en la página de Innovation Squad\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //IT BUSINESS TRANSFORMATION

        //Go to the IT Business Transformation page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        genericBtn = driver.findElement(By.xpath("//*[@id=\"menu-item-4140\"]/a/span[1]"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the IT Business Transformation page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("VCIO")) {
            System.out.print(" Estás en la página de IT Bussiness Trasnfomation Page\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //CUSTOM SOFTWARE DEVELOPMENT

        //Go to the Custom Software Development page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4141 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the Custom Software Development page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Custom Software Development")) {
            System.out.print(" Estas en la página de Custom Software Development\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //AGENT OF CHANGE STAFF AUGMENTATION

        //Go to the Agent of Change Staff Augmentation page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4142 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the Agent of Change Staff Augmentation page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Staff Augmentation")) {
            System.out.print(" Estas en la página de Agent of Change Staff Augmentation\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //IT SUPPORT SERVICE - IT FOUNDATION

        //Go to the IT Support Service -> IT FOUNDATION page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        clickItBtn();
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4146 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the IT Support Service - IT FOUNDATION page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Soporte de TI")) {
            System.out.print(" Estas en la página de Soporte de TI\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //IT SUPPORT SERVICE -> IT Protection & Security

        //Go to the IT Support Service -> IT Protection & Security page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        clickItBtn();
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4144 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the IT Support Service - IT Protection & Security page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("IT Protection & Support")) {
            System.out.print(" Estas en la página de IT Protection & Support\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //IT SUPPORT SERVICE -> Comparación de Productos

        //Go to the IT Support Service -> Comparación de Productos
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        clickItBtn();
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4145 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the IT Support Service
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Servicios de soporte de TI")) {
            System.out.print(" Estas en la página de Servicios de soporte de TI\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //NETWORK SOLUTIONS

        //Go to the Network Solutions page
        solutionButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4135\"]/a/span[2]"));
        waitElement(solutionButton);
        hoverLists(solutionButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4160 > a > span.menu-item__text"));
        clickButton(genericBtn);

        //Comparing title of the page to know if you are in the Network Solutions
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Network Solutions")) {
            System.out.print(" Estas en la página de Network Solutions\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }

        //ABOUT US
        //Go to the About Us page
        aboutUsButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4132\"]/a/span[2]"));
        waitElement(aboutUsButton);
        hoverLists(aboutUsButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4133 > a > span.menu-item__text"));
        clickButton(genericBtn);
        //Comparing title of the page to know if you are in the About Us page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Sobre Nosotros")) {
            System.out.print(" Estas en la página Sobre Nosotros\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }
        //LO QUE NOS DIFERENCIA
        //Go to the Lo que nos diferencia page
        aboutUsButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4132\"]/a/span[2]"));
        waitElement(aboutUsButton);
        hoverLists(aboutUsButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4134 > a > span.menu-item__text"));
        clickButton(genericBtn);
        //Comparing title of the page to know if you are in the Lo que nos diferencia page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Lo que nos diferencia")) {
            System.out.print(" Estas en la página Lo que nos diferencia\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }
        //BLOG
        //Go to the Blog page
        aboutUsButton = driver.findElement(By.xpath("//*[@id=\"menu-item-4132\"]/a/span[2]"));
        waitElement(aboutUsButton);
        hoverLists(aboutUsButton);
        genericBtn = driver.findElement(By.cssSelector("#menu-item-4664 > a > span.menu-item__text"));
        clickButton(genericBtn);
        //Comparing title of the page to know if you are in the Blog page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Blog")) {
            System.out.print(" Estas en la página Blog\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }
        //CASOS DE ESTUDIO
        //Go to the Casos de estudio page
        genericBtn = driver.findElement(By.cssSelector("#menu-item-2979 > a > span.menu-item__text"));
        clickButton(genericBtn);
        //Comparing title of the page to know if you are in the Casos de estudio page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Casos de estudios")) {
            System.out.print(" Estas en la página Casos de estudios\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }
        //JOBS
        //Go to the JOBS page
        genericBtn = driver.findElement(By.cssSelector("#menu-item-2980 > a > span.menu-item__text"));
        clickButton(genericBtn);
        //Comparing title of the page to know if you are in the JOBS page
        homeTitle = driver.getTitle();
        if (homeTitle.contains("Empleos")) {
            System.out.print(" Estas en la página Empleos\n");
        } else {
            System.out.print(" El titulo vino vacio");
            System.exit(1);
        }
        //Close browser
        driver.quit();
    }
    //Method for hover
    public static void hoverLists(WebElement button){
        //hover Action
        Actions action = new Actions(driver);
        action.moveToElement(button).perform();
    }
    //Method for wait for a element to appear
    public static void waitElement(WebElement element){
        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //Method for clicking the IT SUPPORT Button
    public static void clickItBtn(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#menu-item-4143 > a > span.menu-item__text"));
        clickButton(button);
    }
    //Method for wait for buttons to load and click on them
    public static void clickButton(WebElement button){
        waitElement(button);
        button.click();
    }
}
