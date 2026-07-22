package AbstractFactoryDesign;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
