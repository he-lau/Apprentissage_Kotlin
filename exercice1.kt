enum class STATUS {
    STUDENT,
    PROFESSOR,
    OTHER
}
/*
class Person(
    val firstname: String,
    val lastname: String,
    //val age: OptionalInt,
    val age: Int,
    val status: STATUS,
    var isAuthorized: Boolean
) {
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


    override fun toString() = "$firstname $lastname"

}
*/

class Person(
    val firstname: String,
    val lastname: String,
    val age: Int,
    val status: STATUS
) {
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

    fun isValid(p:Person):Boolean{
        if (! p.isMajor()) {
            print("${p.toString()} n'est pas majeur.\n")
            return false
        }

        when (p.status) {
            STATUS.PROFESSOR -> { return true; print("${1.toString()} est prof\n") }
            STATUS.STUDENT -> { return true; print("${1.toString()} est élève\n") }
            else -> return false
        }

    }


    override fun toString() = "$firstname $lastname"

}



fun main() {
/*
    var p1 = Person("Alice", "Last", 18, STATUS.OTHER, false)

    if (p1.isMajor())
        print("${p1.toString()} est majeur\n")
    else {
        print("${p1.toString()} est mineur\n")
        p1.isAuthorized = false
    }

    when (p1.status) {
        STATUS.PROFESSOR -> print("${p1.toString()} est prof\n")
        STATUS.STUDENT -> print("${p1.toString()} est eleve\n")
        else -> {
            p1.isAuthorized = false
        }
    }

    if (p1.isAuthorized)
        print("${p1.toString()} est  autorisé à rentré\n")
    else
        print("${p1.toString()} n'est pas autorisé à rentré\n")


 */

    var personnes:List<Person> = emptyList<Person>()

    val _PERSONNES:List<Person> = listOf(
        Person("A","a",11, STATUS.OTHER),
        Person("B","b",33, STATUS.PROFESSOR),
        Person("C","c",18, STATUS.STUDENT),
        Person("D","d",15, STATUS.OTHER),
        Person("E","e",25, STATUS.PROFESSOR)
    )

    for (i in 0..(_PERSONNES.size-1)) {
        if(_PERSONNES[i].isValid(_PERSONNES[i]))
            personnes+=(_PERSONNES[i])
    }

    for (person in personnes) {
        print("${person.toString()} autorisé à rentré. \n")
    }

}

