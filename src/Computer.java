

public class Computer {
    String name;

    int memorySize;

    Computer(String name, int memorySize) {
        this.name = name;
        this.memorySize = memorySize;
    }

    public void setData(String name) {
        this.name = name;
    }
    // violation of single responsibility principle
//    public void saveToFile() {
//        System.out.println("Save class to file");
//    }
//
//    public void load() {
//        System.out.println("Load class from file");
//    }
}
