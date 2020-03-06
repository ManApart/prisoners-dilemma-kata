class Jail(prisonerCount: Int) {
    val guesser = Guesser()
    val prisoners = listOf(guesser) + (0 until prisonerCount -1).map { Prisoner() }
}