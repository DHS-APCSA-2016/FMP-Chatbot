import java.util.ArrayList;
import java.util.Random;
public class Response{
public static ArrayList<Boolean> values = new ArrayList<Boolean>();   
 public static boolean ArrayInt = false;      


   
    public static String getResponse(String x){

        if(ArrayInt == false){
    values = fillArray();
    ArrayInt = true;
}

       
      String ITest = x.substring(0,1); 
        //curse checker
       
        if(x.indexOf("frick") != -1
        || x.indexOf("shoot") != -1
        || x.indexOf("bunch of wheats") != -1
        || x.indexOf("cunt") != -1
        || Word.findKeyword("applesause",x)  //only curse word that can appear in other words 
        || x.indexOf("darn") != -1
        ) {
           
            return "curse";
        }
       
               if(((values.get(1) == false
        && Word.findKeyword("purchase",x)
        || Word.findKeyword("buy",x)
        || Word.findKeyword("get",x)
        && Word.findKeyword("id",x)))){
         values.add(true);
         return "You can purchase an ID at the Student activites office.";
        }else if(values.get(1) == true){
            return "You've already asked that question";
        }
        
        
  
      //Question 2          
         else if(((Word.findKeyword("change",x)
        && (Word.findKeyword("class",x)
        || Word.findKeyword("classes",x)
        || Word.findKeyword("schedule",x))))){
         return "You can change your schdeule at the cousneling office.";
        }
        
        //Question 3
         else if(((Word.findKeyword("find",x)
        && (Word.findKeyword("get",x)
        || Word.findKeyword("tutoring",x))))){
         return "You can go to the hub for tutoring";
        }
        
          //Question 4
         else if(((Word.findKeyword("find",x)
        && Word.findKeyword("out",x)
        && Word.findKeyword("sports",x))))
         return "You can find out about sports at the student acitvites office.";
       
       //Question 5
         else if(((Word.findKeyword("find",x)
        && Word.findKeyword("out",x)
        && Word.findKeyword("clubs",x))))
         return "You can find out about clubs at the student acitvites office.";
      
       //Question 6
         else if(((Word.findKeyword("where",x)
        || Word.findKeyword("need",x))
        && Word.findKeyword("transcript",x)))
         return "You can recieve a copy of your transcript on Infinte Campus";
         
         //Question 7
         else if(((Word.findKeyword("get",x)
        && (Word.findKeyword("find",x)
        || Word.findKeyword("clothes",x)
        || Word.findKeyword("apperel",x))))){
         return "You can go to the DHS webstore for apperel.";
        }
        
        //Question 8
         else if(((Word.findKeyword("find",x)
        && (Word.findKeyword("get",x)
        || Word.findKeyword("bell scheduel",x))))){
         return "Get the bell scheduel on the DHS webpage";
        }
        
        //Question 9
         else if(((Word.findKeyword("talk",x)
        && (Word.findKeyword("find",x)
        || Word.findKeyword("counselor",x))))){
         return "You can meet with your counselor by signing up in the Counseling center";
        }
        
        //Question 10
         else if(((Word.findKeyword("buy",x)
        && (Word.findKeyword("get",x)
        || Word.findKeyword("parking pass",x))))){
         return "You can buy a parking pass in Student Activites";
        }
        
        //Question 11
         else if(((Word.findKeyword("What is?",x)
        || Word.findKeyword("Acedemic Block D",x)))){
         return "It is a patch you get for getting a 3.5 GPA 3 semesters straight or 5 semesters total";
        }
        
        //Question 12
         else if(((Word.findKeyword("get",x)
        && (Word.findKeyword("earn",x)
        || Word.findKeyword("academic block D",x))))){
         return "Turn in the paper to Counseling office";
        }
        
        //Question 13
         else if(((Word.findKeyword("school",x)
        && (Word.findKeyword("start",x)
        || Word.findKeyword("begin",x))))){
         return "School starts at 8:00 am";
        }
        
        //Question 14
         else if(((Word.findKeyword("school",x)
        || Word.findKeyword("finish",x)
        || Word.findKeyword("end",x)))){
         return "School ends at 3:27 pm";
        }
        
        //Question 15
         else if(((Word.findKeyword("lunch",x)
        && (Word.findKeyword("start",x)
        || Word.findKeyword("begin",x))))){
         return "Lunch starts at 11:43 am";
        }
        
        //Question 16
         else if(((Word.findKeyword("lunch",x)
        && (Word.findKeyword("",x)
        || Word.findKeyword("finish",x)
        || Word.findKeyword("end",x))))){
         return "Lunch ends at 12:39 pm";
        }
        
        //Question 17
         else if(((Word.findKeyword("lost my",x)
        && (Word.findKeyword("need new",x)
        || Word.findKeyword("Id",x))))){
         return "";
        }
        
        //Question 18
         else if(((Word.findKeyword("get",x)
        || Word.findKeyword("work permit",x)))){
         return "Work permits are available at the College and Career center.";
        }
        
        //Question 19
         else if(((Word.findKeyword("what is",x)
        && (Word.findKeyword("who is",x)
        || Word.findKeyword("the gael",x))))){
         return "The DHS mascot";
        }
        
        //Question 20
         else if(((Word.findKeyword("when",x)
        && Word.findKeyword("football",x)))){
         return "Varsity football games start at 7:00 pm.";
        }
        //Questions ***************************************************************************
        
        else if((Word.findKeyword("you",x)
        ||      (Word.findKeyword("your",x)))
        &&      Word.findKeyword("food",x)
        ){
            return getFood();
        }
         else if(((Word.findKeyword("you",x)
        &&(x.indexOf("are") > x.indexOf("you")) 
        &&(Word.findKeyword("trash",x)
        ||(Word.findKeyword("dumb",x)
        ||Word.findKeyword("i dont like",x)
        ||Word.findKeyword("stupid",x))))))
      {
          Random num = new Random();
            int dice = num.nextInt(3) + 1;
     
            String[] foo1 = {"That was quite rude.","Please dont't insult","#Chatbots have feelings too.", "Don't make me start insulting you."};
       
             return foo1[dice];
    }
        
        else if(((Word.findKeyword("hello",x)
        || Word.findKeyword("hi",x)
        || Word.findKeyword("hey",x)
        || Word.findKeyword("what's up",x)))){
         return getGreeting();
        }
        else if(x.indexOf("really") != -1
        ||      x.indexOf("really?") != -1
        ){
                return getRep();
        }
         else if(x.equals("because")){
            return "There's no need to be sassy.";
        }
        else if((Word.findKeyword("what",x)
        && Word.findKeyword("you",x)
        && Word.findKeyword("do",x)))
         return "I enjoy " + getActivity();
        
         else if(ITest.equals("specs")){
         return ("Typing in \"bye\" will end the program. \b A curse moderator has been enabled");
        }
     else if(ITest.equals("i")){
         if(Word.findKeyword("my",x)){
             String a = changeToQuestion(x);
             return replaceWord(a,"my","your");
            }
         return changeToQuestion(x);
        }
      else if(Word.findKeyword("thank",x)
        ||   Word.findKeyword("thanks",x)
      ){
           return getThanksR();
        }
        else if(Word.findKeyword("you",x)
        && (Word.findKeyword("sure?",x) 
        || Word.findKeyword("sure",x)
        )){
            return getSure();
        }
        else if(Word.findKeyword("roast",x)
                ){
             int num1 = x.indexOf("your");
             String result = x.substring(5);
             Random num = new Random();
    
            int dice2 = num.nextInt(6) + 1; 
            String[] foo2 = {"You won't want that"};
                             
                           return foo2[dice2];
        }
        else if(Word.findKeyword("your",x)
                ||(Word.findKeyword("are",x)
                && Word.findKeyword("you",x)) ){
             int num1 = x.indexOf("your");
             String result = x.substring(5);
             Random num = new Random();
    
            int dice2 = num.nextInt(3) + 1; 
            String[] foo2 = {"I have been programed to not talk about that. It's a long story.",
                             "Better question, what is " + result ,"Sorry, but I don't feel conmfortable answering that question.",
                             "That's private information."};
             return foo2[dice2];
        }
     if(x.indexOf("who") != -1
        || x.indexOf("what") != -1
        || x.indexOf("when") != -1
        || x.indexOf("where") != -1
        || x.indexOf("why") != -1
        || x.indexOf("how") != -1
        || x.indexOf("?") != -1
       
        ) {
            Random num = new Random();
            int dice = num.nextInt(4) + 1;
            int dice2 = num.nextInt(3) + 1; 
            String[] foo1 = {"Hmm, ","Umm, ","Well, ","O_o? ", "I'm so sorry, but "};
            String[] foo2 = {"I'm not exactly sure.","I don't actually know." ,"I'm not sure.","I'm afraid that I don't know the answer to that question"};
             return foo1[dice] + foo2[dice2];
        }
        else if(((Word.findKeyword("you",x)
        &&(Word.findKeyword("awesome",x))
        ||(Word.findKeyword("amazing",x))
        ||Word.findKeyword("great",x))
        ||Word.findKeyword("cool",x))
        ||Word.findKeyword("smart",x)
        ||Word.findKeyword("handsome",x)
        ||Word.findKeyword("sexy",x))
      {
        return getThanks();
    }
    
   return getComment();
   
}
public static String getComment(){
    Random num = new Random();
            int dice = num.nextInt(6) + 1;
            String[] foo1 = {"Intresting!","Awesome!","That's so cool!","I think that is amazing", "You are so intresting",
            "Really?","Is that true?"};
             return foo1[dice];
}
public static String getThanksR(){
    Random num = new Random();
            int dice = num.nextInt(6) + 1;
    String[] foo1 = {"You're welcome.","You are totally welcome.","Don't mention it.","It's always a pleasure to help people like you", 
        "My pleasure","Don't thank me, thank Michael and Grayson for programming me.", "Do you really mean it"};
    return foo1[dice];
   }
public static String getGreeting(){
    Random num = new Random();
      int dice = num.nextInt(2) + 1;
    String[] foo1 = {"Hey!","Hi!","What's up!"};
    return foo1[dice];
}
public static String getRep(){
    Random num = new Random();
    int dice = num.nextInt(2) + 1;
     String[] foo1 = {"I'm serious","I'm not kidding","Yeah"};
    return foo1[dice];
 }
    public static String getActivity(){
    Random num = new Random();
    int dice = num.nextInt(5) + 1;
    String[] foo1 = {"cooking","biking","running","swimming","long waks along the beach"};
    return foo1[dice];
}
    
