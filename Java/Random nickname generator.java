
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Random num=new Random();
       int numAssigned=1+num.nextInt(10);
       String name="";
       if (numAssigned==1) {

           name = "Suryastra";
       }

       else if(numAssigned== 2) {
           name = "Garudastra";

       }

       else if (numAssigned==3) {
           name = "Nagastra";

       }
       else if (numAssigned==4) {
           name = " Bhargavastra";
       }
       else if(numAssigned==5) {
           name = "Agneyastra";
       }

       else if(numAssigned==6){
               name="Vayavyastra";
       }
       else if(numAssigned==7) {
           name = "Bhaumyastra";
       }
       else if(numAssigned==8) {
           name = " Sammohanastra";
       }
           else if(numAssigned==9) {
           name = "Pashupatastra";
       }

           else if(numAssigned==10) {
           name = " Aindrastra";
       }
           else if(numAssigned==11) {
           name = "Yamyadandastra";

       }





        System.out.println("Welcome,"+ name);

    }
}

