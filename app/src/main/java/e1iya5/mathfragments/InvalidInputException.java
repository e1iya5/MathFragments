package e1iya5.mathfragments;

/**
 * Created by elias on 12.03.17.
 */
public class InvalidInputException extends Exception {
    private String input;

    public InvalidInputException(String s) {
        this.input = s;
    }

    public String getInvalidInput() {
        return input;
    }
}
