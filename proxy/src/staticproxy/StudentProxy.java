package staticproxy;

public class StudentProxy implements IStudent {

    private IStudent student;

    public StudentProxy(IStudent student) {
        this.student = student;
    }

    @Override
    public String getName() {
        return student.getName();
    }
}
