package lesson4_2;

import java.util.Scanner;

public class Running extends ObstacleCourse{

    @Override
    public String GetObstacle() {
        return "Бег";
    }

    @Override
    public int GetPowerRequirements () {
        return 30;
    }

    @Override
    public void GoObstacle(Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }

}