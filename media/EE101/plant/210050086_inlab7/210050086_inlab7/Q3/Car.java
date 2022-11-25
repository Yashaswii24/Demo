package Q3 ;

public class Car extends Vehicle{
    Car(String regNo,String manufacturer,String owner,String pollutionStatus){
        this.regNo = regNo;
        this.manufacturer=manufacturer;
        this.owner=owner;
        this.pollutionStatus=pollutionStatus;
    }
    public static void checkPollutionStatus(){
        if(CO2>15 || CO>0.5 || HC>750){
            pollutionStatus = "FAIL";
        }
        else{
            pollutionStatus = "PASS";
        }
    }

}

/*
 * TODO: Create class Car along with proper methods and inheritance as required
 */