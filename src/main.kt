fun main(){
    greet()
    call()
    me()
    var name="akirachix"
     var x = name[1].toString()+name[3]+name[4]
    println(x)
}
fun greet(){
    var name = "hi my name is Oure"
    var age = " and i am 21 years old"
    var statement= name +" " +age
    println(statement)
}
fun call(){
    var x = "ilove my life"
    println(x.length)
}
fun me(){
    var name = "Oure"
    var m = name
    if(m==name){
        println("That's me!")
        }
        else{ println("I don't know who that is")
        }
    }
