import geb.spock.GebSpec
import pages.BenWeeseDevHome
import pages.SoftwareTestingPage

class BenWeeseTest extends GebSpec {

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

}
