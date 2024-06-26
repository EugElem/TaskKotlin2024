package Task1.Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class EditEmployee(
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


    fun chooseEmployeeToEdit(employeeReposytory: EmployeeReposytory) {
        println("Сотрудников: ${employeeReposytory.listEmployee.size}")

        for (onceEmployee in employeeReposytory.listEmployee) {
            println("${onceEmployee.lastName}")
        }
        print("Введите фамилию ")
        var cooseOfUser = readln()

        // поиск записи с введенной пользователем фамилией
        val lastNameEmlpoyeeToEdit = cooseOfUser
        j = 0
        var boolLastNameEmlpoyeeToEdit = false
        while (boolLastNameEmlpoyeeToEdit != true) {
            boolLastNameEmlpoyeeToEdit =
                employeeReposytory.listEmployee.elementAt(j).lastName == lastNameEmlpoyeeToEdit
            println(
                "${employeeReposytory.listEmployee.elementAt(j).firstName}| " +
                        "${employeeReposytory.listEmployee.elementAt(j).lastName} | $j | $boolLastNameEmlpoyeeToEdit"
            )
            if (boolLastNameEmlpoyeeToEdit == true) break
            else j++
        }

        //  присваивание переменным конструктора значений параметров выбранногого сотрудника
        lastName = employeeReposytory.listEmployee.elementAt(j).lastName
        firstName = employeeReposytory.listEmployee.elementAt(j).firstName
        patronymic = employeeReposytory.listEmployee.elementAt(j).patronymic
        position = employeeReposytory.listEmployee.elementAt(j).position
        department = employeeReposytory.listEmployee.elementAt(j).department
        urlPhoto = employeeReposytory.listEmployee.elementAt(j).urlPhoto
        birthDate = employeeReposytory.listEmployee.elementAt(j).birthDate
        startDate = employeeReposytory.listEmployee.elementAt(j).startDate
    }

    var i: Int = 100

    // выбор параметра для редактирования
    fun chooseParаmetrToEdit(employeeReposytory: EmployeeReposytory) {
        while (i != 0) {
            println(
                """
    ---------------------------------------------
    |   Выберите, что бы вы хотели изменить:    |
    |    1. Фамилия:        ${lastName + (" ".repeat(20 - lastName!!.length))}|
    |    2. Имя:            ${firstName + (" ".repeat(20 - firstName!!.length))}|
    |    3. Отчество:       ${patronymic + (" ".repeat(20 - patronymic!!.length))}|
    |    4. Должность:      ${position + (" ".repeat(20 - position!!.length))}|
    |    5. Отдел:          ${department + (" ".repeat(20 - department!!.length))}|
    |    6. Ссылка на фото: ${urlPhoto + (" ".repeat(20 - urlPhoto!!.length))}|
    |    7. Дата рождения:  ${birthDate + (" ".repeat(20 - birthDate!!.length))}|
    |    8. Работает с:     ${startDate + (" ".repeat(20 - startDate!!.length))}|
    |    0. Отмена                              |
    ---------------------------------------------           
    """.trimIndent()
            )
            print("Введите номер пункта меню: ")
            i = readln().toInt()

            Thread.sleep(400)
            print("Ответ системы: ")
            when (i) {
                1 -> updateLastName()
                2 -> updateFirstName()
                3 -> updateРatronymic()
                4 -> updatePosition()
                5 -> updateDepartment()
                6 -> updateUrlPhoto()
                7 -> updateBirthDate()
                8 -> updateStartDate()
                0 -> {
                    exit()
                }
            }
            setEmployee(employeeReposytory)

            Thread.sleep(1000)
            println("Нажмите любую кнопку, чтобы подолжить")
            readln()
        }
    }

    // Сохранение (добавление в Лист)
    fun setEmployee(employeeReposytory: EmployeeReposytory) {
        var employee = Employee(
            lastName,
            firstName,
            patronymic,
            position,
            department,
            urlPhoto,
            birthDate,
            startDate,
        )
        employeeReposytory.listEmployee.set(j, employee)
    }

    fun updateLastName() {
        print("Введите фамилию: ")
        lastName = readln()
    }

    fun updateFirstName() {
        print("Введите имя: ")
        firstName = readln()
    }

    fun updateРatronymic() {
        print("Введите отчество, при наличии: ")
        patronymic = readln()
    }

    fun updateBirthDate() {
        print("Введите дату рождения: ")
        birthDate = readln()
    }

    fun updatePosition() {
        print("Введите должность: ")
        position = readln()
    }

    fun updateDepartment() {
        print("Введите отдел: ")
        department = readln()
    }

    fun updateUrlPhoto() {
        print("Введите ссылку на фото, при наличии: ")
        urlPhoto = readln()
    }

    fun updateStartDate() {
        print("Введите дату принятия на работу: ")
        startDate = readln()
    }

    fun exit() {
        println("Вы вышли из редактирования данных пользователя по фамилии $lastName ")
    }
}
