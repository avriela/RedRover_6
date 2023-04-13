public class Hw03 {
    public static void main(String[] args) {

    // задача 1
        int a = 10;
        int b = 7;

        if (a==b){
            System.out.println("Переменные равны\n");
        } else if (a<b){
            System.out.println("Переменная a менбше b\n");
        } else if (a>b){
            System.out.println("переменная b меньше a\n");
        }

    // задача 2
        if ((a+b)%2==0){
            System.out.println("maybe a and b are even\n");
        } else {
            System.out.println("some variable is odd\n");
        }

    // задача 3
        int i = 125;

        if (i>10){
            System.out.println("i больше 10");
            }
        if (i<100){
            System.out.println("i меньше 100");
        }
        if (i/2>20){
            System.out.println("результат деления i на 2 больше 20");
        }
        if (i>=5&&i<=40){
            System.out.println("значение i между 5 и 40 включительно");
        } else {
            System.out.println("значение i меньше 5 или больше 40");
        }


        }




    }

