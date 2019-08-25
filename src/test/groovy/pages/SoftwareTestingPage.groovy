package pages

import geb.Page
import modules.SideMenuModule

class SoftwareTestingPage extends Page{
    static url = "QA/softwaretesting/"
    static at = { title.startsWith("Software Testing") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
