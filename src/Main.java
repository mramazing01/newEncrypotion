class Main {

    public static void main(String[] args){
        test.h();
    }
}

/*Vernam Vigere
public class Main {

    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Would like to use a (c)aesar, v(e)rnam,");
            System.out.println("v(i)gnere or (p)icture cypher?");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            Scanner a = new Scanner(System.in);
            String b = a.nextLine();
            if (b.equals("c")) {
                encryption enc = new encryption();
                enc.GetPlainText();
                enc.getKey();
                enc.encrypt();
            } else if (b.equals("e")) {
                vernam ver = new vernam();
                ver.GetPlainText();
                ver.getKey();
                ver.encrypt();
            } else if (b.equals("i")) {
                vignere vig = new vignere();
                vig.GetPlainText();
                vig.getKey();
                vig.encrypt();
            }else if(b.equals("p")){
                pic pi=new pic();
                pi.encrypt();
            } else System.out.println("That is an incorrect input. Please try again");
        }
    }
}
*/