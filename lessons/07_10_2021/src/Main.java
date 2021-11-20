import entity.printer.BluePrinter;
import entity.printer.GreenPrinter;
import entity.printer.YellowPrinter;
import entity.pupil.BadPupil;
import entity.pupil.ExcellentPupil;
import entity.pupil.GoodPupil;
import entity.vehicle.Plane;

/*
 * @created 07.10.2021 - 11:45
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class Main {
    public static void main(String[] args) {
        YellowPrinter yellowPrinter = new YellowPrinter();
        BluePrinter bluePrinter = new BluePrinter();
        GreenPrinter greenPrinter = new GreenPrinter();
        yellowPrinter.print("This is Yellow Printer!");
        bluePrinter.print("This is Blue Printer!");
        greenPrinter.print("This is Green Printer!");

        ExcellentPupil mark = new ExcellentPupil("Марк");
        GoodPupil den = new GoodPupil("Дэн");
        BadPupil diana = new BadPupil("Диана");
        ClassRoom classRoom = new ClassRoom(mark, den, diana);
        classRoom.getStudents();

        Plane plane = new Plane(3012.1, 3414.1, 1000000, 300, 2019, 15000, 120);
        plane.print();
    }
}