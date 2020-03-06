import java.util.*

fun main(args: Array<String>) {
    val prisonerCount = args.firstOrNull()?.toInt() ?: 10
    val jail = Jail(prisonerCount)
    var wardenVisits = 0
    val rand = Random()
    while (!jail.warden.hasBeenGivenCorrectGuess && wardenVisits < 100000000) {
        val prisoner = jail.prisoners[rand.nextInt(jail.prisoners.size)]
        jail.warden.summon(prisoner)
        wardenVisits++
    }
    if (jail.warden.hasBeenGivenCorrectGuess) {
        println("Guessed correctly after $wardenVisits visits to the warden.")
    } else {
        println("Never guessed correctly!")
    }
}
