package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee
import java.text.SimpleDateFormat
import java.util.*

class FilterExperience (
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

    fun getFilterExperience(employeeReposytory: EmployeeReposytory){
        println("Введите стаж и какой вы хотите ыкидеть - больший или меньший")
        print("Введите стаж: ")
        var userInputExperience = readln()
        print("Введите '1' - если больший включительно или '2' - если меньший: ")
        var userInputPeriod = readln()

        var resultFilterExperience: List<Employee>
        val sdf = SimpleDateFormat("yyyy")
        val currentDate = sdf.format(Date())


        if (userInputPeriod.toInt() ==1) {
            resultFilterExperience =
                employeeReposytory.listEmployee.filter {currentDate.toInt() - it.startDate!!.toInt() >= userInputExperience.toInt()  }
        }
        else {
            resultFilterExperience =
                employeeReposytory.listEmployee.filter { currentDate.toInt() -it.startDate!!.toInt() < userInputExperience.toInt() }
        }


        var filterCounter =0

        while (filterCounter<resultFilterExperience.size){
            println("${resultFilterExperience.elementAt(filterCounter).lastName} имеет стаж ${(currentDate.toInt() - (resultFilterExperience.elementAt(filterCounter).startDate?.toInt()!!))}  " )
            filterCounter++
        }
    }
}