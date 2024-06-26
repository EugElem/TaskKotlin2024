package Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class DeleteEmployee(
    lastName: String? = null,
    firstName: String? = null,
    patronymic: String? = null,
    position: String? = null,
    department: String? = null,
    urlPhoto: String? = null,
    birthDate: String? = null,
    startDate: String? = null,
) : Employee(
    lastName,
    firstName,
    patronymic,
    position,
    department,
    urlPhoto,
    birthDate,
    startDate,
) {

    var j: Int = 0

    fun chooseEmployeeToDelete(employeeReposytory: EmployeeReposytory) {
        println("Сотрудников: ${employeeReposytory.listEmployee.size}")

        // отображения списка сотрудников
        employeeReposytory.printList()

        print("Введите фамилию ")
        var cooseOfUser = readln()

        // поиск записи с введенной пользователем фамилией
        j = 0
        var boolLastNameEmlpoyeeToEdit = false
        while (boolLastNameEmlpoyeeToEdit != true) {
            boolLastNameEmlpoyeeToEdit =
                employeeReposytory.listEmployee.elementAt(j).lastName == cooseOfUser
            println(
                "${employeeReposytory.listEmployee.elementAt(j).firstName}| " +
                        "${employeeReposytory.listEmployee.elementAt(j).lastName} | $j | $boolLastNameEmlpoyeeToEdit"
            )
            if (boolLastNameEmlpoyeeToEdit == true) {
                println("Вы подтверждаете удаление сотудника по фамилии ${employeeReposytory.listEmployee.elementAt(j).lastName}?")
                val delete = readln()
                if (delete == "да") employeeReposytory.listEmployee.removeAt(j)
                else println("Вы пожалели человака")
                break
            }
            else j++
        }
        // отображения списка сотрудников
        employeeReposytory.printList()
    }
}