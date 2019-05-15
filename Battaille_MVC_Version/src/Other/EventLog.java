package Other;

import java.util.ArrayList;

/**
 * EventLog joue le r&ocirc;le d'un historique des actions de la partie.
 * il permet de consulter les r&eacute;sultats des tours pr&eacute;cedents.
 * @see View.EventLogDraw
 */
public class EventLog {
    private ArrayList<String> messages;


    public EventLog(){
        messages = new ArrayList<String>();
    }

    /**
     * Fonction au nom amb&iuml;gue car elle permet d'ajouter une information (sous forme de texte) a l'historique des actions
     * @param text l'action ou l'information a ajouter
     */
    public void print(String text){
        messages.add(text);
    }

    public ArrayList<String> getMessages(){
        return messages;
    }
}
