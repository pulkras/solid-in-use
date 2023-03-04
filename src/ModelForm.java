public class ModelForm implements IForm {
    int id;
    int old;
    String fio;

    ModelForm(int id, int old, String fio) {
        this.id = id;
        this.old = old;
        this.fio = fio;
    }
}
