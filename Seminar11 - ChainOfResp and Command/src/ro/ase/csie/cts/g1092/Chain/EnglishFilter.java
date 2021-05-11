package ro.ase.csie.cts.g1092.Chain;

public class EnglishFilter extends ChatHandler{

    public static String[] forbiddenWords = new String[]{"violent", "hit", "kill"};
    int minimumAge;

    public EnglishFilter(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    @Override
    public void processMessage(ChatMessage msg) {
        boolean isSafe = true;
        for(String word : forbiddenWords){
            if(msg.text.toLowerCase().contains(word)){
                isSafe = false;
                break;
            }
        }
        //if msg is ok, send it to the next handler
        if(isSafe){
           if(this.next != null){
               this.next.processMessage(msg);
           }
        }
    }
}
