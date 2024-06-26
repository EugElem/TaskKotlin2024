package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class FilterName(
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
    fun getFilterName(employeeReposytory: EmployeeReposytory){
        print("Введите первые буквы для поиска по фамилии: ")
        var userInput = readln()
        var resultFilterName: List<Employee> = employeeReposytory.listEmployee.filter { it.lastName!!.startsWith(userInput)}

        var filterCounter =0

        while (filterCounter<resultFilterName.size){
                println(resultFilterName.elementAt(filterCounter).lastName)
            filterCounter++
        }
    }
}