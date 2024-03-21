import java.sql.SQLOutput;

public class PitCrewTeam{

   private String name;
   private String specialty;

   private int totalPitCrewMembers;

   public  PitCrewTeam(String name, String specialty, int totalPitCrewMembers){
      this.name=name;
      this.specialty=specialty;
      this.totalPitCrewMembers=totalPitCrewMembers;

   }

   // El @override
   public void job(){
      System.out.println("Por Definir");;
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSpecialty() {
      return specialty;
   }

   public void setSpecialty(String specialty) {
      this.specialty = specialty;
   }

   public int getTotalPitCrewMembers() {
      return totalPitCrewMembers;
   }

   public void setTotalPitCrewMembers(int numMembers) {
      this.totalPitCrewMembers = numMembers;
   }
}
