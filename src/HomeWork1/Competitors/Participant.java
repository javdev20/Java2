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
public interface Participant {
    void run(int trackLength);
    void jump(int wallHeight);
    boolean isOnCompetition();
}
