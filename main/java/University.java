import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties;
    public University(List<Faculty>faculties){
        this.faculties = faculties;
    }

    public double averageMarkUniversity(Subject subject)throws NullPointerException{
        double averageMarkUniversity;
        int counter =0;
        double sumMark = 0;
        ArrayList<Integer> marks = new ArrayList<>();

        if (faculties.isEmpty()) throw new NullPointerException ("В Университете нет факультетов");

            for (Subject key : Student.subjectMarksAllUniversity.keySet()) {
                if (Student.subjectMarksAllUniversity.containsKey(subject)) {
                    for (int i = 0; i < Student.subjectMarksAllUniversity.get(subject).size(); i++) {
                        marks.add(Student.subjectMarksAllUniversity.get(subject).get(i));
                    }
                }
            }
            for (int i = 0;i< marks.size();i++){
                sumMark+= marks.get(i);
                counter++;
            }
            averageMarkUniversity =sumMark/counter;
       return averageMarkUniversity;
    }

}
