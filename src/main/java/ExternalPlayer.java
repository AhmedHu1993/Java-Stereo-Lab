public class ExternalPlayer extends Component implements IConnect {

    private ExternalPlayerTypes type;

    public ExternalPlayer(String manufacturer, ExternalPlayerTypes type){
        super(manufacturer);
        this.type = type;
    }

    public String control(){
        return "Input Source";
    }

    public String instructions(){
        return "Adjust the output volume";
    }

    public ExternalPlayerTypes getType() {
        return this.type;
    }

    public String connect(){
        return "connect via 3.5mm jack";
    }
}
