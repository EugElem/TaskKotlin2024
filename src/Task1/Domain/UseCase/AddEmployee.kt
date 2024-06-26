package Task1.Domain.UseCase

import Task1.Data.EmployeeReposytory
import Task1.Domain.Models.Employee

class AddEmployee(
    lastName:String? =null,
    firstName: String? =null,
    patronymic:String? =null,
    position: String? =null,
    department: String? =null,
    urlPhoto: String? =null,
    birthDate: String? =null,
    startDate: String? =null,
    )
    : Employee(
    lastName,
    firstName,
    patronymic,
    birthDate,
    position,
    department,
    urlPhoto,
    startDate,) {


    // Сохранение (добавление в Лист)
    fun addNewEmployee(listEmployee: EmployeeReposytory) {
        var employee = Employee(
            lastName,
            firstName,
            patronymic,
            birthDate,
            position,
            department,
            urlPhoto,
            startDate,
            )

        listEmployee.listEmployee.add(employee)
        listEmployee.printList()
    }

    // вызов фушкций получения от пользователя параметров гового сотрудника
    fun getParametresNewEmployee(){
        getLastName()
        getFirstName()
        getРatronymic()
        getBirthDate()
        getPosition()
        getDepartment()
        getUrlPhoto()
        getStartDate()
    }


    fun getLastName(){
        print("Введите фамилию: ")
        lastName = readln()
    }

    fun getFirstName(){
        print("Введите имя: ")
        firstName = readln()
    }

    fun getРatronymic(){
        print("Введите отчество, при наличии: ")
        patronymic = readln()
    }

    fun getBirthDate(){
        print("Введите дату рождения: ")
        birthDate = readln()
    }

    fun getPosition(){
        print("Введите должность: ")
        position = readln()
    }

    fun getDepartment(){
        print("Введите отдел: ")
        department = readln()
    }

    fun getUrlPhoto(){
        print("Введите ссылку на фото, при наличии: ")
        urlPhoto = readln()
    }

    fun getStartDate(){
        print("Введите дату принятия на работу: ")
        startDate = readln()
    }
}