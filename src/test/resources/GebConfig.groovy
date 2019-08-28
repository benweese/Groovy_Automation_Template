import com.aoe.gebspockreports.GebReportingListener
import io.github.bonigarcia.wdm.ChromeDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

waiting {
    timeout = 5 //default
    retryInterval = 0.5

    //"named" timeout configurations
    slow { timeout = 10 }
    slower { timeout = 20 }
}

baseNavigatorWaiting = true
atCheckWaiting = true
reportOnTestFailureOnly = false
autoClearCookies = false
reportingListener = new GebReportingListener()
reportsDir = 'build/geb-spock-reports'

driver = {
    ChromeDriverManager.chromedriver().setup()
    new ChromeDriver()
}


environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = {
            ChromeOptions chromeOptions = new ChromeOptions()
            chromeOptions.addArguments("--disable-popup-blocking")
            chromeOptions.addArguments("--no-sandbox")
            chromeOptions.addArguments("--disable-gpu")
            chromeOptions.addArguments("--window-size=1400x1200")
            chromeOptions.addArguments("--disable-extensions")
            ChromeDriverManager.chromedriver().setup()
            new ChromeDriver(chromeOptions)
        }
    }

    // run via “./gradlew chromeHeadlessTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chromeHeadless {
        driver = {
            ChromeOptions chromeOptions = new ChromeOptions()
            chromeOptions.addArguments("--disable-popup-blocking")
            chromeOptions.addArguments("--no-sandbox")
            chromeOptions.addArguments("--disable-gpu")
            chromeOptions.addArguments("--window-size=1400x1200")
            chromeOptions.addArguments("--disable-extensions")
            chromeOptions.addArguments('headless')
            ChromeDriverManager.chromedriver().setup()
            new ChromeDriver(chromeOptions)
        }
    }
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://benweese.dev"