import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static int GenerateNumber(int n) { return (int) (Math.random()*n)+1; }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество остановок в городе: ");
        int N = in.nextInt();


        int[][] vertecies = new int[N][N];

        System.out.print("Введите количество маршрутов: ");
        int routes_capacity = in.nextInt();


        for(int i = 0; i < routes_capacity ; i++){

            System.out.print("Введите длину "+ (i+1) +" маршрута: ");
            int len = in.nextInt();


            int[] route = new int[len];

            System.out.println("Введите остановки в " + (i+1) + " маршруте:");

            for(int k = 0; k < len; k++){

                route[k] = in.nextInt() - 1;

            }

            for(int k = 0; k < len-1; k++){

                if(vertecies[route[k]][route[k+1]] == 0 && vertecies[route[k+1]][route[k]] == 0){

                    vertecies[route[k]][route[k+1]] = 1;
                    vertecies[route[k+1]][route[k]] = 1;

                }

            }

        }
        for (int i = 0; i< N; i++){

            for (int k = 0; k < N; k++){

                System.out.print(vertecies[i][k] + " ");

            }
            System.out.println();
        }
    }
}
