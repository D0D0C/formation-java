package org.example.Static;

public class ApplicationWaterTank {
    public static void main(String[] args) {

        WaterTank watertank1 = new WaterTank(100,10,5 );
        WaterTank watertank2 = new WaterTank(70,25,15);

        System.out.println(WaterTank.volumeTotal);
        System.out.println(watertank1.getVolume());
        System.out.println(watertank2.getVolume());
        watertank1.remplir(35);
        watertank2.vider(20);
        System.out.println(watertank1.getVolume());
        System.out.println(watertank2.getVolume());


     }
}
