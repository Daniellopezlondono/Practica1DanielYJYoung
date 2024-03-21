package jobs;

public class TyreGunner extends TrabajadorX{
    //Constructor
    public TyreGunner(String name,int age, float yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){
        // Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en aflojar y apretar las tuercas que sostienen las llantas"));
    }
}
