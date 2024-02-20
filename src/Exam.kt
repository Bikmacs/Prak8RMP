import kotlin.random.Random

class Exam {
    var Names = ""
    var item = ""
    var datax = 0.0
    var ocen = 0.0

    fun input1(Exam1:Exam){
        try {
            println("Введите свое имя")
            Exam1.Names = readLine()!!.toString()

            println("Введите навание предмета")
            Exam1.item = readLine()!!.toString()

            println("Введите дату экзамена")
            Exam1.datax = readLine()!!.toDouble()

            println("Введите оценку")
            Exam1.ocen = readLine()!!.toDouble()

        }catch (e:Exception){
            println("Не верно")
        }
    }

    fun output(Exam1:Exam){
            println("Имя:${Exam1.Names} \n Предмет:${Exam1.item} \n Дата экзамена:${Exam1.datax} \n Оценка:${Exam1.ocen}")
    }

    fun average(Exam1: Exam){
        try {

            println("Введите последние 10 оценок ученика за этом месяц")
            var sum = 0.0
            for(i in 1..10)
            {
                println("Значения $i:")
                var a = readln()!!.toDouble()
                sum += a.toDouble()
            }
            var aver = sum/10
            println("Среднее:$aver")
        }catch (e:Exception){}
        println("Ошибка")
    }

    fun output1(Exam1: Exam) {
        try {
            println("Введите название предметов")

            val subjects = Array<String>(8) { "" }

            for (i in 0 until 8) {
                println("Предмет ${i + 1}:")
                subjects[i] = readLine() ?: ""
            }

            println("Предметы в учреждении: ${subjects.joinToString(", ")}")

            println("Недельное расписание:")

            var random = Random
            var rnd = random.nextDouble(1.0, 7.0)
            for (i in 1..rnd.toInt()) {
                if (i <= subjects.size) {
                    println("Пара $i: ${subjects[i - 1]}")
                } else {
                    println("Недостаточно предметов для отображения расписания")
                    break
                }
            }
        } catch (e: Exception) {
            println("ошибка: ${e.message}")
        }
    }

}