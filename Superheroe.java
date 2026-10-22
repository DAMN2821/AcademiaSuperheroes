
package academiasuperheroes; // Indica el paquete al que pertenece esta clase.

// Clase que representa a un superheroe registrado en la academia.
public class Superheroe { // Comienza la clase que guarda los datos de cada superheroe.

    // Contador para generar identificadores consecutivos.
    private static int contador = 1; // Lleva la numeracion de los heroes y comienza en 1; es compartido por todos.

    // Atributos privados del superheroe.
    private final String idHeroe; // Guarda el ID del heroe; una vez asignado, no se puede cambiar.
    private String nombreHeroico; // Guarda el nombre que utiliza el heroe.
    private String nombreReal; // Guarda el nombre real de la persona.
    private String poder; // Guarda el poder elegido para el heroe.
    private String experiencia; // Guarda si el heroe es Novato, Intermedio o Elite.
    private String estado; // Guarda si el heroe esta Disponible, En mision o Recuperacion.
    private double salarioMensual; // Guarda el salario mensual como numero decimal.

    // Constructor vacio.
    // Genera automaticamente el identificador del superheroe.
    public Superheroe() { // Se ejecuta cuando creamos un heroe sin enviarle datos.

        // Genera codigos como HER-01, HER-02, HER-03.
        idHeroe = String.format("HER-%02d", contador); // Forma el ID con HER- y al menos dos digitos.

        // Aumenta el contador para el siguiente superheroe.
        contador++; // Suma 1 para que el siguiente heroe reciba otro ID.
    } // Termina el constructor vacio.

    // Constructor completo.
    // Recibe todos los datos necesarios para crear el superheroe.
    public Superheroe(String nombreHeroico, // Recibe el nombre heroico del nuevo heroe.
            String nombreReal, // Recibe su nombre real.
            String poder, // Recibe el poder que tiene el heroe.
            String experiencia, // Recibe su nivel de experiencia.
            String estado, // Recibe su estado actual.
            double salarioMensual) { // Recibe su salario y abre el constructor completo.

        // Genera primero el identificador automatico.
        this(); // Llama al constructor vacio para asignar el ID automatico.

        // Almacena los datos recibidos.
        this.nombreHeroico = nombreHeroico; // Guarda el nombre heroico recibido en el objeto.
        this.nombreReal = nombreReal; // Guarda el nombre real recibido.
        this.poder = poder; // Guarda el poder recibido.
        this.experiencia = experiencia; // Guarda la experiencia recibida.
        this.estado = estado; // Guarda el estado recibido.
        this.salarioMensual = salarioMensual; // Guarda el salario recibido.
    } // Termina el constructor completo.

    // GETTERS.
    // Permiten obtener los valores de los atributos.

    public String getIdHeroe() { // Metodo que permite consultar el ID del heroe.
        return idHeroe; // Devuelve el identificador guardado.
    } // Termina este getter.

    public String getNombreHeroico() { // Metodo para consultar el nombre heroico.
        return nombreHeroico; // Devuelve el nombre heroico guardado.
    } // Termina este getter.

    public String getNombreReal() { // Metodo para consultar el nombre real.
        return nombreReal; // Devuelve el nombre real guardado.
    } // Termina este getter.

    public String getPoder() { // Metodo para consultar el poder.
        return poder; // Devuelve el poder guardado.
    } // Termina este getter.

    public String getExperiencia() { // Metodo para consultar la experiencia.
        return experiencia; // Devuelve el nivel de experiencia guardado.
    } // Termina este getter.

    public String getEstado() { // Metodo para consultar el estado.
        return estado; // Devuelve el estado actual del heroe.
    } // Termina este getter.

    public double getSalarioMensual() { // Metodo para consultar el salario mensual.
        return salarioMensual; // Devuelve el salario como numero decimal.
    } // Termina este getter.

    // SETTERS.
    // Permiten modificar los atributos del superheroe.

    public void setNombreHeroico(String nombreHeroico) { // Recibe el nuevo nombre heroico.
        this.nombreHeroico = nombreHeroico; // Actualiza el nombre heroico del objeto.
    } // Termina este setter.

    public void setNombreReal(String nombreReal) { // Recibe el nuevo nombre real.
        this.nombreReal = nombreReal; // Actualiza el nombre real del objeto.
    } // Termina este setter.

    public void setPoder(String poder) { // Recibe el nuevo poder del heroe.
        this.poder = poder; // Actualiza el poder guardado.
    } // Termina este setter.

    public void setExperiencia(String experiencia) { // Recibe el nuevo nivel de experiencia.
        this.experiencia = experiencia; // Actualiza la experiencia guardada.
    } // Termina este setter.

    public void setEstado(String estado) { // Recibe el nuevo estado del heroe.
        this.estado = estado; // Actualiza el estado guardado.
    } // Termina este setter.

    public void setSalarioMensual(double salarioMensual) { // Recibe el nuevo salario mensual.
        this.salarioMensual = salarioMensual; // Actualiza el salario guardado.
    } // Termina este setter.

    // Metodo para mostrar la informacion del superheroe.
    @Override // Indica que este metodo reemplaza el toString() heredado de Object.
    public String toString() { // Prepara un texto con todos los datos del heroe.

        return "ID: " + idHeroe // Empieza el texto mostrando el identificador.
                + "\nNombre heroico: " + nombreHeroico // Agrega un salto de linea y el nombre heroico.
                + "\nNombre real: " + nombreReal // Agrega un salto de linea y el nombre real.
                + "\nPoder: " + poder // Agrega un salto de linea y el poder.
                + "\nExperiencia: " + experiencia // Agrega un salto de linea y la experiencia.
                + "\nEstado: " + estado // Agrega un salto de linea y el estado.
                + "\nSalario mensual: $" + salarioMensual; // Termina el texto mostrando el salario.
    } // Termina el metodo toString().
} // Termina la clase Superheroe.
