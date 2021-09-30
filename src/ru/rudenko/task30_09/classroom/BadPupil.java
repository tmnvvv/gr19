package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project BadPupil
 */
public class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.print("Bad ");
        super.study();
    }

    @Override
    public void read() {
        System.out.print("Bad ");
        super.read();
    }

    @Override
    public void write() {
        System.out.print("Bad ");
        super.write();
    }

    @Override
    public void relax() {
        System.out.print("Bad ");
        super.relax();
    }
}
