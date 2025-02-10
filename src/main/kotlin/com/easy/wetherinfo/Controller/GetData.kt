package com.easy.wetherinfo.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/WeatherData" )
class GetData {
    //Aqui dentro vai ser onde eu apenas pego os dados e envio na requisição
    @GetMapping
    fun dados(): String {return "hoje vai fazer 15 grau"}

}
