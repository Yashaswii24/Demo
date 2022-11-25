package Q3;

public class Vehicle{
    public static String regNo,manufacturer,owner,pollutionStatus;
    public static double CO2,CO,HC;
    public static void checkPollutionStatus(){}
    public String toString(){
        String info = "Reg No: "+ regNo + "\n" + "Manufacturer: " +manufacturer+ "\n" +"Owner: " +owner+ "\n" + "Pollution Status: " +pollutionStatus+"\n";
        return info;
    }
}
/*
 * TODO: Create class Vehicle along with given attributes and methods 
 */