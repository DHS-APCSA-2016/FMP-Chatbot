//Word checker Algorithim
public class Word{
    
    
    public static boolean findKeyword(String Word, String Sentence){
        int leng = Word.length();
        Sentence = Sentence.concat("."); //Add's period to end of word
        Sentence = " " + Sentence;  //Adds a space for algorithim to work
         int place = Sentence.toLowerCase().indexOf(Word);
         
        //My beautiful algorithim that I came up with \ (•◡•) / 
        //So don't touch!! ಠ_ಠ
        if(place != -1){
            String foo = Sentence.substring(place - 1,place);
            int length = foo.length();
            String foo2 = Sentence.substring(place + leng, place + leng + 1);
            if(foo.equals(" ") && (foo2.equals(" ") || foo2.equals(".") || foo2.equals("?") || 
             foo2.equals(",") || foo2.equals("!"))){
               return true;
            }else{
                return false;
            }
            }else{
           return false;
        }
    }
    
}