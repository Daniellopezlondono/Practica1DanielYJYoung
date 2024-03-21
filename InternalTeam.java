package jobs;

import java.sql.SQLOutput;

public class InternalTeam {
    //Atributos, nombre y profesion que desempeña
    private String name;
    private String profesion;

    //constructor
    public  InternalTeam(String name, String profesion){
        this.name=name;
        this.profesion=profesion;
    }

    ///A la hora de crearlo elegimos 5
    //WaterMan
    //Cleaner
    //
    //
    //
    private void state(){
        if (profesion == ""){

        } else if (profesion ==" ") {

        } else if (profesion ==" ") {

        } else if (profesion ==" ") {

        } else if (profesion ==" ") {

        }else {
            System.out.println("Limpiaré el carro");
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfesion(){
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}
