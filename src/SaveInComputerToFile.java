// solving a problem with single responsibility principle
public class SaveInComputerToFile implements SaveTo {

    // violation of open-closed principle
//    public void saveToFile(String path, Computer computer) {
//        System.out.println("save to file " + path + ", " + computer);
//    }
//
//    public void saveToDatabase(String path, Computer computer) {
//        System.out.println("save to database " + path + ", " + computer);
//    }

    // solving open-closed principle
    public void save(String path, Computer computer) {
        System.out.println("save to file " + path + ", " + computer);
    }
}
