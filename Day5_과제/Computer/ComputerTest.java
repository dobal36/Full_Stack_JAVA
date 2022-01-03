package Day5_과제.Computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c = new Computer();

        c.CPU = "Intel(R) Core(TM) i5-8265U";
        c.GPU = "NVDIA GeForce MX150";
        c.RAM = 8;
        c.SSD = 477;
        c.print();
        
    }
}
