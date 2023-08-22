import java.util.ArrayList;
import java.util.Date;

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
    Doctor(String nombre, String especialidad){
        System.out.println("el nombre del doctor asignado es:" +nombre);
        ++idDoctor;
        this.name = nombre;
        this.speciality = especialidad;
    }
    //Comportamientos

    public void showName(){
        System.out.println("El nombre es:  "+ name);
    }
    
    public void showIdDoctor(){
        System.out.println("idDoctor = " + idDoctor);
    }

    ArrayList<AvaibleAppointment> coleccionAvailableAppointments =  new ArrayList<>();

    //Metodo que añade muchas citas a la coleecionAvailableAppointments, es decir añade un objeto de AvaibleAppointment a la coleccion,

    public void addAvailableAppointment(Date fecha, String hora){
        coleccionAvailableAppointments.add(new AvaibleAppointment(fecha, hora));
    }

    //Metodo que devulve todos las citas guardadas en la coleccion
    public ArrayList<AvaibleAppointment> getAvailableAppointments(){
        return coleccionAvailableAppointments;
    }

    //Clase anidada

    public static class AvaibleAppointment{
        // Atributos
        private  int id_availableAppointment;
        private Date date;
        private String time;

        //Constructor
        public AvaibleAppointment (Date fecha, String hora){
            this.date = fecha;
            this.time = hora;
        }

        //Getters & Setters

        public int getId_availableAppointment(){
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id){
            this.id_availableAppointment = id;
        }

        public Date getDate(){
            return date;
        }

        public void setDate(Date fecha){
            this.date = fecha;
        }

        public String getTime(){
            return time;
        }

        public void setTime(String time){
            this.time = time;
        }
    }
}
    