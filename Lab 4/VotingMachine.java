class MinorAgeException extends Exception {
    public MinorAgeException(String message) {
        super(message);
    }
}

public class VotingMachine {

    public void castVote(int age) throws MinorAgeException {
        if (age < 18) {
            throw new MinorAgeException("Voter is not eligible to vote.");
        } else {
            System.out.println("Vote cast successfully.");
        }
    }
    public static void main(String[] args) {
        VotingMachine machine = new VotingMachine();

        try {
            machine.castVote(16); 
        } catch (MinorAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

