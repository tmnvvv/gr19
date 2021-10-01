package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project ClassRoom
 */

/**
 * ref: https://docs.google.com/document/d/1X8c_KuZ8hvAo1krStu9UOi05icX950ZF1ETNYVOUojM/edit
 */
public class ClassRoom {
    private Pupil pupil;
    private Pupil excellentPupil;
    private Pupil goodPupil;
    private Pupil badPupil;

    public ClassRoom() {
        this.pupil = new Pupil();
        this.excellentPupil = new ExcellentPupil();
        this.goodPupil = new GoodPupil();
        this.badPupil = new BadPupil();
    }

    /**
     * Выводит информацию о действиях учеников
     */
    public void show() {
        pupil.study();
        pupil.read();
        pupil.write();
        pupil.relax();

        excellentPupil.study();
        excellentPupil.read();
        excellentPupil.write();
        excellentPupil.relax();

        goodPupil.study();
        goodPupil.read();
        goodPupil.write();
        goodPupil.relax();

        badPupil.study();
        badPupil.read();
        badPupil.write();
        badPupil.relax();
    }
}