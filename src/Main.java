import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Havlayan Köpeğimiz*****");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("*****Yaş Tespiti*****");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("*****Dikdörtgen Alan Hesaplama*****");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println("*****Daire Alan Hesaplama*****");
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println("*****Oyuncu Kedi*****");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));


    }
    //Havlayan Köpeğimiz
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 20)) {
            return true;
        }

        return false;
    }

    //Yaş Tespiti
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        }

        return false;
    }

    //Oyuncu Kedi
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        }

        return false;
    }

    //Dikdörtgen Alan Hesaplama
    public static double area(double kenar1, double kenar2){
        if(kenar1 < 0 || kenar2 < 0){
            return -1.0;
        }
        return kenar1 * kenar2;
    }

    //Daire Alan Hesaplama
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return  roundToNDecimals(Math.PI * radius * radius, 5);
    }

        public static double roundToNDecimals(double value, int decimals) {
        double scale = Math.pow(10, decimals);
        return Math.round(value * scale) / scale;
    }



}