    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork1.MainClass;

import HomeWork1.Barriers.Wall;
import HomeWork1.Barriers.Track;
import HomeWork1.Competitors.Robot;
import HomeWork1.Competitors.Participant;
import HomeWork1.Barriers.Barrier;
import HomeWork1.Competitors.Human;
import HomeWork1.Competitors.Cat;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("John"), new Robot("Toshiba"), new Cat("Moshon")};
        Barrier[] obstacles = {new Track(500), new Wall(3)};
        
        for(Participant r : participants) {
            for(Barrier b : obstacles) {
                b.start(r);
                if(!r.isOnCompetition()) break;
            }
        }
        
            System.out.println("========");
    }
}
