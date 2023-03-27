import java.util.ArrayList;

public class Gestionnaire {
    private ArrayList<Documents> listDoc;

    public Gestionnaire(){
        this.listDoc = new ArrayList<Documents>();
    }

    public void ajoutDoc(Documents undoc){
        this.listDoc.add(undoc);
    }

    public Documents findDoc(Documents doc){
        if (!listDoc.contains(doc)){
            return null;
        }
        else{
            for(int i =0; i<this.listDoc.size(); i++){
                if (doc == this.listDoc.get(i)){
                    return doc;
                }
            }
        }
    }
}
