public class MySQL implements ISQL {

    // realisation of dependency inversion principle
    @Override
    public void save(IForm form) {
        System.out.println("save form to db");
    }
}
