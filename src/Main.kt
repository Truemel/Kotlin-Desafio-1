fun main(){
    println("Mi nombre es: José Gómez Quinteros")
    var n1 = 10
    var n2 = 20
    var n3 = 30
    println(n1+n2+n3)
    var st:String
    var ch:Char
    st = "Arataka Reigen"
    ch = 'A'
    println(st.count())
    ch = 'B'
    var f1:Float
    f1 = 2.5f
    println("${Byte.MAX_VALUE} ${Short.MAX_VALUE}")
    println("${Int.MIN_VALUE} ${Long.MIN_VALUE}")
    var b1 = true
    println(b1)
    imprimiendoParametros("palabra", "word")
    println(obtieneIVA())
}

fun imprimiendoParametros(st1:String, st2:String){
    println(st1.count()+st2.count())
}

fun obtieneIVA():String{
    return "19%"
}