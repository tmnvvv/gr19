package entity.printer;

/*
 * @created 07.10.2021 - 11:45
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class Printer {
    protected static final String ANSI_YELLOW = "\u001B[33m";
    protected static final String ANSI_GREEN = "\u001b[32m";
    protected static final String ANSI_BLUE = "\u001b[34m";
    protected static final String ANSI_RESET = "\u001B[0m";
    public void print(String value) {
        System.out.println(value);
    }
}
