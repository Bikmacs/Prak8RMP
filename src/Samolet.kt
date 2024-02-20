import java.io.File
import java.io.FileWriter
class Samolet {
    var Marka = ""
    var punkt = ""
    var punktn = ""
    var data =       0.0
    var time = 0.0
    var oborti = 0.0

    fun input(Samolet1:Samolet){
        try {

            println("Введите марку самолета")
            Samolet1.Marka = readLine()!!.toString()
            println("Введите пункт оправления")
            Samolet1.punkt = readLine()!!.toString()
            println("Введите дату отправления")
            Samolet1.data = readLine()!!.toDouble()
            println("Введите Пункт назначения")
            Samolet1.punktn = readLine()!!.toString()
            println("Введите время в пути")
            Samolet1.time = readLine()!!.toDouble()

        }catch (e:Exception){
            println("оШИБКА")
        }
        println()

    }

    fun output(Samolet1: Samolet){

        println("Марка самолета ${Samolet1.Marka} \n Пункт отправления ${Samolet1.punkt} \n Дата отправления ${Samolet1.data} \n Пункт назначения ${Samolet1.punktn} \n Время в пути ${Samolet1.time}")

    }

    fun shetObor(){
        println("Введите температуру масла")
        var temp = readLine()!!.toDouble()

        println("Введите колличество оборотов двигателя самолета")
        var dvig = readLine()!!.toDouble()

        if (temp < 50 || temp > 90) {
           println("Мы взорвемся")
        }else {

            if (dvig <= 2500 && dvig >= 4000) {
                println("Мы НЕ взлетаем!!!!")
            } else {
                println("Мы взлетим ")
            }
        }
    }
    fun vivod(Samolet1: Samolet){

        println("Хотите сохранить файл нажмите 1")
        var a = readln()!!.toInt()
        println("Введите имя файла")
        var b = readln()!!.toString()
        when(a == 1){
            true -> {
                val writer = File("${b}.txt").bufferedWriter()
                writer.write("Марка самолета: ${Samolet1.Marka}")
                writer.newLine()
                writer.write("пункт оправления: ${Samolet1.punkt}")
                writer.newLine()
                writer.write("дата отправления: ${Samolet1.data}")
                writer.newLine()
                writer.write("Пункт назначения: ${Samolet1.punktn}")
                writer.newLine()
                writer.write("время в пути: ${Samolet1.time}")
                writer.close()
            }
            false ->{
                println("Ладно не будем")
            }
        }

    }
    fun readFile(fileName: String) {
        val file = File(fileName)

        if (file.exists()) {
            val content = file.readText()
            println(content)
        } else {
            println("Файл не найден")
        }
    }





}