public class proxy_internet implements internet{
    internet n = new internetImpl();
    String arr[] = {"abc.com","pqr.com","xyz.com"};
    public void displayWebpage(String st){
        for (int i =0;i<arr.length;i++){        
            if(st.equalsIgnoreCase(arr[i])){
          System.out.println("Banned webpage.");
        }
        else{
            n.displayWebpage(st);
        }
        }
        
    }

}