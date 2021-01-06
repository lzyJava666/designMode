package deepcopy;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------深拷贝原型模式实例--------");
        Person person=new Person("tom",5);
        person.setFace(new Face("小白"));
        Person clone = (Person) person.clone();
        System.out.println("方式一：person"+person+" person的hashcode" +person.hashCode()+" clone:"+clone+" hashcode:"+clone.hashCode());
        System.out.println("persom face:"+person.getFace().hashCode());
        System.out.println("clone face:"+clone.getFace().hashCode());
        Person clone2 = (Person) person.clone2();
        System.out.println("方式二：person"+clone2+" person的hashcode" +person.hashCode()+" clone2:"+clone2+" hashcode:"+clone2.hashCode());
        System.out.println("persom face:"+person.getFace().hashCode());
        System.out.println("clone2 face:"+clone2.getFace().hashCode());
        person.setAge(999);
        System.out.println(person);
        System.out.println(clone);
    }
}
