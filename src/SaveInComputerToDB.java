public class SaveInComputerToDB implements SaveTo {
    // solving open-closed principle
    public void save(String path, Computer computer) {
        System.out.println("save to database " + path + ", " + computer);
    }
}
