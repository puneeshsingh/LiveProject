public class Jet extends Plane{
    private String name;
    public Jet(){
        super("Jet","Super Sonic");
    }

    public Jet(String name){
        this();
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}
