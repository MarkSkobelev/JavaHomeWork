package lesson4_2;

public class Swimming extends ObstacleCourse{
    @Override
    public String GetObstacle () {

        return "Плавание";

    }

    @Override
    public int GetPowerRequirements () {

        return 20;

    }

    @Override
    public void GoObstacle (Team team) {

        team.AfterObstacle(GetPowerRequirements());

    }
}