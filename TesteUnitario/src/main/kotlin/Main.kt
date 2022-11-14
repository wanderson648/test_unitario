fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x')
            countX++
        else if (strLower[i] == 'o')
            countO++
        i++
    }

    return countX == countO && countX != 0
}

fun abc(): Boolean {
    val str: String? = null
    return str!!.length == 0
}

fun lobby(age: Int, tpInvite: String, cod: String): String {
    if (age < 18)
        return "denied"

    if (tpInvite != "") {
        val typeInvite = tpInvite.lowercase()

        if (typeInvite != "common" && typeInvite != "premium" && typeInvite != "lux")
            return "denied"

        if (cod != "") {
            val code = cod.lowercase()

            return if (typeInvite == "common" && code.startsWith("xt"))
                "Welcome"
            else if ((typeInvite == "premium" || typeInvite == "lux") && code.startsWith("xl"))
                "Welcome"
            else
                "denied"
        }
    }
    return "denied"
}


