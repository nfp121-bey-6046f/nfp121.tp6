package question2;

import question1.Contributeur;
import question1.GroupeDeContributeurs;
import question1.Cotisant;
import question1.Visiteur;

public class CompositeValide implements Visiteur<Boolean>{
  // Le solde de chaque contributeur doit �tre sup�rieur ou �gal � 0 
  // et il n�existe pas de groupe n�ayant pas de contributeurs.
  
  public Boolean visite(Contributeur c){
    //return false; // a compl�ter;
    return c.solde() >= 0; 
  }
  
  public Boolean visite(GroupeDeContributeurs g){
    //boolean res = false;// a compl�ter
    if(g.nombreDeCotisants()<=0){ 
            return false; 
        } 
        for(Cotisant c : g.getChildren()){ 
            if( !c.accepter(this)){ 
                return false; 
            } 
        } 
        return true ; 
    // a compl�ter
    //return res ;
    
  }
}