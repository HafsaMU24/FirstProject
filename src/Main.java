public class Main {

    public static void main(String[] args) {

     int x = 10;
     int y = 10;

        int diffrence = subtractNumbers(x,y);
        int summa = addNumbers(x,y);

        System.out.println("x = " + x );
        System.out.println("summa = " + summa );
        System.out.println("diffrence -" + diffrence);

    }

   public static int addNumbers (int x, int y){
      x = x + 10;
      return x + y;
   }

   public static int subtractNumbers (int hund, int kanin){

        return hund - kanin;

   }
}

