package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project ExcellentPupil
 */
public class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.print("Excellent ");
        super.study();
    }

    @Override
    public void read() {
        System.out.print("Excellent ");
        super.read();    }

    @Override
    public void write() {
        System.out.print("Excellent ");
        super.write();
    }

    @Override
    public void relax() {
        System.out.print("Excellent ");
        super.relax();
    }
}
