public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("IBM", 800);
        SaveInComputerToFile saverToFile = new SaveInComputerToFile();
//        saver.saveToFile("/home/pulkras", computer);
        saverToFile.save("/home/pulkras", computer);
        SaveInComputerToDB saverToDB = new SaveInComputerToDB();
        saverToDB.save("database", computer);

        test();

        ModelForm form = new ModelForm(1, 30, "Mikhail");
        WebFramework webFramework = new WebFramework();
        webFramework.save(form);
    }

    public static void test() {
        Computer computer = new Computer("IBM", 800);
        Computer computer2 = new HP("Omen HP", 800);

        computer2.setData("IBM");
        if(computer.name.compareTo(computer2.name) == 0 && computer.memorySize == computer2.memorySize) {
            System.out.println("test is successful");
        } else {
            System.out.println("test is failed");
        }
    }

}