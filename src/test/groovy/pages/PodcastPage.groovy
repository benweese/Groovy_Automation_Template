package pages

import geb.Page
import modules.SideMenuModule

class PodcastPage extends Page{
    static url = "podcast/"
    static at = { title.startsWith("Podcast") }

    static content = {
        sideMenu { module(SideMenuModule) }
    }
}
