package lesson4_2;

public class Jumping extends ObstacleCourse{
    @Override
    public String GetObstacle() {
        return "Прыжки";
    }

    @Override
    public int GetPowerRequirements() {
        return 15;
    }

    @Override
    public void GoObstacle(Team team) {
        team.AfterObstacle(GetPowerRequirements());
    }
}