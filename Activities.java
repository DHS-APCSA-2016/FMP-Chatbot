import java.util.ArrayList;
public class Activities{
    
ArrayList<String> Activites= new ArrayList<String>(); 
    
     public void main(){
     
        String file = ActivityFile.readString();
        int secondnum = 0;
        for(int x = 0; x < 100; x++){
         try{
        int firstnum = file.indexOf("|",secondnum + 1);
        String r = file.substring(secondnum + 1,firstnum);
        secondnum = file.indexOf("|",firstnum);
        Activites.add(r);
        
    }
    catch (Exception e){
        
    }
    }
}
    
    public void checkActivity(String x){
        String text = null;
        x = x.toLowerCase();
        main();
        if(x.equals("")){
            text = "You should answer!";
  }
        for(int y = 0; y < Activites.size();y++){
            if(Activites.get(y).contains(x)){
            text = "That's fun!";
            y = Activites.size();
        }
        else{
             text ="What is that exactly?";
        }
        }
       System.out.println(text);

    }
    
}
