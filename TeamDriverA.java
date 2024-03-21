public class TeamDriverA extends PitCrewTeam{
    private int minWorkers;

    public TeamDriverA(int minWorkers){
        super("carroA","Velocidad",26);// Usamos 26 totales, ya que son 21 para cada carro, pero son 5 para TeamA y 5 para TeamB
        this.minWorkers=minWorkers;
    }
    private String name;

    private String specialty; // Cualquier cosa, como velocidad de cambio, o calidad de materiales, o inteligencia a la hora de llamar al conductor


    private String job;

    // El metodo privado
    private void XX(){

    }
    // Acceder al metodo privado a partir de un metodo publico
    public void accesoPrivado(){
        XX();
    }

    public int getMinWorkers() {
        return minWorkers;
    }

    public void setMinWorkers(int minWorkers) {
        this.minWorkers = minWorkers;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
