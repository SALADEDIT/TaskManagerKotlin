package ru.salad.TaskManagerKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaskManagerKotlinApplication

fun main(args: Array<String>) {
	runApplication<TaskManagerKotlinApplication>(*args)
}
