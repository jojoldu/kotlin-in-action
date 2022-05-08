package jojoldu.kotlin.inaction.`null`

import io.kotest.core.spec.style.AnnotationSpec

class NullTest: AnnotationSpec() {

    @Test
    fun `Null Safe`() {
        val user = User("test")
        requireNotNull(user.name)
    }
}

class User(var name: String)
