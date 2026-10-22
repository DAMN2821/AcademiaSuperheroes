
package academiasuperheroes; // Indica el paquete donde se encuentra esta clase.

// Importamos ArrayList para almacenar los superheroes del equipo.
import java.util.ArrayList; // Permite crear y utilizar listas que pueden cambiar de tamaño.

// Clase que representa un equipo de rescate.
public class EquipoRescate { // Comienza la clase que guarda la informacion de un equipo.

    // Contador para generar identificadores consecutivos.
    private static int contador = 1; // Lleva la numeracion de todos los equipos y comienza en 1.

    // Atributos del equipo de rescate.
    private final String idEquipo; // Guarda el codigo unico del equipo y evita que se reasigne.
    private String nombreEquipo; // Guarda el nombre que identifica al equipo.
    private String tipoEmergencia; // Guarda el tipo de emergencia que atendera el equipo.
    private ArrayList<Superheroe> listaSuperheroes; // Guarda los objetos de los superheroes que integran el equipo.
    private String nivelAmenaza; // Guarda el nivel de amenaza: Baja, Media o Alta.
    private String ciudadAsignada; // Guarda el nombre de la ciudad asignada al equipo.
    private boolean usoTecnologiaEspecial; // Guarda true si usa tecnologia especial y false si no la usa.

    // Constructor vacio.
    // Genera automaticamente el ID y crea la lista de superheroes.
    public EquipoRescate() { // Se ejecuta al crear un equipo sin enviar datos.

        // Genera codigos como EQU-01, EQU-02, EQU-03.
        idEquipo = String.format("EQU-%02d", contador); // Forma el codigo EQU- seguido de al menos dos digitos.

        // Aumenta el contador para el siguiente equipo.
        contador++; // Suma uno para que el siguiente equipo tenga otro codigo.

        // Inicializa la lista de integrantes.
        listaSuperheroes = new ArrayList<>(); // Crea una lista vacia donde se guardaran los superheroes.
    } // Termina el constructor vacio.

    // Constructor completo.
    // Recibe los datos necesarios para crear un equipo.
    public EquipoRescate(String nombreEquipo, // Recibe el nombre del equipo.
            String tipoEmergencia, // Recibe el tipo de emergencia.
            ArrayList<Superheroe> listaSuperheroes, // Recibe la lista de superheroes seleccionados.
            String nivelAmenaza, // Recibe el nivel de amenaza.
            String ciudadAsignada, // Recibe la ciudad asignada.
            boolean usoTecnologiaEspecial) { // Recibe si se usa tecnologia especial y abre el constructor.

        // Llama al constructor vacio para generar el ID.
        this(); // Ejecuta el constructor vacio para generar el codigo y preparar la lista.

        // Asigna los valores a los atributos correspondientes.
        this.nombreEquipo = nombreEquipo; // Guarda el nombre recibido dentro del objeto.
        this.tipoEmergencia = tipoEmergencia; // Guarda el tipo de emergencia recibido.
        this.listaSuperheroes = new ArrayList<>(listaSuperheroes); // Copia los integrantes a una nueva lista del equipo.
        this.nivelAmenaza = nivelAmenaza; // Guarda el nivel de amenaza recibido.
        this.ciudadAsignada = ciudadAsignada; // Guarda la ciudad recibida.
        this.usoTecnologiaEspecial = usoTecnologiaEspecial; // Guarda si el equipo utiliza tecnologia especial.
    } // Termina el constructor completo.

    // METODOS GETTERS.
    // Permiten consultar los datos del equipo.

    public String getIdEquipo() { // Metodo para consultar el codigo del equipo.
        return idEquipo; // Devuelve el codigo guardado.
    } // Termina este getter.

    public String getNombreEquipo() { // Metodo para consultar el nombre del equipo.
        return nombreEquipo; // Devuelve el nombre guardado.
    } // Termina este getter.

    public String getTipoEmergencia() { // Metodo para consultar el tipo de emergencia.
        return tipoEmergencia; // Devuelve el tipo de emergencia guardado.
    } // Termina este getter.

    public ArrayList<Superheroe> getListaSuperheroes() { // Metodo para consultar la lista de integrantes.
        return listaSuperheroes; // Devuelve la lista de superheroes del equipo.
    } // Termina este getter.

    public String getNivelAmenaza() { // Metodo para consultar el nivel de amenaza.
        return nivelAmenaza; // Devuelve el nivel de amenaza guardado.
    } // Termina este getter.

    public String getCiudadAsignada() { // Metodo para consultar la ciudad asignada.
        return ciudadAsignada; // Devuelve el nombre de la ciudad guardada.
    } // Termina este getter.

    public boolean isUsoTecnologiaEspecial() { // Metodo para consultar si utiliza tecnologia especial.
        return usoTecnologiaEspecial; // Devuelve true o false segun lo guardado.
    } // Termina este getter.

    // METODOS SETTERS.
    // Permiten actualizar los datos del equipo.

    public void setNombreEquipo(String nombreEquipo) { // Recibe el nuevo nombre del equipo.
        this.nombreEquipo = nombreEquipo; // Actualiza el nombre almacenado.
    } // Termina este setter.

