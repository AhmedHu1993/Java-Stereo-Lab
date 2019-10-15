import java.util.ArrayList;

public class StereoSystem {

    private ArrayList<Component> components;

    public StereoSystem(){
        this.components = new ArrayList<Component>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public ArrayList getComponents() {
        return this.components;
    }
}
