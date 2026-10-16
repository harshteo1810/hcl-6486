package comSample;

public class SingleEmployee {

    static final SingleEmployee obj = new SingleEmployee();
    //rule1 : make constructor private
    private SingleEmployee(){}
    public static SingleEmployee makeInstance(){
        return obj;
    }
    public String getMsg(){
        return "Heyy..... I m using java";
    }
}
