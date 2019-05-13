package Other;

import java.util.ArrayList;

public class EventLog {
    private ArrayList<String> messages;

    public EventLog(){
        messages = new ArrayList<String>();
    }

    public void print(String text){
        messages.add(text);
    }

    public ArrayList<String> getMessages(){
        return messages;
    }
}
