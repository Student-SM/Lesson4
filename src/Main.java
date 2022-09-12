public class Main {

    public static void main(String[] args) {
        CalcService service = new CalcService();
        int myMax = service.max(3,5);
//        System.out.println("Максимальное число") ;
//        System.out.println (myMax);

        System.out.println("3 / 5");
        System.out.println(service.max(3,5));
        System.out.println();

        System.out.println("0 / 0");
        System.out.println(service.max(0,0));
        System.out.println();

        System.out.println("-3 / -13");
        System.out.println(service.max(-3,-13));
        System.out.println();





    }
}
