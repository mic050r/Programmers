fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)
    //println(a + b)

    var star : String = ""
    for(i in 1..a){
        star += "*"
    }

    for(i in 1..b){
        println(star)
    }

}