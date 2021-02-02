package dynamicproxt;

public class Student implements IStudent {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
