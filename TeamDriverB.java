public class TeamDriverB extends PitCrewTeam{
        private int minWorkers;

        public  TeamDriverB(int minWorkers){
            super("carroB","Calidad",26);
            this.minWorkers = minWorkers;
        }
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
}
