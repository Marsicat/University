import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    public Student( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  HashMap<Subject, ArrayList<Integer>> studentMarks = new HashMap<>();
    public static HashMap<Subject, ArrayList<Integer>> subjectMarksAllUniversity = new HashMap<>();

    public void addMark(Subject subject, int mark) {
        try {
            if (mark < 0 || mark > 10) throw new IllegalArgumentException("Оценка должна быть от 0 до 10");

            if (studentMarks.containsKey(subject)) {
                studentMarks.get(subject).add(mark);
            } else studentMarks.put(subject, new ArrayList<>() {{
                add(mark);
            }});


            if (subjectMarksAllUniversity.containsKey(subject)) {
                subjectMarksAllUniversity.get(subject).add(mark);
           } else subjectMarksAllUniversity.put(subject, new ArrayList<>() {{
               add(mark);
            }});

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public double averageSubjectMark() throws NullPointerException {

        ArrayList<Integer> marks = new ArrayList<>();
        int marksSum = 0;
        double averageMark;

            if (studentMarks.isEmpty()) {
                throw new NullPointerException("У студента нет предметов");
            }

            for (Subject key : studentMarks.keySet()) {
                for (int i = 0; i < studentMarks.get(key).size(); i++) {
                    marks.add(studentMarks.get(key).get(i));
                }
            }

            for (int i = 0; i < marks.size(); i++) {
                marksSum += marks.get(i).intValue();

            }

        averageMark = (double) marksSum / marks.size();
        return averageMark;
    }


        @Override
        public String toString () {
            return "Student3{" +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


