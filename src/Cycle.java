/*
 * @class Cycle
 * @author: Sonal Sekhda
 * @course: ITEC 2140 - 04, spring 2023
 * @date: January 27, 2023
 */
public class Cycle {
    public static void main(String[] args){
        int bicycles = 10;
        int tricycles;
        int eachBicycleWheel = 2;
        int noOfBicycleWheels;
        noOfBicycleWheels = bicycles * eachBicycleWheel;
        System.out.println("No of bicycles Wheels  = " + noOfBicycleWheels);
        int totalNoOfWheels = 47;
        tricycles = totalNoOfWheels - noOfBicycleWheels;
        System.out.println("Total number of tricycles in the store = " + tricycles);


    }
}
