package backend.venxpo

import auth.User

class BootStrap {

    def init = { servletContext ->

        User user = new User()
        user.name = "Arif"
        user.address = "Gurgoan"
        user.save(flush:true)

    }
    def destroy = {
    }
}
