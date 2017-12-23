public class MyClass {
    private String o_name;
    public void set_name(String o_name)
    {
        this.o_name=o_name;
    }
    public String print_name(){
        return o_name;
    }
    public static void main(String [] args)
    {
        MyClass o1 = new MyClass();
        o1.set_name("my_name_obj1");
        MyClass o2 = new MyClass();
        o2.set_name("my_name_obj2");
        System.out.println("имя объекта = "+o1.print_name());
        System.out.println("имя объекта = "+o2.print_name());
    }
}
