package com.easy.wetherinfo.WebScrapping

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

class Scrapper {
    private val url:String = "https://weather.com/weather/today/l/ff6038bf29f21248018fca02ec5f0ccea1ff6261e05b46b1a9011f283568a2e1"
    private val doc:Document = Jsoup.connect(url).get()
    val mainDiv:Elements = doc.select("div#WxuHourlyWeatherCard-main-29584a07-3742-4598-bc2a-f950a9a4d900.removeIfEmpty")
    fun scrappeTemperature()
    {
        for(element:Element in mainDiv)
        {
           val span = element.select("span[data-testid=\"TemperatureValue\"]")
           val temperature= span.text().trim().replace("\"","").replace("°","")
            println(temperature)

        }
    }
    fun scrappeRainChance()
    {
        for(element:Element in mainDiv)
        {
            val span = element.select("span[data-testid=\"TemperatureValue\"]")
            val temperature= span.text().trim().replace("\"","").replace("°","")
            println(temperature)

        }
    }
}