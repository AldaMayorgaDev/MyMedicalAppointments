package model;

public abstract class User {
    //Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Comportamientos
    public User(String nombre, String email) {
        this.name = nombre;
        this.email = email;
    }

    //Getters and Setters

     public void setId(int id) {
        this.id= id;
     }

     public int getId() {
        return  id;
     };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        if(phoneNumber.length() > 10){
            System.out.println("El número telefonico debe ser de 10 digitos máximo");
        }else if(phoneNumber.length() < 10){
            System.out.println("El número telefonico debe ser de 10 digitos");
        }else{
            this.phoneNumber = phoneNumber;
            System.out.println("Numero telefonico agregado con exito");

        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + ", Email: "+email+
                "\n Address: "+address + " Phone: "+phoneNumber;
    }

    //Metodo abstracto
    public abstract void showDataUser();
}
