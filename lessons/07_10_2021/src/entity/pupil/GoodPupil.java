package entity.pupil;

/*
 * @created 07.10.2021 - 11:46
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class GoodPupil extends Pupil{
    public GoodPupil(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " учится на четвёрки");
    }

    public void read() {
        System.out.println(name +  " нормально читаю");
    }

    public void write() {
        System.out.println(name + " умеренно красиво пишет");
    }

    public void relax() {
        System.out.println(name + " умеет отдыхать");
    }
}
