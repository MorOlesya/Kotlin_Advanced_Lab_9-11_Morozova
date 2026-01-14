package example

interface  Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("останавливаемся...")
    }
}
class Car (
    override val model: String,
    override val number: String
) : Movable {
    override var speed: Int = 60
    override fun move() {
        println("Едем на машине со скоростью $speed км/ч")
    }
}
class Aircraft (
    override val model: String,
    override val number: String
) : Movable {
    override var speed: Int = 600
    override fun move() {
        println("Летим на самолёте со скоростью $speed км/ч")
    }

    override fun stop() = println("Приземляемся...")
}

fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}

interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun study() = println("$name учится")
    override fun work() = println("$name работает")
}

interface VideoPlayable {
    fun play() = println("Play video")
}

interface AudioPlayable {
    fun play() = println("Play audio")
}

class MediaPlayer : VideoPlayable, AudioPlayable {
    //override fun play() = println("Play audio and video")
    override fun play() {
        println("Start playing")
        super<AudioPlayable>.play()
        super<VideoPlayable>.play()
    }
}

fun main() {
//    var car = example.Car()
//    var aircraft = example.Aircraft()
////    car.move()
////    aircraft.move()
//    example.travel(car)
//    example.travel(aircraft)
//
//    val pavel = example.WorkingStudent("Pavel")
//    pavel.work()
//    pavel.study()
//
//    car.move()
//    car.stop()
//    aircraft.move()
//    aircraft.stop()

//    val car = example.Car("LADA", "134LAD")
//    val aircraft = example.Aircraft("Boeing","737")

    val player = MediaPlayer()
    player.play()
}