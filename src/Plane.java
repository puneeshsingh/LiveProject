public class Plane {
    private String type;
    private String engineType;

    public Plane(String type, String engineType){
        this.type=type;
        this.engineType=engineType;
    }

    public String getType(){
        return this.type;
    }
}
