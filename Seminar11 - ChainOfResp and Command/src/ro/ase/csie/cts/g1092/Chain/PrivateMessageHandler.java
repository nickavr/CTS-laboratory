package ro.ase.csie.cts.g1092.Chain;

public class PrivateMessageHandler extends ChatHandler{
    @Override
    public void processMessage(ChatMessage msg) {
        if(msg.destination.toLowerCase().equals("@everyone")){
            if(this.next != null){
                //calling the process for the next node in chain
                this.next.processMessage(msg);
            }
        }
        else{
            System.out.println("Private message for " + msg.destination + ": " + msg.text);
        }
    }
}
