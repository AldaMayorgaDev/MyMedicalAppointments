package UI;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String [] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //Si userType =1 es Doctor
        //Si userType =2 es Patient

        ArrayList<Doctor>ArrayDoctors = new ArrayList<>(); //Creacion de un arrayList para guardar objetos Doctores
        ArrayDoctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com")); //Añadiendo objeto a ArrayDoctors
        ArrayDoctors.add(new Doctor("Marco Gutierrez", "marco@mail.com"));
        ArrayDoctors.add(new Doctor("Faviola Franco", "Favi@mail.com"));

        ArrayList<Patient> ArrayPatients = new ArrayList<>();
        ArrayPatients.add(new Patient("Aldahir Mayorga", "aldahir@gmail.com"));
        ArrayPatients.add(new Patient("Jesus Fernandez", "jesus@mail.com"));
        ArrayPatients.add(new Patient("Rosa Viña", "vina@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [a@a.com]" );
            Scanner teclado = new Scanner(System.in);
            String emailIngresado = teclado.nextLine();

            if(userType ==1){
                for(Doctor d: ArrayDoctors){
                    if(d.getEmail().equals(emailIngresado)){
                        emailCorrect= true;
                        //Obtener el usuario logeado
                        doctorLogged = d;

                        UIDoctorMenu.showDoctorMenu();
                    }
                }

            }
            if(userType ==2){
                for(Patient p: ArrayPatients){
                    if(p.getEmail().equals(emailIngresado)){
                        emailCorrect= true;
                        //Obtener el usuario logeado
                       patientLogged= p;

                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);
    }
   static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3 ; i++) {
                        System.out.println(i+1+".- " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
