package com.embersol.website

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform