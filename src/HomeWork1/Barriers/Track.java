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
public class Track implements Barrier{

    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public void start(Participant participant) {
        participant.run(trackLength);
    }
    
}
