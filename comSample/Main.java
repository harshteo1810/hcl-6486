package comSample;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello and continue");
        SingleEmployee obj1= SingleEmployee.makeInstance();
        SingleEmployee obj2 = SingleEmployee.makeInstance();
        String msg =obj1.getMsg();
        System.out.println(msg);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.hashCode());
    }
}
