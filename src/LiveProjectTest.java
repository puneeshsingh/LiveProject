public class LiveProjectTest {
    public static void main(String [] args){
        System.out.println("Live project");

        Plane plane = new Jet("Fighter");
        Jet jet = (Jet)plane;
        System.out.println(jet.getType());
    }
}