//WITH_RUNTIME

fun convert(fromType: Class<*>, toType: Class<*>, value: Any): Any {
    return when (value) {
        is Number -> when (toType) {
            Char::class.java, Character::class.java -> value.toChar()
            else -> throw IllegalStateException("Unknown number conversion from ${fromType} to ${toType}")
        }
        else -> throw IllegalArgumentException("No primitive conversion for ${fromType} to ${toType} for value ${value}")
    }
}


fun box(): String {

    return "O" + convert(Integer::class.java, Character::class.java, 75)
}