public class Doctor {
    static int idDoctor = 0; //Autoincrementable por cada instancia
    String name;
    String speciality;

    //Metodo constructor
    Doctor(){
        System.out.println("Construyendo un objeto Doctor");
        ++idDoctor;
    }

    //Metodo Constructor con parametros
    Doctor(String name){
        System.out.println("el nombre del doctor asignado es:" +name);
        ++idDoctor;
    }
    //Comportamientos

    public void showName(){
        System.out.println("El nombre es:  "+ name);
    }
    
    public void showIdDoctor(){
        System.out.println("idDoctor = " + idDoctor);
    }
}
    