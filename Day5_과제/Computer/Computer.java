package Day5_과제.Computer;

public class Computer {
    public String CPU;
    public int RAM;
    public int SSD;
    public String GPU;
    
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public int getRAM() {
        return RAM;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public int getSSD() {
        return SSD;
    }
    public void setSSD(int SSD) {
        this.SSD = SSD;
    }
    public String getGPU() {
        return GPU;
    }
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void print() {
        System.out.println("Computer [CPU = " + CPU + ", GPU = " + GPU + ", RAM = " + RAM + "GB, SSD = " + SSD + "GB]");
    }

}
