/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paolo.aliprandi.obj;

import java.util.LinkedList;

/**
 *
 * @author paoloaliprandi
 */
public class Classifica extends LinkedList<Giocatore> {
    
    final String PRE="<li>";
    final String MID= "-";
    final String POST="</li>";
    
    public String getFormattedClassifica() {
        String s="<h3>Classifica vuota - Nessuna partita giocata</h3>";
        
        if (!this.isEmpty()) {
            s="<ul>";
            for(Giocatore g: this) {
                s=s+PRE+g.punti+MID+g.username+POST;
            }
            s=s+"</ul>";
        }
        
        return s;
    }
    
}
