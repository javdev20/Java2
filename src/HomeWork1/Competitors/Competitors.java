/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork1.Competitors;

/**
 *
 * @author User
 */
public abstract class Competitors implements Participant {

    private String name;
    private int runLimit;
    private double jumpLimit;
    boolean onCompetition;
    
    public Competitors(String name, int runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.onCompetition = true;
    }

    public boolean isOnCompetition() {
        return onCompetition;
    }
    
    @Override
    public void run(int trackLength) {
        if (runLimit >= trackLength) {
            System.out.println(name + " successfully run...");
        } else {
            System.out.println(name + " failed to finish running...");
            onCompetition = false;
        }
    }

    @Override
    public void jump(int wallHeight) {
        if (jumpLimit >= wallHeight) {
            System.out.println(name + " successfully jumped...");
        } else {
            System.out.println(name + " failed to jump...");
            onCompetition = false;
        }
    }
}
