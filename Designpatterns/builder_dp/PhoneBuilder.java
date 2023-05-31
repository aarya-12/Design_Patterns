public class PhoneBuilder{
    String ram, ss, os;
    PhoneBuilder(){
           
    }
    PhoneBuilder setOS(String os){
        this.os=os;
        return this;
        
    }
    PhoneBuilder setRAM(String ram){
        this.ram=ram;
        return this;
    }
    PhoneBuilder setScreenSize(String ss){
        this.ss=ss;
        return this;
    }
    public Phone build(){
			return new Phone(this.os,this.ram,this.ss);
		}

}

