package com.easy.wetherinfo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WetherInfoApplication

fun main(args: Array<String>) {
    runApplication<WetherInfoApplication>(*args)
}
