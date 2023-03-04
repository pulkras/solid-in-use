public class WebFramework {

    // realisation of dependency inversion principle
    public void save(IForm form) {
        ISQL db = new MySQL();
        db.save(form);
    }
}
