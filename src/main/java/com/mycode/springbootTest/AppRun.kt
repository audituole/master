package com.mycode.springbootTest


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object AppRun {


    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(AppRun::class.java)
    }
}
