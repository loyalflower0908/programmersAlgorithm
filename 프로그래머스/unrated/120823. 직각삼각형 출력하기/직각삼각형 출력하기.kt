fun main(args: Array<String>) {
    val (n) = readLine()!!.split(' ').map(String::toInt)
    repeat(n){println("*".repeat(it+1))}
}