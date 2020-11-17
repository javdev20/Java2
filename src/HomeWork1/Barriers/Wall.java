/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork1.Barriers;

import HomeWork1.Competitors.Participant;
import HomeWork1.Barriers.Barrier;

/**
 *
 * @author User
 */
public class Wall implements Barrier{
   
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void start(Participant participant) {
        participant.jump(wallHeight);
    }
    
    

}
