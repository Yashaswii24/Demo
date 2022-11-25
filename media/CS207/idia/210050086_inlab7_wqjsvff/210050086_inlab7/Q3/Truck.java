package Q3 ;

public class Truck extends Vehicle{
    Truck(String regNo,String manufacturer,String owner,String pollutionStatus){
        this.regNo = regNo;
        this.manufacturer=manufacturer;
        this.owner=owner;
        this.pollutionStatus=pollutionStatus;
    }
    public static void checkPollutionStatus(){
        if(CO2>25 || CO>0.8 || HC>1000){
            pollutionStatus = "FAIL";
        }
        else{
            pollutionStatus = "PASS";
        }
    }

}
/*
 * TODO: Create class Truck along with proper methods and inheritance as required
 */