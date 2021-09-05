import java.util.List;

public class Faculty {
    private List<Group> groups;
    private String facultyName;

    public Faculty(String facultyName,List<Group> groups) {
        this.groups = groups;
        this.facultyName =facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public double averageMarkFaculty(Subject subject)throws NullPointerException {
        double averageMarkFaculty;
        double sumMark = 0;
        int counter = 0;
         if (groups.isEmpty()) throw new NullPointerException("На факультете нет групп");
            for (int i = 0; i < groups.size(); i++) {
                sumMark += groups.get(i).averageGroupMark(subject);
                counter++;
            }
            averageMarkFaculty = sumMark/counter;
        return averageMarkFaculty;
    }
}
