import java.util.*;

public class Runner {

    public static void main (String []args){

    Student ann = new Student("Анна");
    Student alan = new Student("Алан");
    Student jim = new Student("Джеймс");
    Student dick = new Student("Ричард");
    Student alice = new Student("Элис");
    Student jane = new Student("Джейн");
    Student extra = new Student("Extra");

    ann.addMark(Subject.ART,9);
    ann.addMark(Subject.ART,9);
    ann.addMark(Subject.MUSIC,9);
    ann.addMark(Subject.MUSIC,9);

    alan.addMark(Subject.MATHS,8);
    alan.addMark(Subject.MATHS,8);
    alan.addMark( Subject.PHYSICS,8);
    alan.addMark(Subject.PHYSICS,8);

    jim.addMark(Subject.PHYSICS,7);
    jim.addMark(Subject.ART,7);

    dick.addMark(Subject.PHYSICS,6);
    dick.addMark(Subject.PHYSICS,6);
    dick.addMark(Subject.MATHS,6);

    alice.addMark(Subject.MUSIC,5);
    alice.addMark(Subject.MUSIC,5);
    alice.addMark(Subject.ART,5);

    jane.addMark(Subject.PHYSICS,10);
    jane.addMark(Subject.MUSIC,10);
    jane.addMark(Subject.MUSIC,15);

    try {
        System.out.printf("Средний балл по всем предметам студента %s - %.2f%n", ann.getName(), ann.averageSubjectMark());
        System.out.printf("Средний балл по всем предметам студента %s - %.2f%n", extra.getName(), extra.averageSubjectMark());
    }catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }

    Group group1 = new Group("Group1", new ArrayList<>(Arrays.asList(ann, alice)));
    Group group2 = new Group("Group2", new ArrayList<>(Arrays.asList(alan, dick)));
    Group group3 = new Group("Group3", new ArrayList<>(Arrays.asList(jane, jim, extra)));
    Group group4 = new Group("Group4", new ArrayList<>());

    Faculty creation = new Faculty("Creation", new ArrayList<>(Arrays.asList(group1, group3)));
    Faculty appl = new Faculty("Applied", new ArrayList<>(Arrays.asList(group2)));
    Faculty spare = new Faculty("spare", new ArrayList<>());

    try {
        System.out.printf("Средний балл по предмету %s в группе %s - %.2f%n ", Subject.MUSIC.getNameSubject(), group1.getGroupName(), group1.averageGroupMark(Subject.MUSIC));
        System.out.printf("Средний балл по предмету %s в группе %s - %.2f%n ", Subject.ART.getNameSubject(), group4.getGroupName(), group4.averageGroupMark(Subject.ART));
    }catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }

    try {
        System.out.printf("Средний балл по предмету %s на факультете %s - %.2f%n ",Subject.MATHS.getNameSubject(),appl.getFacultyName(),appl.averageMarkFaculty(Subject.MATHS));
        System.out.printf("Средний балл по предмету %s на факультете %s - %.2f%n ",Subject.ART.getNameSubject(),spare.getFacultyName(),spare.averageMarkFaculty(Subject.ART));
    }catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }

    University university = new University(new ArrayList<>(Arrays.asList(creation)));
    University newUniversity = new University(new ArrayList<>(Arrays.asList()));

    try{
        System.out.printf("Средний балл по предмету %s в университете - %.2f%n ", Subject.PHYSICS.getNameSubject(), university.averageMarkUniversity(Subject.PHYSICS));
        System.out.printf("Средний балл по предмету %s в университете - %.2f%n ", Subject.PHYSICS.getNameSubject(), newUniversity.averageMarkUniversity(Subject.PHYSICS));
    }catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }
    }

}
