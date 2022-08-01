package lesson4_2;

public class Team {

    private String teamName;
    private People[] team;

    public Team(String teamName, People[] team) {

        this.teamName = teamName;
        this.team = team;

    }

    public String GetTeamName() {
        return teamName;
    }

    public void InfoTeam() {

        System.out.println(teamName);
        for (int i = 0; i < team.length; i++) {

            System.out.printf("%s is %d years old and with %d power\n",team[i].GetName(), team[i].GetAge(), team[i].GetPower());
        }
    }

    public People[] getTeam() {
        return team;
    }

    public void AfterObstacle(int PowerRequirements) {

        for (int i = 0; i < team.length; i++) {

            team[i].DecreasePower(PowerRequirements);

        }
    }

}