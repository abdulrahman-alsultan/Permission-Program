import java.lang.Exception

fun main(){
    println("Enter your age: ")
    try{
        var age = readLine()!!.toInt()
        if(age > 18){
            print("Welcome!")
        }else{
            print("You are not old enough.. ")
        }
    }catch (e: Exception){
        print("Please enter numbers only")
    }
}