package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class ClassFilterPosition (
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
    fun getFilterPosition(employeeReposytory: EmployeeReposytory){
        print("Введите первые буквы должности: ")
        var userInput = readln()
        var resultFilterPosition: List<Employee> = employeeReposytory.listEmployee.filter { it.position!!.startsWith(userInput)}

        var filterCounter =0

        while (filterCounter<resultFilterPosition.size){
            println("${resultFilterPosition.elementAt(filterCounter).lastName} работает в должности ${resultFilterPosition.elementAt(filterCounter).position}")
            filterCounter++
        }
    }
}