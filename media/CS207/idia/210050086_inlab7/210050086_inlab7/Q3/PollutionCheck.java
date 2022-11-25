package Q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class PollutionCheck {
    public static void main(String [] args) throws Exception {
        int num_lines=0;
        File file1=new File("Q3/vehicles.txt");    
        FileReader fr1=new FileReader(file1);    
        BufferedReader br1=new BufferedReader(fr1); 

        File file2=new File("Q3/pollution.txt");    
        FileReader fr2=new FileReader(file2);    
        BufferedReader br2=new BufferedReader(fr2); 

        File file3=new File("Q3/queries.txt");    
        FileReader fr3=new FileReader(file3);    
        BufferedReader br3=new BufferedReader(fr3);  

        while(br1.readLine()!=null){
            num_lines++;
        }

        File file4=new File("Q3/vehicles.txt");    
        FileReader fr4=new FileReader(file4);    
        BufferedReader br4=new BufferedReader(fr4); 
        String x = br4.readLine();
        HashMap<String, String> veh = new HashMap<>();
        HashMap<String, String> manu = new HashMap<>();
        HashMap<String, String> own = new HashMap<>();
        HashMap<String, String> stat = new HashMap<>();
        while(x!=null){
            String[] words;
            words = x.split(", ");
            veh.put(words[0],words[3]);
            manu.put(words[0],words[1]);
            own.put(words[0],words[2]);
            stat.put(words[0],"PENDING");
            x = br4.readLine();
        }
        String y = br2.readLine();
        while(y!=null){
            String words[];
            words = y.split(", ");
            if(veh.containsKey(words[0])){
                if(veh.get(words[0]).equals("Car")){
                    if(Double.parseDouble(words[1])>15 || Double.parseDouble(words[2])>0.5 || Double.parseDouble(words[3])>750){
                        stat.put(words[0],"FAIL");
                    }
                    else{
                        stat.put(words[0],"PASS");
                    }
                }
                if(veh.get(words[0]).equals("Truck")){
                    if(Double.parseDouble(words[1])>25 || Double.parseDouble(words[2])>0.8 || Double.parseDouble(words[3])>1000){
                        stat.put(words[0],"FAIL");
                    }
                    else{
                        stat.put(words[0],"PASS");
                    }
                }
                    
            }
            
            y = br2.readLine();
        }
        String z = br3.readLine();
        while(z!=null){
            String words[];
            words = z.split(", ");
            if(veh.containsKey(words[0])){
                System.out.println(stat.get(words[0]));
            }
            else{
                System.out.println("NOT REGISTERED");
            }
            z = br3.readLine();
        }

        /*
         * Implement this function to produce the desired outputs
         */
    }
}