package Task1.Data

import Task1.Domain.Models.Employee

class EmployeeReposytory
{

    var i:Int =0
    var employee = Employee(
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null)


    var listEmployee = mutableListOf<Employee>()


    fun printList() {
        println("показать всё")
        println("""
            ---------------------------------------------------------------------------------------------------------------------------------------
            | Фамилия         | Имя             | Отчество        | Должность       | Отдел           | Ссылка на фото  | Дата род.  | Дата начала|
            ---------------------------------------------------------------------------------------------------------------------------------------
        """.trimIndent())


        for (item in listEmployee)
            println(
                "| ${item.lastName + (" ".repeat(15 - item.lastName!!.length))} | " +
                        "${item.firstName + (" ".repeat(15 - item.firstName!!.length))} | " +
                        "${item.patronymic + (" ".repeat(15 - item.patronymic!!.length))} | " +
                        "${item.position + (" ".repeat(15 - item.position!!.length))} | " +
                        "${item.department + (" ".repeat(15 - item.department!!.length))} | " +
                        "${item.urlPhoto + (" ".repeat(15 - item.urlPhoto!!.length))} | " +
                        "${item.birthDate + (" ".repeat(10 - item.birthDate!!.length))} | " +
                        "${item.startDate + (" ".repeat(10 - item.startDate!!.length))} |")
        println("""
            ---------------------------------------------------------------------------------------------------------------------------------------
        """.trimIndent())

    }

}
