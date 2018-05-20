public class hw1 {
    public static void main(String[] args){
        float a = 5.0f, b = 10.0f, c = 15.0f, d = 20.0f;
        int e = 10 , g = 2018;
        String f = "Kirill";

        System.out.println(operation(a,b,c,d));
        System.out.println(comparison(a,b));
        posneg(a);
        System.out.println(ifnegative(e));
        cheers(f);
        leapyear(g);
    }


    public static double operation(float a, float b, float c, float d){
        double result = 0;
        result = a * (b + c/d);
        return result;
    }

    public static boolean comparison(double a, double b){
        if (a+b >= 10 && a+b <= 20)
            return true;
        else return false;
    }

    public static void posneg(double a){
        if (a>=0)
            System.out.println("Positive");
        else System.out.println("negative");
    }

    public static boolean ifnegative(int e){
        if (e>=0)
            return false;
        else return true;
    }

    public static void cheers(String f){
        System.out.println("Hello, " + f + "!");
    }

    public static void leapyear(int g){
        if ((g % 4 == 0 && g % 100 != 0) || g % 400 == 0)
            System.out.println("Leap");
        else System.out.println("Not leap");
    }
}
