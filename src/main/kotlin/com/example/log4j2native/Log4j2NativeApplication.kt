package com.example.log4j2native

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Log4j2NativeApplication

private val logger = LoggerFactory.getLogger(Log4j2NativeApplication::class.java)
fun main(args: Array<String>) {
	runApplication<Log4j2NativeApplication>(*args) {
		logger.info("working")
	}
}
