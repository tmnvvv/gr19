package entity.printer;

/*
 * @created 07.10.2021 - 13:02
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class GreenPrinter extends Printer{
    public void print(String value) {
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}
