package entity.pupil;

/*
 * @created 07.10.2021 - 11:46
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class ExcellentPupil extends Pupil{
    public ExcellentPupil(String name) {
        super(name);
    }

    public void study() {
        System.out.println(name + " учится на отлично");
    }

    public void read() {
        System.out.println(name + " отлично читает");
    }

    public void write() {
        System.out.println(name + " красиво пишет");
    }

    public void relax() {
        System.out.println(name + " умеет отдыхать");
    }
}
