import kotlin.math.sqrt
fun main(){
    var Samolet1:Samolet = Samolet()
    Samolet1.input(Samolet1)
    Samolet1.output(Samolet1)
    Samolet1.vivod(Samolet1)
    var c = Samolet()
    c.shetObor()
}
fun readFile(fileName: String) {
    println("Введите имя файла для чтения")
    var example = readln()!!.toString()
    val fileName = example
    readFile(fileName)
}