 public static String getThanks(){
    Random num = new Random();
    int dice = num.nextInt(5) + 1;
    String[] foo1 = {"Thanks.","You are so nice.","It's feels nice to be appreciated","Thank you","No one has ever said that to me, thanks!"};
    return foo1[dice];
    }
 public static String getSure(){
    Random num = new Random();
    int dice = num.nextInt(2) + 1;
    String[] foo1 = {"I am absoulutly sure.","Yes, I am sure.","I am always right."};
    return foo1[dice];
}
public static String getFood(){
    Random num = new Random();
    int x = num.nextInt(16) + 1;
    String comment = null;
    String[] foods = {"chips","hotdogs","hamburgers","soup","steak","tacos","burritos",
        "chicken","cupcakes","french fries","pancakes","waffles","apples","ribs","enchialadas","rice"};
    comment = foods[x];
    return "I love " + comment;
}
 public static String changeToQuestion(String x){
    String input = x.substring(2,x.length());
    return "Why do you " + input + "?";
}
public static String addActivites(){
    Random num = new Random();
    String[] Activites;
    return "hey";
}
public static String replaceWord(String sen,String key,String word){
        String message = sen;
        word = word;
        return message.replaceAll(key,word);
}
public static ArrayList<Boolean> fillArray(){
    ArrayList<Boolean> val = new ArrayList<Boolean>();
    
    for(int x = 0; x< 100; x++){
        val.add(false);
        }
     return val;
}
}
    
   