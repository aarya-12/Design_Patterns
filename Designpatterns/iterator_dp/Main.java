public class Main {
	
   public static void main(String[] args) {
      NameRepository nr = new NameRepository();
      Iterator i = nr.getIterator();
      while(i.hasNext()){
         String name = (String)i.next();
         System.out.println("Name : " + name);
      } 	
   }
}