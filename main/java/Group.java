import java.util.List;

public class Group {
    public List<Student> students ;
    private String groupName;

    public Group(String groupName,List<Student> students) {
        this.students = students;
        this.groupName = groupName;
    }
    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + students +
                ", groupName='" + groupName + '\'' +
                '}';
    }

    public double averageGroupMark(Subject subject)throws NullPointerException {
        double averageGroupMark =0 ;
        int sumMark = 0;
        int counter =0;

        if (students.isEmpty()) throw new NullPointerException("В группе нет студентов.");

            for(int i=0;i < students.size();i++){
                if (  students.get(i).studentMarks.containsKey(subject)) {
                    for (int j = 0; j < students.get(i).studentMarks.get(subject).size(); j++) {
                        sumMark += students.get(i).studentMarks.get(subject).get(j);
                        counter++;
                    }
                    averageGroupMark = (double)sumMark/counter;
                }
            }
            return  averageGroupMark;
    }

}
