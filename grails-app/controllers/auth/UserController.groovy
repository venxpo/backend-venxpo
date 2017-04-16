package auth

import grails.converters.JSON
import org.springframework.http.HttpStatus


class UserController {

    def save() {
        Map requestmap = [:]

        render requestmap as JSON
    }

    def update() {
        Map requestmap = [:]

        render requestmap as JSON
    }

    def show() {
        Map requestmap = [:]

        render requestmap as JSON
    }

    def search() {
        Map requestmap = [:]

        render requestmap as JSON
    }

    def handleException(Exception ex) {
        Map responseText = [:]
        response.setStatus(500)
        responseText = ["msg": HttpStatus.INTERNAL_SERVER_ERROR.name(), status: 500]
        return responseText
    }
}
