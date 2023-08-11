package co.com.pragma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class StadisticsApp

fun main(args: Array<String>) {
    runApplication<StadisticsApp>(*args)
}