    public void setTipoEmergencia(String tipoEmergencia) { // Recibe el nuevo tipo de emergencia.
        this.tipoEmergencia = tipoEmergencia; // Actualiza el tipo de emergencia almacenado.
    } // Termina este setter.

    public void setListaSuperheroes(ArrayList<Superheroe> listaSuperheroes) { // Recibe la nueva lista de integrantes.
        this.listaSuperheroes = new ArrayList<>(listaSuperheroes); // Guarda una copia de esa lista en el equipo.
    } // Termina este setter.

    public void setNivelAmenaza(String nivelAmenaza) { // Recibe el nuevo nivel de amenaza.
        this.nivelAmenaza = nivelAmenaza; // Actualiza el nivel de amenaza almacenado.
    } // Termina este setter.

    public void setCiudadAsignada(String ciudadAsignada) { // Recibe el nombre de la nueva ciudad.
        this.ciudadAsignada = ciudadAsignada; // Actualiza la ciudad asignada al equipo.
    } // Termina este setter.

    public void setUsoTecnologiaEspecial(boolean usoTecnologiaEspecial) { // Recibe true o false para la tecnologia especial.
        this.usoTecnologiaEspecial = usoTecnologiaEspecial; // Actualiza si el equipo utiliza tecnologia especial.
    } // Termina este setter.

    // METODO PARA CALCULAR EL COSTO DEL RESCATE.
    // Suma los salarios y los recargos correspondientes.
    public double CalcularCostoRescate() { // Calcula y devuelve el costo operativo del equipo.

        // Variable para acumular el costo total.
        double costoTotal = 0; // Comienza el calculo con un costo de cero.

        // Recorre cada superheroe registrado en el equipo.
        for (Superheroe heroe : listaSuperheroes) { // Revisa uno por uno los integrantes del equipo.

            // Suma el salario mensual de cada integrante.
            costoTotal += heroe.getSalarioMensual(); // Agrega el salario de este heroe al costo acumulado.
        } // Termina el recorrido de los superheroes.

        // Agrega el recargo dependiendo del nivel de amenaza.
        if ("Baja".equalsIgnoreCase(nivelAmenaza)) { // Comprueba si la amenaza es Baja, sin distinguir mayusculas.

            // Amenaza baja: agrega 5000.
            costoTotal += 5000; // Suma 5000 al costo por una amenaza baja.

        } else if ("Media".equalsIgnoreCase(nivelAmenaza)) { // Si no era Baja, comprueba si es Media.

            // Amenaza media: agrega 15000.
            costoTotal += 15000; // Suma 15000 al costo por una amenaza media.

        } else if ("Alta".equalsIgnoreCase(nivelAmenaza)) { // Si no era Baja ni Media, comprueba si es Alta.

            // Amenaza alta: agrega 30000.
            costoTotal += 30000; // Suma 30000 al costo por una amenaza alta.
        } // Termina la comprobacion del nivel de amenaza.

        // Comprueba si se utiliza tecnologia especial.
        if (usoTecnologiaEspecial) { // Entra aqui solamente cuando el valor es true.

            // Agrega 10000 por tecnologia especial.
            costoTotal += 10000; // Suma el recargo por utilizar tecnologia especial.
        } // Termina la comprobacion de tecnologia especial.

        // Comprueba si hay mas de cinco superheroes.
        if (listaSuperheroes.size() > 5) { // Cuenta los integrantes y comprueba si son seis o mas.

            // Agrega el bono logistico de 8000.
            costoTotal += 8000; // Suma el bono logistico por tener mas de cinco superheroes.
        } // Termina la comprobacion de cantidad de integrantes.

        // Devuelve el costo operativo calculado.
        return costoTotal; // Entrega la suma final de salarios y recargos.
    } // Termina el metodo de calculo del costo.

    // Metodo que devuelve los datos del equipo.
    // Se utilizara posteriormente en los reportes.
    @Override // Indica que reemplazamos el metodo toString() heredado de Object.
    public String toString() { // Prepara un texto con la informacion del equipo.

        return "ID: " + idEquipo // Comienza el texto mostrando el codigo del equipo.
                + "\nNombre del equipo: " + nombreEquipo // Agrega otra linea con el nombre del equipo.
                + "\nTipo de emergencia: " + tipoEmergencia // Agrega otra linea con el tipo de emergencia.
                + "\nNivel de amenaza: " + nivelAmenaza // Agrega otra linea con el nivel de amenaza.
                + "\nCiudad asignada: " + ciudadAsignada // Agrega otra linea con la ciudad asignada.
                + "\nTecnologia especial: " // Agrega el titulo del dato de tecnologia especial.
                + (usoTecnologiaEspecial ? "Si" : "No") // Escribe Si si es true y No si es false.
                + "\nCantidad de superheroes: " // Agrega el titulo de la cantidad de integrantes.
                + listaSuperheroes.size() // Agrega el numero de superheroes que hay en la lista.
                + "\nCosto operativo: $" // Agrega el titulo del costo operativo y el simbolo de dinero.
                + CalcularCostoRescate(); // Calcula el costo y lo agrega al texto que se devuelve.
    } // Termina el metodo toString().
} // Termina la clase EquipoRescate.
