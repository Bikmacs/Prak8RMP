import kotlin.math.sqrt

fun main(){

    var Samolet1:Samolet = Samolet()
    Samolet1.input(Samolet1)
    Samolet1.output(Samolet1)
    Samolet1.vivod(Samolet1)

    var c = Samolet()
    c.shetObor()

    println("Введите имя файла для чтения")
    val fileName = readLine()!!.toString()
    readFile(fileName)


}