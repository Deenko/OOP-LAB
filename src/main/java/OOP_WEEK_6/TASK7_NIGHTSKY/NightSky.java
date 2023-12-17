package OOP_WEEK_6.TASK7_NIGHTSKY;

import java.util.Random;

public class NightSky {
    private double density;

    private int width;

    private int height;

    private int starsInLastPrint;

    public NightSky(double density){
        this.density = density;
        this.height = 10;
        this.width = 20;
    }

    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height){
        this.density=density;
        this.height=height;
        this.width=width;
    }

    public void printLine(){
        Random random = new Random();
        for (int i = 0; i <= this.width; i++){
            if (this.density >= random.nextDouble()){
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print(){
        for (int i = 0; i < this.height; i++){
            printLine();
            System.out.println();
        }
        System.out.println("Number of stars printed: " + starsInLastPrint);
    }
}
