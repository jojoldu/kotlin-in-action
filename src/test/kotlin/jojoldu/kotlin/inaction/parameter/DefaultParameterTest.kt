package jojoldu.kotlin.inaction.parameter

import io.kotest.core.spec.style.AnnotationSpec
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class DefaultParameterTest {
	
	@Test
	fun defaultParameter() {
		val order = Order("name")
		order.discount()
	}
}

class Order(var name: String) {
	fun discount(now: LocalDateTime = LocalDateTime.now()) {
		println(now.toString())
	}
}
