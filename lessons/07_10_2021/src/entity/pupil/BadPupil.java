package entity.pupil;

/*
 * @created 07.10.2021 - 11:46
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class BadPupil extends Pupil{
    public BadPupil(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " ужасно учится");
    }

    public void read() {
        System.out.println(name + " не читает");
    }

    public void write() {
        System.out.println(name + " в принципе не пишет");
    }

    public void relax() {
        System.out.println(name + " играет в доту 24/7 (не умеет отдыхать)");
    }
}
