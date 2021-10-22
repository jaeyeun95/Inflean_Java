package chapter11.classex;

public class ClassTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person person = new Person();
        // getClass 는 object의 메소드이고 모든 클래스는 object를 상속받기 때문에 class에서도 사용가능
        Class pClass1 = person.getClass();

        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;

        System.out.println(pClass2.getName());

        // Class pClass3 = Class.forName("chapter11.classex.Person");
        Class pClass3 = Class.forName("java.lang.String");
        // forName("") 뒤에는 실제 존재하는 클래스가 들어와야 error가 발생하지 않음
        System.out.println(pClass3.getName());

        Person p = new Person();
        Class pClass = Class.forName("chapter11.classex.Person");

        Person p2 = (Person) pClass.newInstance();
        System.out.println("p " + p);
        System.out.println("p2 " + p2);

    }

}
