package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        this.marks.add(mark);
    }

    public double calculateAverage(){
        if(marks.size() == 0){
            throw new IllegalCallerException("Cannot calculate average");
        }
        double result = 0;
        for (Mark mark : this.marks){
            result += mark.getMarkType().getValue();
        }
        return result/marks.size();
    }

    public double calculateSubjectAverage(Subject subject){
        double result = 0;
        int i = 0;
        for (Mark mark : this.marks){
            if(mark.getSubject().equals(subject)) {
                result += mark.getMarkType().getValue();
                i++;
            }
        }
        if(i == 0){
            throw new IllegalCallerException("Cannot calculate average!");
        }
        return result/i;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder().append(this.name + " marks: ");
        for(Mark mark : this.marks){
            stringBuilder.append(mark.getSubject().getSubjectName());
            stringBuilder.append(": ");
            stringBuilder.append(mark.getMarkType().getDescription());
            stringBuilder.append("(" + mark.getMarkType().getValue() + ")");
        }
        return stringBuilder.toString();
    }

}
