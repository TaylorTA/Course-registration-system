public class test {
    public static void main(String[] args){
        Person p1 = new Person("River");
        Person p2 = new Person("River");
        System.out.println(p2.toString());
        System.out.println(p1.toString());

        System.out.println(p1 == p2);
        p1 = new Person("Kaylee");
        p2 = new Person("Inara");
        p2 = p1;
        System.out.println(p1 == p2);
    }
}
