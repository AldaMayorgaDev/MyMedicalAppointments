public class Doctor {
    int idDoctor;
    String name;
    String speciality;

    //Metodo constructor
    Doctor(){
        System.out.println("Construyendo un objeto Doctor");
    }

    //Metodo Constructor con parametros
    Doctor(String name){
        System.out.println("el nombre del doctor asignado es:" +name);
    }
    //Comportamientos

    public void showName(){
        System.out.println("El nombre es:  "+ name);
    }

}
