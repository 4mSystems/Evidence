package te.app.evidence.base;

public class ApplicationComponent implements androidx.databinding.DataBindingComponent {

    private ApplicationBinding applicationBinding = new ApplicationBinding();

    public ApplicationBinding getApplicationBinding() {
        return applicationBinding;
    }

}