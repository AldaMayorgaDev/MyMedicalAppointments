public class Patient {
    static int idPatient = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthDate;
    private double weight;
    private float height;
    private String blood;

    public Patient(String nombre, String email){
        this.name = nombre;
        this.email = email;

    }

    //Getters Y Setters

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
    }
}
