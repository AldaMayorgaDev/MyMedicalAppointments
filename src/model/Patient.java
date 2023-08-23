package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{

    /*
    static int idPatient = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    */
    //Atributos propios de model.Patient
    private String birthDate;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String nombre, String email){
        super(nombre, email);
    }

    //Getters Y Setters

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mtrs.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }


/*
    public void setName(String nombre){
        this.name = nombre;
    }

    public String  getName(){
        return this.name;
    }

    public String getWeight() {
        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPhoneNumber(String phoneNum){
        if(phoneNum.length() > 10){
            System.out.println("El número telefonico debe ser de 10 digitos máximo");
        }else if(phoneNum.length() < 10){
            System.out.println("El número telefonico debe ser de 10 digitos");
        }else{
            this.phoneNumber = phoneNum;
            System.out.println("Numero telefonico agregado con exito");

        }
    };

    public String getPhoneNumber(){
        return "Núm. Telefonico: "+phoneNumber;
    }*/



    //Sobre escribiendo el meotodo toString()
    @Override
    public String toString(){
        return super.toString() + "\nAge: " +birthDate + "\n Weight:"+ getWeight() + "\n Height: "+ getHeight()
                + "\n Blood: "+ blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo");
    }
}
