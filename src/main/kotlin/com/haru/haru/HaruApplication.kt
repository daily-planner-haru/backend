package com.haru.haru

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HaruApplication

fun main(args: Array<String>) {
    runApplication<HaruApplication>(*args)
}
