public class Student{
    String name; 
    String activity;
    String color;
    
    //Memory for the student---------------------------------------------------------------------------
    public void setName(String name){
       this.name = name;
    }
    public void setActivity(String activity){
        this.activity = activity; 
    }
      public void setColor(String color){
        this.color = color; 
    }
    
    //Return Statments------------------------------------------------------------------------------
        public String getName(){
        return name;
    }
    public String getActivity(){
        return activity;
    }
     public String getColor(){
        return color;
    }
}