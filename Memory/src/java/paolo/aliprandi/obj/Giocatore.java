/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paolo.aliprandi.obj;

import javax.servlet.ServletContext;

/**
 *
 * @author paoloaliprandi
 */
public class Giocatore implements Comparable<Giocatore> {
    public String username;
    public String punti;
    
    public Giocatore(String username, String punti) {
        this.username=username;
        this.punti=punti;
        
    }
    
    @Override
    public int compareTo(Giocatore o) {
        return Integer.parseInt(o.punti)-Integer.parseInt(punti);
    }
    
}
