package schoolrecords;

public class Mark {

    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public Mark(MarkType markType, Subject subject, Tutor tutor){
        this.markType = markType;
        if (isEmpty(subject.getSubjectName())){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        if (isEmpty(tutor.getName())){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.tutor = tutor;
    }

    public Mark(String markType, Subject subject, Tutor tutor){
        this.markType = MarkType.valueOf(markType);
        if (subject == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        if (tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.tutor = tutor;
    }

    public boolean isEmpty(String empty){
        return empty == null || "".equals(empty);
    }

    @Override
    public String toString(){
        return this.markType.getDescription() + "(" + this.markType.getValue() + ")";
    }

}
