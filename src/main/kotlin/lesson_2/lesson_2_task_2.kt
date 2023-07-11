package lesson_2

fun main() {

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