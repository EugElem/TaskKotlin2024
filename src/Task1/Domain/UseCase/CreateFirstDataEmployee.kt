package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class CreateFirstDataEmployee(
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
    lateinit var employee: Employee
    fun createData(employeeReposytory: EmployeeReposytory) {
        employee = Employee(
            "Иванов",
            "Иван",
            "Иванович",
            "1977",
            "бухгалтер",
            "бухгалтерия",
            "нет",
            "2003",
        )
        employeeReposytory.listEmployee.add(employee)

        employee = Employee(
            "Петров",
            "Иван",
            "Петрович",
            "1988",
            "специалист",
            "отдел продаж",
            "нет",
            "2020",
        )
        employeeReposytory.listEmployee.add(employee)

        employee = Employee(
            "Сидоров",
            "Сидор",
            "Сидорович",
            "1970",
            "менеджер",
            "отдел продаж",
            "нет",
            "2014",
        )
        employeeReposytory.listEmployee.add(employee)
    }
}