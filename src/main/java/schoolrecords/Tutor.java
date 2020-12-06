package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        for (Subject subject1 : this.subjects){
            if(subject1.getSubjectName().equals(subject.getSubjectName())){
                return true;
            }
        }
        return false;
    }

    public void addSubject(Subject subject){
        this.subjects.add(subject);
    }

}
