import static UI.UIMenu.*;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

   /*
   *
   *  *//*
        Declaracion de objeto:
            tipoDeDato nombreDeVariableObjeto;
            Doctor objetoDoctor;

        Instanciar un objeto
            objetoDoctor = nombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            objetodoctor = Doctor();

        Declarar e instanciar un objeto al mismo tiempo
            tipoDeDato nombreDeVariableObjeto = new + NombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            Doctor ObjetoDoctor = new Doctor();
        * *//*
        Doctor objetoDoctor =  new Doctor();
        objetoDoctor.name = "Aldahir Mayorga Garcia";
        objetoDoctor.showName();
        objetoDoctor.showIdDoctor();


        //Utilizando el metodo constructor con parametros
        Doctor objetoDoctor2 = new Doctor("Rodrigo Cuadri");
        objetoDoctor2.showIdDoctor();


        //Utilizando variable estatica
        Doctor objetoDoctor3 = new Doctor();
        objetoDoctor3.showIdDoctor();
*/

        //Utilizando un metodo static haciendo la importacion del package
        //showMenu();

        Patient patient01 = new Patient("Aldahir", "alda@mayorga.com");
        patient01.setWeight(74.3);
        System.out.println(patient01.getWeight());
        patient01.setPhoneNumber("9999999999");
        System.out.println(patient01.getPhoneNumber());



        Doctor doctor01 = new Doctor("Aldahir", "Cardiologia");
        doctor01.addAvailableAppointment(new Date(), "4:00 pm");
        doctor01.addAvailableAppointment(new Date(), "5:00pm");
        System.out.println(doctor01.getAvailableAppointments()); //Muestra los objetos dentro de la colecion

        for (Doctor.AvaibleAppointment citasDisponibles: doctor01.getAvailableAppointments()) {
            System.out.println(citasDisponibles.getDate() +" "+ citasDisponibles.getTime() );
        }
    }
}
