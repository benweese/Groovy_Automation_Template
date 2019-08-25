package pages

import geb.Page
import modules.SideMenuModule

class WebmasterPage extends Page{
    static url = "Websites/Webmaster/"
    static at = { title.startsWith("Webmaster") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
