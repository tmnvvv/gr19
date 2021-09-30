package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project GoodPupil
 */
public class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.print("Good ");
        super.study();
    }

    @Override
    public void read() {
        System.out.print("Good ");
        super.read();
    }

    @Override
    public void write() {
        System.out.print("Good ");
        super.write();
    }

    @Override
    public void relax() {
        System.out.print("Good ");
        super.relax();
    }
}
