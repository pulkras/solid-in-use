public class HP extends Computer {
    HP(String name, int memorySize) {
        super(name, memorySize);
    }

    // violation of liskov substitution principle
    public void setData(String name) {
        this.name = name;
        this.memorySize = 3000;
    }
}
