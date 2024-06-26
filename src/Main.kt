package Task1

import Task1.Data.EmployeeReposytory
import Task1.Domain.UseCase.AddEmployee
import Task1.Domain.UseCase.BonusEmployee
import Task1.Domain.UseCase.DeleteEmployee
import Task1.Task1.Domain.UseCase.*

var i = 100


var employeeReposytory = EmployeeReposytory()

fun main() {
    val createFirstDataEmployee = CreateFirstDataEmployee().createData(employeeReposytory)
    while (i != 0) {
        println(
            """
        -----------------------------------------------------
        |   Меню                                            |
        |    1. Принять сотрудника                          |
        |    2. Изменить данные сотрудника                  |
        |    3. Уволить сотрудника                          |
        |    4. Рассчитать премию                           |
        |    5. Офильтровать по фамилии                     |
        |    6. Офильтровать по дате устройства на работу   |
        |    7. Офильтровать по стажу                       |
        |    8. Отфильтровать по должности                  |
        |    0. Выход из приложения                         |
        -----------------------------------------------------
            
        """.trimIndent()
        )
        print("Введите номер пункта меню: ")
        i = readln().toInt()

        when (i) {
            1 -> addEmployee()
            2 -> updateEmployee()
            3 -> deleteEmployee()
            4 -> calculateBonus()
            5 -> filterLastName()
            6 -> filterStartDate()
            7 -> filterWorkExperience()
            8 -> filterPosition()
            0 -> {
                exit()
                break
            }
        }

        Thread.sleep(1000)
        println("Нажмите любую кнопку, чтобы подолжить")
        readln()
    }
}

// 1. Принять сотрудника
fun addEmployee() {
    var addEmployee = AddEmployee()
    addEmployee.getParametresNewEmployee()
    addEmployee.addNewEmployee(employeeReposytory)
    println("Данные принятого сотрудника сохранены")
    Thread.sleep(1000)
}

//2. Изменить данные сотрудника
fun updateEmployee() {
    var editEmployee = EditEmployee()
    editEmployee.chooseEmployeeToEdit(employeeReposytory)
    editEmployee.chooseParаmetrToEdit(employeeReposytory)
    println("Данные принятого сотрудника изменены")
    i = 1
}

//3. Уволить сотрудника
fun deleteEmployee() {
    val deleteEmployee = DeleteEmployee()
    deleteEmployee.chooseEmployeeToDelete(employeeReposytory)
    println("Данные сотрудника удалены")
}

//4. Рассчитать премию
fun calculateBonus() {
    val bonusEmployee = BonusEmployee()
    bonusEmployee.chooseEmployeeToBonus(employeeReposytory)
    println("Премии рассчитаны")
}

//5. Офильтровать по фамилии
fun filterLastName() {
    val filterName = FilterName()
    filterName.getFilterName(employeeReposytory)
    println("Фильтрация по фамилии выполнена")
}

//6. Офильтровать по дате устройства на работу
fun filterStartDate() {
    val filterStart = FilterStart()
    filterStart.getFilterStart(employeeReposytory)
    println("Фильтрация по дате устройства на работу выполнена")
}

//7. Офильтровать стажу
fun filterWorkExperience() {
    val filterExperience = FilterExperience()
    filterExperience.getFilterExperience(employeeReposytory)
    println("Фильтрация по стажу выполнена")
}

//8. Отфильтровать по должности
fun filterPosition() {
    val classFilterPosition = ClassFilterPosition()
    classFilterPosition.getFilterPosition(employeeReposytory)
    println("Фильтрация по должности выполнена")
}

//0. Вы выполнили выход из приложения
fun exit() {
    println("Вы выполнили выход из приложения")
    Thread.sleep(1000)
}