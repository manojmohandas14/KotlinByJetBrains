package tip.string

data class Cat(val name:String, val sound:String, val photo:String)

val cats = listOf<Cat>(
    Cat("Momo","meow","momo_dancing.jpg"),
    Cat("", "purr","cat_sleeping.jpg"),
    Cat("Bella","MEOW","bella_hunting.jpg"),
)

fun main(){
    tip1()
    tip2()
    tip3()
}

fun tip1(){
    cats.map { it.photo.removeSuffix(".jpg") }.forEach { println(it) }
    println("__MEOW__".removeSurrounding("__"))
}

fun tip2(){
    cats.map{ it.name.ifBlank { "the Cat" } }.forEach { println(it) } // Replaced cats.map{if (it.name.isBlank()) "the Cat" else it.name}
}

fun tip3(){
    println(cats.first().sound.lowercase() == cats.last().sound.lowercase())
    //instead of creating new strings like above, use below
    println(cats.first().sound.equals(cats.last().sound,ignoreCase = true))
}