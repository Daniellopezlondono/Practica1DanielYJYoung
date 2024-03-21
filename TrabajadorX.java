package jobs;

public class TrabajadorX {
    private String name;
    private int age;
    private float yearsOfExperience;
    private String jobName;

    public TrabajadorX(String name, int age, float yearsOfExperience,String jobName) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.jobName=jobName;
    }

    public void job(){
        System.out.println("Por Definir");
    }
    public void qualityOfWorker(){
        if(yearsOfExperience>=5){
            System.out.println("Trabajador "+ name +" veterano, cuenta con " + yearsOfExperience+" años de experiencia");
        }
        else if(yearsOfExperience>=2){

            System.out.println("Trabajador "+ name +" bueno, cuenta con " + yearsOfExperience+" años de experiencia");

        }
        else{
            System.out.println("Trabajador "+ name + " novato, cuenta con " + yearsOfExperience+" experiencia");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
