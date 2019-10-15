public class Radio extends Component {


    public Radio(){
        super("Sony");
    }

    public String control(){
        return "Select Station";
    }

    public String instructions(){
        return "Wire together radio and amplifier";
    }

    public String tune(String name){
        return "tuned to " + name;
    }
}
