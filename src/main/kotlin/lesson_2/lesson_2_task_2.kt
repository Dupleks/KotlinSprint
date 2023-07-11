package lesson_2

fun main() {
    //В компании работало 50 человек с зарплатой по 30000 рублей.
// Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
// Пишем часть гипотетического софта для бухгалтерии, который будет считать:
    //
    //– Расходы на выплату зарплаты постоянных сотрудников;
    //– Общие расходы по ЗП после прихода стажеров;
    //– Среднюю ЗП одного сотрудника после устройства стажеров.
    //
    //Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
// Все значения необходимо вывести в виде целых чисел.
    val employees = 50
    val employeeSalary = 30000
    val trainees = 30
    val traineeSalary = 20000

    val paymentsForEmployeesOnly = employees * employeeSalary
    val paymentsForTraineesOnly = trainees * traineeSalary
    val paymentsTotal = paymentsForEmployeesOnly + paymentsForTraineesOnly
    val averageSalary = paymentsTotal / (employees + trainees)

    println(
        """
        Расходы на выплату зарплаты постоянных сотрудников - $paymentsForEmployeesOnly
        Расходы на выплату зарплаты стажеров - $paymentsForTraineesOnly
        Общие расходы по ЗП после прихода стажеров - $paymentsTotal
        Средняя ЗП одного сотрудника после устройства стажеров - $averageSalary
    """.trimIndent()
    )
}