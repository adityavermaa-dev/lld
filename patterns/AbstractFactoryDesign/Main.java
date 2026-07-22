package AbstractFactoryDesign;

public class Main {

    public static void main(String[] args) {

        GuiFactory factory = new WindowFactory();
        Application app = new Application(factory);

        app.renderUI();
    }
}
