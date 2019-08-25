package pages

import geb.Page
import modules.SideMenuModule

class BenWeeseDevHome extends Page{
    static at = { title == "Home - BenWeese.Dev" }

    static content = {
        sideMenu { module SideMenuModule }
    }
}
