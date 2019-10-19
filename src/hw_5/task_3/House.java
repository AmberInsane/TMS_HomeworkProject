package hw_5.task_3;
/*
Есть два типа домов - городская многоэтажка и загородный дом.
У каждого типа дома есть методы "получить кол-во этажей", "включить отопление", "получить кол-во жильцов".
Есть каталог домов (например класс, внутри которого какой-то массив).
Создайте каталог и поместите туда несколько домов.
 */
public abstract class House {
    private int numberOfLevels;
    private int numberOfTenants;

    protected int getNumberOfLevels(){
        return numberOfLevels;
    }
    protected void turnOnHeating(){
        System.out.println("Heating turned on");
    }
    protected int getNumberOfTenants(){
        return numberOfTenants;
    }
}
