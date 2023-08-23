import model.Doctor;
import model.Patient;

import java.util.Date;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

   /*
   *
   *  *//*
        Declaracion de objeto:
            tipoDeDato nombreDeVariableObjeto;
            model.Doctor objetoDoctor;

        Instanciar un objeto
            objetoDoctor = nombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            objetodoctor = model.Doctor();

        Declarar e instanciar un objeto al mismo tiempo
            tipoDeDato nombreDeVariableObjeto = new + NombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            model.Doctor ObjetoDoctor = new model.Doctor();
        * *//*
        model.Doctor objetoDoctor =  new model.Doctor();
        objetoDoctor.name = "Aldahir Mayorga Garcia";
        objetoDoctor.showName();
        objetoDoctor.showIdDoctor();


        //Utilizando el metodo constructor con parametros
        model.Doctor objetoDoctor2 = new model.Doctor("Rodrigo Cuadri");
        objetoDoctor2.showIdDoctor();


        //Utilizando variable estatica
        model.Doctor objetoDoctor3 = new model.Doctor();
        objetoDoctor3.showIdDoctor();
*/

        //Utilizando un metodo static haciendo la importacion del package
        //showMenu();
/*
        Patient patient01 = new Patient("Aldahir", "alda@mayorga.com");
        patient01.setWeight(74.3);
        System.out.println(patient01.getWeight());
        patient01.setPhoneNumber("9999999999");
        System.out.println(patient01.getPhoneNumber());




        Doctor doctor01 = new Doctor("Aldahir", "Cardiologia");
        doctor01.addAvailableAppointment(new Date(), "4:00 pm");
        doctor01.addAvailableAppointment(new Date(), "5:00pm");
        System.out.println(doctor01.getAvailableAppointments()); //Muestra los objetos dentro de la colecion

        System.out.println(doctor01);

*//*        for (model.Doctor.AvaibleAppointment citasDisponibles: doctor01.getAvailableAppointments()) {
            System.out.println(citasDisponibles.getDate() +" "+ citasDisponibles.getTime() );
        }*//*

        Patient paciente02 = new Patient("Aldahir Mayorga", "samg.25sep@gmail.com");
        System.out.println(paciente02);
        paciente02.showDataUser();*/

        showMenu();
    }
}
