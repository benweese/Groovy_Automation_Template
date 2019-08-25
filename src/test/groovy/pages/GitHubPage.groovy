package pages

import geb.Page
import modules.SideMenuModule

class GitHubPage extends Page{
    static url = "github/"
    static at = { title.startsWith("GitHub") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
