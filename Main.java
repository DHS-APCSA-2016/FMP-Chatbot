import java.util.Random;
public class Main{
 public String name; 
   
    
    public static void main(String[] args){
        Stuff();
    }
  
    public static void Stuff(){
    //Variables---------------------------------------------------------------------------------------    
         int curse = 0;
       String input = "null";
       String answer = "empty";
      Colors col = new Colors();
    //Iniaitates Student class and set name-----------------------------------------------------------------------------------------   
         Student person = new Student();
         System.out.println("Hi! I'm " + getName() + ", your personal FMP mentor.");
  
  
    //Complicated Algothrim crap---------------------------------------------------------------------------------------------------------------------
        while(input.indexOf("bye") == -1 && curse != 2){
        input = UserInput.getString().toLowerCase();
        answer = Response.getResponse(input);
     
        if((input.indexOf("bye") == -1) && (!answer.equals("curse"))){
        System.out.println(answer);
    }
      else if(curse == 1){
        System.out.println("You have been reported ");
        curse++;
    }
    else if(answer.equals("curse")){
        System.out.println("Please do not curse, you will be reported to admin if repeated!");
        curse++;
    }
        else{
      System.out.println(getBye());
    }
 
    }
 
}

//Random  methods-----------------------------------------------------------------------------------------------------------------------------------------------------

    public static String getName(){
        Random num = new Random();
        int x = num.nextInt(19) + 1;
        String name = "null";
        String[] names = {"Jimbo","Michael","Grayson","Jim","John","James","Kyle","Randy","Todd","Tim","Adrian","Brandon","Braydon","Jeffery",
        "Christan","Gumbo","Rimbo","Timbo","Limbo","Simbo"};
        name = names[x];
    return name; 
}


public static String getBye(){
     Random num = new Random();
        int x = num.nextInt(4) + 1;
        String name = "null";
        switch(x){
            case 1:
            name = "See you later, Gator!";
            break;
            case 2:
            name = "Goodbye";
            break;
            case 3:
            name ="See ya";
            break;
            case 4: 
            name = "Bye";
            break;
         
    }
    return name; 
}


public static String getNameThing(){
     Random num = new Random();
        int x = num.nextInt(3) + 1;
        String name = "null";
        switch(x){
            case 1:
            name = "Wonderful name, ";
            break;
            case 2:
            name = "Awesome name, ";
            break;
            case 3:
            name ="Nice to meet you, ";
            break;
         }
    return name; 
}
public static void doActivity(){
       Activities check = new Activities();
        System.out.println("What do you like to do?");
        String Activity = UserInput.getString();
       check.checkActivity(Activity);
    }} 