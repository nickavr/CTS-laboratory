package ro.ase.csie.cts.g1092.Chain;

public class ChatMessage {
    String destination;
    String text;
    int priority;

    public ChatMessage(String destination, String text, int priority) {
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }
}
