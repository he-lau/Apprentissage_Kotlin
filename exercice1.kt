enum class STATUS {
    STUDENT,
    PROFESSOR,
    OTHER
}

class PERSON(
    val firstname: String,
    val lastname: String,
    //val age: OptionalInt,
    val age: Int,
    val status: STATUS,
    var isAuthorized: Boolean
)
{
    fun isMajor(): Boolean {
        if(this.age>=18)
            return true
        return false
    }
    fun isMajorInAMerica(): Boolean {
        if(this.age>=21)
            return true
        return false
    }

}

fun main() {

    var p1 = PERSON("Alice", "last", 18, STATUS.OTHER, false)

    if (p1.isMajor())
        print("p1 majeur\n")
    else {
        print("p1 mineur\n")
        p1.isAuthorized = false
    }

    when (p1.status) {
        STATUS.PROFESSOR -> print("p1 prof\n")
        STATUS.STUDENT -> print("p1 eleve\n")
        else -> {
            p1.isAuthorized = false
        }
    }

    if (p1.isAuthorized)
        print("p1 autorisé à rentré\n")
    else
        print("p1 non autorisé à rentré\n")
}