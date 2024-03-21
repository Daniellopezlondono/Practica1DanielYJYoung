package jobs;// El package es el paquete donde estan todos los trabajos

public class FrontJack extends TrabajadorX{
    //Constructor
    public FrontJack(String name,int age, float yearsOfExperience,String jobName){
        super(name,age,yearsOfExperience,jobName);
    }

    //override del método de TrabajadorX
    @Override // Polimorfismo y encapsulamiento, polimorfismo del metod
    public void job(){// Encapsulamiento de sus atributos, ademas de herencia
        System.out.println(("Soy "+ getName() + " y soy un "+getJobName()+" y mi trabajo consiste en levantar el carro por al frente para cambiar las ruedas"));
    }
}