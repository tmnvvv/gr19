package entity.printer;

/*
 * @created 07.10.2021 - 13:00
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class YellowPrinter extends Printer{
    public void print(String value) {
        System.out.println(ANSI_YELLOW + value + ANSI_RESET);
    }
}
