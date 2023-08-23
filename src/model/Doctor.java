package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //Atributos propios de la clase
    private String speciality;
/*    private String name;
    private String speciality;
    private String email;
    private String address;
    private String phoneNumber;
    static int idDoctor = 0; //Autoincrementable por cada instancia
*/

/*    //Metodo constructor
    model.Doctor(){
        System.out.println("Construyendo un objeto model.Doctor");
        //++idDoctor;
    }*/

    //Metodo Constructor con parametros
    public Doctor(String nombre, String email){
        super(nombre, email);
    }
    //Comportamientos

/*    public void showName(){
        System.out.println("El nombre es:  "+ name);
    }
    
    public void showIdDoctor(){
        //System.out.println("idDoctor = " + idDoctor);
    }*/

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvaibleAppointment> coleccionAvailableAppointments =  new ArrayList<>();

    //Metodo que añade muchas citas a la coleecionAvailableAppointments, es decir añade un objeto de AvaibleAppointment a la coleccion,

    public void addAvailableAppointment(String fecha, String hora){
        coleccionAvailableAppointments.add(new AvaibleAppointment(fecha, hora));
    }

    //Metodo que devulve todos las citas guardadas en la coleccion
    public ArrayList<AvaibleAppointment> getAvailableAppointments(){
        return coleccionAvailableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()
                + "+\n Speciality:" + speciality
                + "\n Available: " + coleccionAvailableAppointments.toString();
    }

    //Implementacionn metodo abstracto heredado de User
    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");

    }


    //Clase anidada

    public static class AvaibleAppointment{
        // Atributos
        private  int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //Constructor
        public AvaibleAppointment (String date, String hora){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            this.time = hora;
        }

        //Getters & Setters

        public int getId_availableAppointment(){
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id){
            this.id_availableAppointment = id;
        }

        public Date getDate(String DATE){
            return date;
        }
        public String getDate(){
            return format.format(date);
        }



        public void setDate(Date date){
            this.date = date;
        }

        public String getTime(){
            return time;
        }

        public void setTime(String time){
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoiments \nDate:" +date + "\nTime:" +time;
        }
    }



}
    