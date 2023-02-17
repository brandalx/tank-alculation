public class Main {
    public static void main(String[] args) {
    Tank t1 = new Tank( 1500, 800 );
    Tank t2 = new Tank(1500, 700);
    Tank t = new Tank();
    //This will handle isOk function in tank class
   System.out.println( t.isOk(t1,t2,true));
        //This will handle handleCount function in tank class
        t.handleCount(t1, '+', 500);
        t.handleCount(t1, '-', 500);
        t.handleCount(t1, 'd', 500);
        t1.handleDistance(t1, 900);
    }
}