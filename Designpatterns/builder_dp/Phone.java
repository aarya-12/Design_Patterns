public class Phone{
    String ram, ss, os;
       public Phone(String os, String ram, String ss){
              this.ram=ram;
              this.os=os;
              this.ss=ss;
       }
       public String getOS() {
		return os;
	}

	public String getRAM() {
		return ram;
	}
       public String getScreenSize() {
		return ss;
	}
 public String toString(){
    return " RAM "+ram+" OS "+os+" Screen size "+ss;
 }
}