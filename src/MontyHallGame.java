public class MontyHallGame {
    // instance variables
    private int playerChoice;
    private String doorOne;
    private String doorTwo;
    private String doorThree;

    // regular variables
    int revealedDoor;

    // constructor
    public MontyHallGame(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    // methods
    public void Game() {
        setValues();
        if (playerChoice == 1) {
            if (doorTwo.equals("bomb")) {
                System.out.println("One of the bombs is behind door 2.");
                revealedDoor = 2;
            } else if (doorThree.equals("bomb")) {
                System.out.println("One of the bombs is behind door 3.");
                revealedDoor = 3;
            }
        } else if (playerChoice == 2) {
            if (doorOne.equals("bomb")) {
                System.out.println("One of the bombs is behind door 1.");
                revealedDoor = 1;
            } else if (doorThree.equals("bomb")) {
                System.out.println("One of the bombs is behind door 3.");
                revealedDoor = 3;
            }
        } else {
            if (doorOne.equals("bomb")) {
                System.out.println("One of the bombs is behind door 1.");
                revealedDoor = 1;
            } else if (doorTwo.equals("bomb")) {
                System.out.println("One of the bombs is behind door 2.");
                revealedDoor = 2;
            }
        }
    }

            public void swap(String swap) {
                if (swap.equals("Yes")) {

                }
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

        if ((!(doorOne.equals("lamborghini") || doorTwo.equals("lamborghini")))) {
            doorThree = "lamborghini";
        } else {
            doorThree = "bomb";
        }
    }
}
