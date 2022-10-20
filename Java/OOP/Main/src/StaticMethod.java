public class StaticMethod {
    private int rollon=0;
    private String name;
    private static String college = "DBRR";
    public static int count =0;


    public int getRollon() {
        return rollon;
    }

    public static String getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public static void setCollege(String college) {
        StaticMethod.college = college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollon(int rollon) {
        this.rollon = rollon;
    }
    public StaticMethod(){}
    public StaticMethod(String name){
        this.rollon = ++count;
        this.name = name;
    }
    static void change(){
        college = "CLGT";
    }
    void display(){
        System.out.println(rollon + " " + name + " " + college);
    }

    public static void main(String[] args) {

    }
}
