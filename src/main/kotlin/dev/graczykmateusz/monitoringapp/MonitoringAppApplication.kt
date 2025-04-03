package dev.graczykmateusz.monitoringapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonitoringAppApplication

fun main(args: Array<String>) {
  runApplication<MonitoringAppApplication>(*args)
}
