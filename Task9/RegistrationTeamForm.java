package lesson4_2;

import java.util.Scanner;

public class RegistrationTeamForm {

    public String NameOfTeam() {

        System.out.println("Введите название команды:");
        Scanner teamName = new Scanner(System.in);
        return teamName.nextLine();

    }

    public int howManyMembers() {

        System.out.println("Сколько участников в вашей команде?");
        Scanner howManyMembers = new Scanner(System.in);
        return howManyMembers.nextInt();

    }

}