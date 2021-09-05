
public enum Subject {
    MATHS ("Математика"),
    ART ("Арт"),
    PHYSICS ("Физика"),
    MUSIC ("Музыка");

    private String nameSubject;
    private int mark;

     Subject(String nameSubject){
         this.nameSubject=nameSubject;
     }

    public String getNameSubject() {
        return nameSubject;
    }
}
