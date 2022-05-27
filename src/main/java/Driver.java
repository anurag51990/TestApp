
public class Driver {
    public static void main(String args[]){
        System.out.println("this is the app started");
        Security sec = new SecurityImpl();
        System.out.println(sec.getSecurityName());
        sec.setSecurityName("Options");
        System.out.println(sec.getSecurityName());


    }
}
