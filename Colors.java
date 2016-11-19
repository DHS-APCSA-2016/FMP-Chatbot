import java.util.Random;
import java.util.ArrayList;
public class Colors{
 
ArrayList<String> Colors= new ArrayList<String>(); 
    
     public void main(){
      
        String file = ColorFile.readString();
        int secondnum = 0;
        for(int x = 0; x < 100; x++){
         try{
        int firstnum = file.indexOf("|",secondnum + 1);
        String r = file.substring(secondnum + 1,firstnum);
        secondnum = file.indexOf("|",firstnum);
        Colors.add(r);
    }
    catch (Exception e){
        
    }
    }
}
    
    public void checkColor(String x){
        main();
        String text = null;
        x = x.toLowerCase();
        main();
        if(x.equals("")){
            text = "Why aren't you answering!";
  }
        for(int y = 0; y < Colors.size();y++){
            if(Colors.get(y).contains(x)){
               
              Random num = new Random();
            int z = num.nextInt(3) + 1;
            switch(z){
            case 1: 
            text = "I love that color!";
            y = Colors.size();
            break;
            case 2:
            text = "That's an awesome color!";
            y = Colors.size();
            break;
            case 3: 
            text = "Why do you like " + x + "?" ;
            y = Colors.size();
            break;
            }     
             y = Colors.size();
        }
        else{  text ="Are you sure that is a real color?";
            }
        }
       System.out.println(text);

    }}
    
    
 
