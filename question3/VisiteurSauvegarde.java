package question3;
import java.util.HashMap;
import question1.*;


public class VisiteurSauvegarde implements question1.Visiteur<HashMap<Cotisant, Integer>>{
    public HashMap<Cotisant, Integer> visite(Contributeur c){        
        HashMap<Cotisant, Integer> svgd = new HashMap<Cotisant, Integer>();                             
        Integer solde = new Integer(c.solde());                             
        svgd.put(c, solde); return svgd; 
    } 

    public HashMap<Cotisant, Integer> visite(GroupeDeContributeurs g) {                            
        HashMap<Cotisant, Integer> svgd = new HashMap<Cotisant, Integer>(); 
        for(Cotisant c: g.getChildren()){                             
            HashMap<Cotisant, Integer> nouveaux = c.accepter(this);                             
            svgd.putAll(nouveaux); 
        } 
        return svgd; 
    } 
}