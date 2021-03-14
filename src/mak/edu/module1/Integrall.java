package mak.edu.module1;
/**
  @author   Yelyzaveta Makarenko
  @project   vsem_module_1
  @class  Integrall
  @version  1.0.0
  @since 14.03.2021 - 12.28
*/

public class Integrall {

    public static double getIntegrall(int secant){
        // My ticket's number 3
        double start = 0.3;
        double finish = Math.PI;
        int steps = 10;
        double step = (finish - start) / steps;
        double area = 0;


        double height = 0;
        for (int i = 0; i < steps; i++) {
            if (Math.sin(i * step) < 0.1 * secant) {
                height = Math.sin(i * step);
            }else{
                height = 0.1 * secant;
            }
            double currentArea = height * step;
            area = area + currentArea;


        }
        return area;
    }


    public static void main(String[] args) {
        System.out.println(getIntegrall(13));


    }
}
