class Jail(prisonerCount: Int) {
    val prisoners = (0 until prisonerCount).map { Prisoner() }
}