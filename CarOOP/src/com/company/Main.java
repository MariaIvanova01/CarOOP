package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countLines = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < countLines; i++) {
            String[] carInfoInput = scan.nextLine().split(" ");
            String brand = carInfoInput[0];

            Car car;
            if (carInfoInput.length == 1){
                car = new Car(brand);
            }else{
                String model = carInfoInput[1];
                int horsePower = Integer.parseInt(carInfoInput[2]);
                car = new Car(brand, model, horsePower);
            }
            System.out.println(car.carInfo());

        }
    }
}
