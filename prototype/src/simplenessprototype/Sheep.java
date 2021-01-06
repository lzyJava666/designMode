package simplenessprototype;

/**
 * 羊类
 * 实现 原型接口 Cloneable
 */
public class Sheep implements Cloneable{
    //姓名
    private String name;
    //年龄
    private Integer age;
    //颜色
    private String color;

    @Override
    protected Object clone()  {
        Sheep sheep=null;
        try {
            sheep= (Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
