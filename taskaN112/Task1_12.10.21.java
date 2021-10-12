import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
            list.add("A");
            list.add("B");
            list.add("R");
            list.add("I");
            list.add("K");
            list.add("O");
            list.add("S");
            list.add("L");
            list.add("I");
            list.add("K");
            list.add("E");

    Iterator iterator = list.iterator();

    System.out.println("Элементы:");

    while (iterator.hasNext())
     System.out.print(iterator.next() + " ");
    System.out.println();
	}
}
