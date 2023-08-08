public class Main {
    public static void main(String[] args) {

        /*
        Declaracion de objeto:
            tipoDeDato nombreDeVariableObjeto;
            Doctor objetoDoctor;

        Instanciar un objeto
            objetoDoctor = nombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            objetodoctor = Doctor();

        Declarar e instanciar un objeto al mismo tiempo
            tipoDeDato nombreDeVariableObjeto = new + NombreClaseBaseParaCrearAlgúnTipoDeObjetos();
            Doctor ObjetoDoctor = new Doctor();
        * */
        Doctor objetoDoctor =  new Doctor();
        objetoDoctor.name = "Aldahir Mayorga Garcia";
        objetoDoctor.showName();


        //Utilizando el metodo constructor con parametros
        Doctor objetoDoctor2 = new Doctor("Rodrigo Cuadri");
    }
}
