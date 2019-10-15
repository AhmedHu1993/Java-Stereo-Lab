public abstract class Component {

    private String manufacturer;

    public Component(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public abstract String control();

    public abstract String instructions();
}
