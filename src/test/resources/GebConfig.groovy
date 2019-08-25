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
reportsDir = "target/execution-reports"

driver = { new ChromeDriver() }

environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = { new ChromeDriver() }
    }

    // run via “./gradlew chromeHeadlessTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chromeHeadless {
        driver = {
            ChromeOptions options = new ChromeOptions()
            options.addArguments('headless')
            options.addArguments("--no-sandbox")
            options.addArguments("--disable-gpu")
            options.addArguments("--window-size=1400x1200")
            options.addArguments("--disable-extensions")
            new ChromeDriver(options)
        }
    }
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://benweese.dev"