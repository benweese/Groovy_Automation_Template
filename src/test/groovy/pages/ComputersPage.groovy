package pages

import geb.Page
import modules.SideMenuModule

class ComputersPage extends Page{
    static url = "computers/"
    static at = { title.startsWith("Computers") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
