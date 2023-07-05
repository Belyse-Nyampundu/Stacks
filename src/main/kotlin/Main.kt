import com.sun.jdi.Bootstrap

fun main(){
     var myStack = Stack()
    myStack.push(5)
    myStack.push(24)
    myStack.push(62)
    println(myStack.peek())
    println(myStack.pop())
    println(myStack.peek())
    myStack.push(12)
    myStack.push(51)
    myStack.push(88)
    var x = myStack.pop()
    var y = myStack.pop()
    var z = x!! + y!!
    println(z)
    println(myStack.peek())
}
class Stack{
    var data = mutableListOf<Int>()

    fun push(value: Int){
        data.add(value)
    }

    fun pop():Int?{
        if(data.isEmpty()){
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if(data.isEmpty()){
            return null
        }
        return  data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return  data.isEmpty()
    }
}