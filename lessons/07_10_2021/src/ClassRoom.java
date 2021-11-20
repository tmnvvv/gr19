import entity.pupil.Pupil;

/*
 * @created 07.10.2021 - 11:45
 * @project 07_10_2021
 * @author Polyakov Anton
 */
public class ClassRoom {
    private Pupil[] students;
    public ClassRoom(Pupil student1, Pupil student2, Pupil[] students) {
        this.students = new Pupil[]{student1, student2};
    }

    public ClassRoom(Pupil student1, Pupil student2, Pupil student3) {
        this.students = new Pupil[]{student1, student2, student3};
    }

    public ClassRoom(Pupil student1, Pupil student2, Pupil student3, Pupil student4) {
        this.students = new Pupil[]{student1, student2, student3, student4};
    }

    public void getStudents() {
        for (Pupil pupil: students) {
            System.out.println("\n");
            pupil.read();
            pupil.study();
            pupil.relax();
            pupil.write();
        }
    }
}