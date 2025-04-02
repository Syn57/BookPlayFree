package com.zachnr.bookplayfree.shared.ext

fun Int?.orZero(): Int = this ?: 0
fun Long?.orZero(): Long = this ?: 0L
fun Float?.orZero(): Float = this ?: 0F
