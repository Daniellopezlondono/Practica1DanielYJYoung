package jobs;

public class TyreOff extends TrabajadorX{
    //Constructor
    public TyreOff(String name,int age, float yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){
        // Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en bajar una llanta de 10.5Kg lo más rápido posible"));
    }
}