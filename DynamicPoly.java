import java.io.BufferedReader;
import java.io.InputStreamReader;
// malaki burat ko 

public class DynamicPoly  {
    public static void main(String[] args) throws Exception {
     Gender gender; 

     InputStreamReader input = new InputStreamReader(System.in);
     BufferedReader reader = new BufferedReader(input);

     System.out.println("Choose your gender (1 = Male)====(2 = Female)");
     int ans = Integer.parseInt(reader.readLine());

     if (ans==1) {
        gender = new Male();
        gender.speak();
     }
     else if (ans==2) {
        gender = new Female();
        gender.speak();
     }
     else{
        gender = new Gender();
        gender.speak();
     }

     sas TITEEEEE
     
     
    }

    public static class Gender{
        void speak(){
            System.out.println("di ko alam kung lalaki ba ako o babae haha bahala na ");
        }
    }


    public static class Male extends Gender{
        void speak(){
            System.out.println("Goodday I am a Male!");
        }
    }



    

    public static class Female extends Gender{
        void speak(){
            System.out.println("Goodday I am a Female!");
        }
    }
}
