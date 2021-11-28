package ru.denissin.kafkaapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaAppApplication

fun main(args: Array<String>) {
    runApplication<KafkaAppApplication>(*args)
}
