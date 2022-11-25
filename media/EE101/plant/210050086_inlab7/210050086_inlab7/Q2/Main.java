package Q2;
import java.util.Scanner;
public class Main {
    static int cases = 0;
    static int square(int cow[],int endindex){
        int size = cow.length;
        if(endindex == 0){
            return cow[0]*cow[0];
        }
        else{
            return cow[endindex]*cow[endindex]+square(cow,endindex-1);
        }
    }
    static void printer(int print[],int startindex){
        if(startindex == print.length){
            return;
        }
        System.out.println(print[startindex]);
        printer(print,startindex+1);
    }
    static void inp(int no_of_the_line,int num_of_lines,int num_values,int grass[],int count,int print[]){
        if(no_of_the_line%2==0){
            Scanner input = new Scanner(System.in);
            num_values = input.nextInt();
            inp(no_of_the_line+1,num_of_lines,num_values,grass,count,print);
        }
        else if(no_of_the_line%2==1){
            if(count==0){
                grass = new int[num_values];
                Scanner input = new Scanner(System.in);
                grass[count] = input.nextInt();
                inp(no_of_the_line,num_of_lines,num_values,grass,count+1,print);

            }
            else if(count == num_values){
                print[cases] = square(grass,num_values-1); 
                cases++;
                count = 0;
                if(no_of_the_line==num_of_lines*2+1){
                    printer(print,0);
                    return;
                }
                else{
                    inp(no_of_the_line+1,num_of_lines,num_values,grass,count,print);
                }
            }
            else{
                Scanner input = new Scanner(System.in);
                grass[count] = input.nextInt(); 
                inp(no_of_the_line,num_of_lines,num_values,grass,count+1,print);  
            }

        }
    }

    /*
     * NOTE: Create helper functions here if required
     */
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num_of_lines = input.nextInt();
        int grass[] = new int[1];
        int print[] = new int[num_of_lines];
        inp(2,num_of_lines,0,grass,0,print);
        /*
         * TODO: Complete this method
         * NOTE: Take input from STDIN and print the output to STDOUT
         */
        
    }
}
