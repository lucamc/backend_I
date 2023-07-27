package exception;

public class LiquidadorException extends Exception{

    // Constructor
    public LiquidadorException(String message) {
        super(message);
    }

    // Method

    @Override
    public String toString() {
        return "Error LiquidadorException -> " + this.getMessage();
    }
}
