class Classfile {
    var system : Int = 0
    var stringfile : String = ""
    var filecode = ""
}
fun main()
{
    val code = Classfile()
    code.filecode = "Hello World"
    code.stringfile = "This is class file"
    code.system = 10000

    println()
}