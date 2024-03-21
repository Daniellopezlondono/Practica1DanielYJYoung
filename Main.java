//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Creamos el equipo según las reglas como dice en la página
        F1Team f1Team1 = new F1Team("Redbull",1920,3);
        F1Team f1Team2 = new F1Team("Mercedes",1970,5);
        f1Team1.accederPrivado();
        f1Team2.accederPrivado();

        PitCrewTeam pitCrewTeam = new PitCrewTeam("Los dragones","Ganar",26);
        TeamDriverA teamDriverA = new TeamDriverA(16);
        TeamDriverB teamDriverB = new TeamDriverB(16);
        System.out.println("F1 Team1: " + f1Team1.getName() + " (" + f1Team1.getFoundationYear() + ")");
        System.out.println("F1 Team2: " + f1Team2.getName() + " (" + f1Team2.getFoundationYear() + ")");
        System.out.println("Pit Crew cantidad de miembros : " + pitCrewTeam.getTotalPitCrewMembers());
        System.out.println("Team Driver A cantidad de miembros : " + teamDriverA.getMinWorkers());
        System.out.println("Team Driver B cantidad de miembros : " + teamDriverB.getMinWorkers());

    }
}