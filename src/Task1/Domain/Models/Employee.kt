package Task1.Domain.Models

import java.text.DateFormat

open class Employee(
    var lastName:String?,
    var firstName: String?,
    var patronymic:String?,
    var birthDate: String?,
    var position: String?,
    var department: String?,
    var urlPhoto: String?,
    var startDate: String?,
) {
    open fun showAll(){
        //println("$lastName $firstName $patronymic $birthDate $department $position $startDate")

        println("""
            | ${lastName} | $firstName | $patronymic | $birthDate | $position | $department | $urlPhoto | $startDate |
        """.trimIndent())
    }
}