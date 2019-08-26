# Groovy_Automation
This project is for practiceing Groovy, Geb, and Spock. 

## Badges
[![CircleCI](https://circleci.com/gh/benweese/Groovy_Automation/tree/master.svg?style=shield)](https://circleci.com/gh/benweese/Groovy_Automation/tree/master) ![GitHub](https://img.shields.io/github/license/benweese/Groovy_Automation.svg) [![Known Vulnerabilities](https://snyk.io/test/github/benweese/Groovy_Automation/badge.svg)](https://snyk.io/test/github/benweese/Groovy_Automation) ![GitHub issues](https://img.shields.io/github/issues-raw/benweese/Groovy_Automation.svg) [![StackShare](http://img.shields.io/badge/tech-stack-0690fa.svg?style=flat)](https://stackshare.io/benweese/groovy-automation)

## Motivation
This is to keep my automations skills sharp.

## Notification
This automation is happy path only and does not test for failures. It is an example and learning on how it can done. If you wish to test more thoroughly then I would suggest using Cucumber and Scenario Outlines to test many different scenarios including failures.

## Tools

<b>BDD framework used</b>
- [Book of Geb](https://gebish.org/manual/current/)

<b>Built with</b>
- [Intellij Community](https://www.jetbrains.com/idea/)

<b>Continuous Intergration</b>
- [CircleCI](https://circleci.com/)

<b>Depandacy Maintenance </b>
- [Dependabot by Github](https://dependabot.com/)

<b>Downloads</b>
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

<b>Spock</b>
- [Spock Framework](http://spockframework.org/)

## Features
With testing our Circle-CI runner will use maven to run our automation scripts in Command line.

## Code Example
<b>Setup</b>
```
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
```
<b>Test</b>
```
def "Can get to Software Testing"(){
       when:
       to BenWeeseDevHome

       then:
       sideMenu.links[1].text().startsWith("Software Testing")

       when:
       sideMenu.links[1].click()

       then:
       at SoftwareTestingPage

   }
```

<b>Page Object</b>
```
class SoftwareTestingPage extends Page{
    static url = "QA/softwaretesting/"
    static at = { title.startsWith("Software Testing") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
```

<b>Module</b>
```
class SideMenuModule extends Module{
    static content = {
        linksContainer { $(".navigation-list") }
        links { linksContainer.find("a") }
    }
}
```

## Other Examples
- [Geb Github](https://github.com/geb/geb-example-gradle)
- [Automation School](https://github.com/AutomationSchool/geb-and-spock-automation-examples)

## Credits
[Ben Weese](https://benweese.dev)
