package schoolrecords;

public class Subject {

    private String subjectName;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public boolean equals(Subject subject){
        return subject.getSubjectName().equals(this.getSubjectName());
    }


}
