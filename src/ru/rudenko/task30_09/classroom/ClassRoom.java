package ru.rudenko.task30_09.classroom;

/**
 * @author Rudenko
 * @created 30/09/2021
 * @project ClassRoom
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