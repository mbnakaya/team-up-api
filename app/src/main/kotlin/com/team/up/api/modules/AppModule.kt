package com.team.up.api.modules

import com.team.up.api.controllers.register
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.routing.*

fun Application.module() {
    install(ContentNegotiation) {
        gson { setPrettyPrinting() }
    }
    install(DefaultHeaders)
    install(Routing) {
        register()
    }
}