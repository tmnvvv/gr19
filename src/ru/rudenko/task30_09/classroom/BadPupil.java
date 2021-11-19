package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project BadPupil
 */

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
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
