package cglib;

public class Student {
    private String name;

    //必须要有空构造，不然会报错
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
