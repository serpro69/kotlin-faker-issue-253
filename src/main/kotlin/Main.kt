package io.github.serpro69

import io.github.serpro69.kfaker.faker

fun main() {
    val faker = faker {}
    println(faker.address.streetAddress())
}
