public final class singleton{
    int age;
    String name;
    private static final singleton s1= new singleton();
    private singleton() {
    }
    private singleton(int age,String name)
    {
        System.out.println("Singleton object created");
    }

    
    
    public static singleton getInstance()
    {
     
        System.out.println("s1 Singleton object returned");
      return s1;
    }
    public static void setInstance(int age,String name)
    {
        s1.age=age;
        s1.name=name;
    }
    public String toString()
    {
        return this.age+this.name;

    }
}