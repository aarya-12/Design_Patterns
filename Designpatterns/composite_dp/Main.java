public class Main {
        public static void main(String[] args) {
	// write your code here
        //Assembly motherboard  = new Leaf("Motherboard",1000);
        Assembly ram = new  Leaf("RAM",200);
        Assembly cpu = new Leaf("CPU",300);
        Assembly motherboard = new Composite();
        //motherAssembly.addAssembly(motherboard);
        motherboard.addAssembly(ram);
        motherboard.addAssembly(cpu);
        Assembly mouse  = new Leaf("mouse",50);
        Assembly computer = new Composite();
        computer.addAssembly(motherboard);
        computer.addAssembly(mouse);
        computer.showAssemblyDetails();
        double d = computer.addPrice();
        System.out.println(d);
    }
}
