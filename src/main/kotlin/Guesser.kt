class Guesser : Prisoner() {
    override fun visit(warden: Warden) {
        warden.pullLeftLever()
    }
}