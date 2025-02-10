package com.easy.wetherinfo
import com.easy.wetherinfo.WebScrapping.Scrapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WetherInfoApplication

fun main(args: Array<String>) {
   val scrapper = Scrapper()
    scrapper.scrappeTemperature()
    scrapper.scrappeRainChance()
    runApplication<WetherInfoApplication>(*args)
}
