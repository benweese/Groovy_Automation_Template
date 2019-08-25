package modules

import geb.Module

class SideMenuModule extends Module{
    static content = {
        linksContainer { $(".navigation-list") }
        links { linksContainer.find("a") }
    }
}
