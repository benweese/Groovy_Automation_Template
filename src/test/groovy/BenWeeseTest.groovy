import geb.Page
import geb.spock.GebSpec
import pages.BenWeeseDevHome
import pages.ComputersPage
import pages.GitHubPage
import pages.PodcastPage
import pages.SoftwareTestingPage
import pages.WebmasterPage


class BenWeeseTest extends GebSpec {

    static Page page

   def "Can get to Software Testing"(){
       when:
       to BenWeeseDevHome
       page = at BenWeeseDevHome

       then:
       page.sideMenu.links[1].text().startsWith("Software Testing")

       when:
       page.sideMenu.links[1].click()

       then:
       at SoftwareTestingPage

   }

    def "Can get to Webmaster"(){
        when:
        to BenWeeseDevHome
        page = at BenWeeseDevHome

        then:
        page.sideMenu.links[2].text().startsWith("Webmaster")

        when:
        page.sideMenu.links[2].click()

        then:
        at WebmasterPage
    }

    def "Can get to Podcast"(){
        when:
        to BenWeeseDevHome
        page = at BenWeeseDevHome

        then:
        page.sideMenu.links[3].text().startsWith("Podcast")

        when:
        page.sideMenu.links[3].click()

        then:
        at PodcastPage
    }

    def "Can get to Computers"(){
        when:
        to BenWeeseDevHome
        page = at BenWeeseDevHome

        then:
        page.sideMenu.links[4].text().startsWith("Computers")

        when:
        page.sideMenu.links[4].click()

        then:
        at ComputersPage
    }

    def "Can get to Github"(){
        when:
        to BenWeeseDevHome
        page = at BenWeeseDevHome

        then:
        page.sideMenu.links[5].text().startsWith("GitHub")

        when:
        page.sideMenu.links[5].click()

        then:
        at GitHubPage
    }

}
