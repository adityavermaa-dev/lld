package AbstractFactoryDesign;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory = new MacFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.render();
        checkbox.render();
    }
}
