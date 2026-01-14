import kotlin.math.max

class OutpostWorker(val name: String) {
    var maxEnergy: Int = 100
        private set
    var energy: Int = maxEnergy
        set(value){
            field = value.coerceIn(0,maxEnergy)
        }
    var mood: Int = 50
        get() = field + (energy / 10)
    var level: Int = 1
        private set


    fun levelUp(){
        level++
        maxEnergy += 20
        energy = maxEnergy
        println("$name повысил уровень до $level!")
    }
    fun work(){
        println("$name выполняет работу...")
        energy -= 15
        if (energy < 20) println("$name устал!")
    }
    fun rest(){
        println("$name отдыхает...")
        energy += 20
    }

}

fun main() {
    val worker = OutpostWorker("Рэй")
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.work()
    worker.work()
    worker.work()
    println("Энергия: ${worker.energy}")
    println("Настроение: ${worker.mood}")
    worker.rest()
    worker.energy = 150
    //worker.level = 5
    worker.levelUp()
}