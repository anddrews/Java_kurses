import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner strm=new Scanner(System.in);
        String str;
        int num=0;
        final int i=3;
        do
        {
            System.out.println("Введите число, если 0, то выход:");
            str=strm.nextLine();
            try
            {
                num=Integer.parseInt(str);
                if (num%i==0 && num!=0)
                {
                    System.out.println("Введенное число "+ num + " делится на " + i +" без остатка");


                }
                else if (num!=0)
                {
                    System.out.println("Введенное число не делится на " + i + " без остатка.");
                }
                else
                {
                    System.out.println("Введен 0, программа заканчивает свою работу.");
                }
            }
            catch (NumberFormatException e)
            {
                System.err.println("Введенную строку невозможно привести  к типу int, программа завершает работу.");
            }


        } while (num!=0);

    }
}
