package ro.ase.csie.cts.g1092.Chain;

public abstract class ChatHandler {
    ChatHandler next = null;
    public abstract void processMessage(ChatMessage msg);

    public void setNext(ChatHandler next) {
        this.next = next;
    }
}
