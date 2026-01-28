package example
import kotlin.properties.Delegates

interface Base {
    fun SomeFun()
}

class BaseImpl() : Base {
    override fun SomeFun() { }
}

class Derived(someBase: Base) : Base by someBase


interface Messenger{
    fun SendTextMessage()
    fun SendVideoMessage()
}

class InstantMessenger(val programName: String) : Messenger{
    override fun SendTextMessage() = println("Send text message")
    override fun SendVideoMessage() = println("Send video message")
}

class SmartPhone(name: String, m: Messenger) : Messenger by m {
    override fun SendTextMessage() = println("Send sms")
}

interface PhotoDevice{
    fun TakePhoto()
}

class PhotoCamera : PhotoDevice{
    override fun TakePhoto() = println("Take a photo")
}

var counter: Int by Delegates.observable(0) {_, old, new ->
    println("Счётчик изменений: $old -> $new")
}

class User {
    var name: String by Delegates.observable("<no name>") { _, old, new -> println("Имя изменено: `$old` -> `$new`")}
}