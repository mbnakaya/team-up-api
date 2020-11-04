package com.team.up.api.controllers

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.register() {
    route("/test") {
        get {
            call.respond(HttpStatusCode.OK)
        }
    }
}