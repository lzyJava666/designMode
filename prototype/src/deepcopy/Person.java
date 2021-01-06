package deepcopy;

import java.io.*;

/**
 * 深拷贝实例类---人
 */
public class Person implements Cloneable, Serializable {
    private String name;
    private int age;
    private Face face;

    //深拷贝方式一（不推荐使用）
    @Override
    protected Object clone()  {
        Person person=null;
        try {
            person= (Person) super.clone();
            person.setFace((Face) face.clone());
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }

    //深拷贝方式二（推荐使用）
    protected Object clone2(){
        Person person=null;
        ByteArrayInputStream byteArrayInputStream=null;
        ByteArrayOutputStream byteArrayOutputStream=null;
        ObjectInputStream objectInputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            //序列号当前对象
            byteArrayOutputStream=new ByteArrayOutputStream();
            objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化实现深拷贝
            byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream=new ObjectInputStream(byteArrayInputStream);
            person = (Person) objectInputStream.readObject();
            return person;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                objectInputStream.close();
                objectOutputStream.close();
            }catch (Exception e1){
                System.out.println(e1.getMessage());
            }

        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", face=" + face +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }
}
