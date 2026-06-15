package MainSystem;

import AbstractClasses.Robot;

import java.util.ArrayList;

public class RobotTakimi {
    private ArrayList<Robot> robotlar;

    public RobotTakimi(){
        this.robotlar = new ArrayList<>();
    }

    public ArrayList<Robot> getRobotlar() {
        return robotlar;
    }

    public void setRobotlar(ArrayList<Robot> robotlar) {
        this.robotlar = robotlar;
    }

    public void robotEkle(Robot robot)
    {
        robotlar.add(robot);
        System.out.println("Robot eklendi");
    }

    public void tumRobotlariGoster()
    {
        for (Robot robot : robotlar)
        {
            robot.robotBilgisiYazdir();
        }
    }
}
