/*
 * @class MaleStudent
 * @author: Sonal Sekhda
 * @course: ITEC 2140 - 04, spring 2023
 * @date: January 27, 2023
 */
public class MaleStudent {
    public static void main(String[] args){
        int noOfStudents = 389;
        int femaleStudents = 175;
        int maleStudents;
        maleStudents = noOfStudents - femaleStudents;
        System.out.println("How many Male students are in the middle school? " + maleStudents + " Male students");

    }
}
