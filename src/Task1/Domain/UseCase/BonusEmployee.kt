package Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee
import java.text.SimpleDateFormat
import java.util.*

class BonusEmployee(
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

    fun chooseEmployeeToBonus(employeeReposytory: EmployeeReposytory) {
        println("Сотрудников: ${employeeReposytory.listEmployee.size}")

        for (onceEmployee in employeeReposytory.listEmployee) {
            println("${onceEmployee.lastName}")
        }
        print("Введите cтаж для начисления бонуса ")
        var cooseOfUser = readln()

        // поиск записей со стажем не менее введенного
        val workExperienceEmlpoyeeToEdit = cooseOfUser
        j = 0

        val sdf = SimpleDateFormat("yyyy")
        val currentDate = sdf.format(Date())
        println(" Текущий год  $currentDate")

        for (onceEmployee in employeeReposytory.listEmployee) {

            if ((currentDate.toInt() - onceEmployee.startDate!!.toInt() >= workExperienceEmlpoyeeToEdit.toInt()) ){
                println(" Год начала работы сотрудника по фамилии ${onceEmployee.lastName}  ${onceEmployee.startDate}")
            }
            j++
        }
    }
}