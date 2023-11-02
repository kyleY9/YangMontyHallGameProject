public class MontyHallGame {
    // instance variables
    private int playerChoice;
    private String doorOne;
    private String doorTwo;
    private String doorThree;

    // constructor
    public MontyHallGame(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    // methods
    public void Game() {

    }
    public void setValues() {
        int rand = (int) (Math.random()*3) + 1;
        if (rand == 1) {
            doorOne = "lamborghini";
        } else {
            doorOne = "bomb";
        }

        if (doorOne.equals("lamborghini")) {
            doorTwo = "bomb";
        } else if (rand == 2) {
            doorTwo = "lamborghini";
        } else {
            doorTwo = "bomb";
        }

        if ((!(doorOne.equals("lamborghini") && doorTwo.equals("lamborghini")))) {
            doorThree = "lamborghini";
        } else {
            doorThree = "bomb";
        }
    }
}
