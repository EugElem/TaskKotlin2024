package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class FilterStart (
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
){
    fun getFilterStart(employeeReposytory: EmployeeReposytory){
        println("Введите год, относительного которого выполняется фильтрация и какой период - до или после введенного года")
        print("Введите год: ")
        var userInputYear = readln()
        print("Введите '1' - если до введеного года включительно или '2' - если после: ")
        var userInputPeriod = readln()
        var resultFilterStart: List<Employee>
        if (userInputPeriod.toInt() ==1) {
            resultFilterStart =
                employeeReposytory.listEmployee.filter { it.startDate!! <= userInputYear }
        }
        else {
            resultFilterStart =
                employeeReposytory.listEmployee.filter { it.startDate!! < userInputYear }
        }


        var filterCounter =0

        while (filterCounter<resultFilterStart.size){
            println("${resultFilterStart.elementAt(filterCounter).lastName} работает с ${resultFilterStart.elementAt(filterCounter).startDate}  " )
            filterCounter++
        }
    }
}