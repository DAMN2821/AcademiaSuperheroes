*
 * Universidad Estatal a Distancia (UNED)
 * Curso: Programacion Intermedia
 * Codigo: 00824
 * Proyecto 1 - III Cuatrimestre 2026
 *
 * Estudiante: [Jose Daniel Monge Jimenez]
 * Grupo: 01
 */


package academiasuperheroes; // Indica el paquete al que pertenece esta clase.

// Importamos ArrayList para almacenar los objetos.
import java.util.ArrayList; // Permite trabajar con listas que pueden crecer o disminuir.

// Importamos Scanner para recibir datos del usuario.
import java.util.Scanner; // Permite leer datos escritos en la consola.

// Clase principal del sistema de la Academia de Superheroes.
public class AcademiaSuperheroes { // Declara la clase principal del sistema de superhéroes.

    // Scanner para leer la informacion desde la consola.
    static Scanner entrada = new Scanner(System.in); // Crea el lector que recibe lo escrito por el usuario.

    // Lista general de superheroes registrados.
    static ArrayList<Superheroe> superheroes = new ArrayList<>(); // Crea la lista donde se guardan los superhéroes.

    // Lista general de equipos de rescate.
    static ArrayList<EquipoRescate> equipos = new ArrayList<>(); // Crea la lista donde se guardan los equipos de rescate.

    // Metodo principal que inicia el programa.
    public static void main(String[] args) { // Es el punto de entrada cuando inicia el programa.

        // Llama al menu principal del sistema.
        menuPrincipal(); // Abre el menú principal del sistema.
    } // Termina el método main.

    // METODO DEL MENU PRINCIPAL.
    public static void menuPrincipal() { // Declara el método encargado del menú principal.

        // Variable que almacena la opcion seleccionada.
        int opcion; // Reserva una variable para guardar la opción elegida.

        // Repite el menu hasta seleccionar Salir.
        do { // Inicia un ciclo que mostrará el menú repetidamente.

            System.out.println("\n===== ACADEMIA DE SUPERHEROES ====="); // Muestra el título principal y deja una línea en blanco.
            System.out.println("1. Gestion de Superheroes"); // Muestra la opción para gestionar superhéroes.
            System.out.println("2. Gestion de Equipos de Rescate"); // Muestra la opción para gestionar equipos.
            System.out.println("3. Modulo de Reportes"); // Muestra la opción para entrar a reportes.
            System.out.println("4. Salir"); // Muestra la opción para salir del programa.

            // Solicita una opcion numerica valida.
            opcion = leerOpcion(1, 4); // Lee una opción válida entre 1 y 4.

            // Ejecuta la opcion seleccionada.
            switch (opcion) { // Elige qué hacer según el número ingresado.

                case 1: // Indica qué sucede si eligen la opción 1.
                    menuSuperheroes(); // Abre el menú de superhéroes.
                    break; // Termina este caso del switch.

                case 2: // Indica qué sucede si eligen la opción 2.
                    menuEquipos(); // Abre el menú de equipos.
                    break; // Termina este caso del switch.

                case 3: // Indica qué sucede si eligen la opción 3.
                    menuReportes(); // Abre el menú de reportes.
                    break; // Termina este caso del switch.

                case 4: // Indica qué sucede si eligen salir.
                    System.out.println("Saliendo del sistema..."); // Informa que el programa está terminando.
                    break; // Termina el último caso del switch.
            } // Cierra la selección de opciones.

        } while (opcion != 4); // Repite el menú mientras la opción sea distinta de 4.
    } // Termina el método del menú principal.

    // METODO DEL SUBMENU DE SUPERHEROES.
    public static void menuSuperheroes() { // Declara el submenú para administrar superhéroes.

        int opcion; // Guarda la opción del submenú.

        // Mantiene el submenu activo hasta regresar.
        do { // Inicia el ciclo para repetir este submenú.

            System.out.println("\n===== GESTION DE SUPERHEROES ====="); // Muestra el título de gestión de superhéroes.
            System.out.println("1. Agregar superheroe"); // Muestra la opción de registrar un héroe.
            System.out.println("2. Actualizar datos de un superheroe"); // Muestra la opción de cambiar sus datos.
            System.out.println("3. Cambiar estado de un superheroe"); // Muestra la opción para cambiar su estado.
            System.out.println("4. Eliminar un superheroe"); // Muestra la opción para eliminarlo.
            System.out.println("5. Regresar al menu principal"); // Muestra la opción para volver al menú principal.

            opcion = leerOpcion(1, 5); // Lee una opción válida entre 1 y 5.

            switch (opcion) { // Decide la operación según la opción elegida.

                case 1: // Selecciona el registro de superhéroes.
                    agregarSuperheroe(); // Llama al método que registra un héroe.
                    break; // Sale de este caso.

                case 2: // Selecciona la actualización de superhéroes.
                    actualizarSuperheroe(); // Llama al método para actualizar sus datos.
                    break; // Sale de este caso.

                case 3: // Selecciona el cambio de estado.
                    cambiarEstadoSuperheroe(); // Llama al método que modifica el estado.
                    break; // Sale de este caso.

                case 4: // Selecciona la eliminación de superhéroes.
                    eliminarSuperheroe(); // Llama al método que elimina un héroe.
                    break; // Sale de este caso.

                case 5: // Selecciona el regreso al menú principal.
                    System.out.println("Regresando al menu principal..."); // Muestra el mensaje de regreso.
                    break; // Sale de este caso.
            } // Termina la selección de opciones.

        } while (opcion != 5); // Repite el submenú mientras no elijan 5.
    } // Termina el método del submenú.

    // METODO PARA VALIDAR LAS OPCIONES NUMERICAS.
    public static int leerOpcion(int minimo, int maximo) { // Define un método que devuelve una opción entera válida.

        // Repite la solicitud hasta obtener un valor valido.
        while (true) { // Repite la lectura hasta obtener un número permitido.

            System.out.print("Seleccione una opcion: "); // Pide al usuario que escriba una opción.

            try { // Inicia el control de errores de conversión.

                // Convierte el texto ingresado a numero entero.
                int opcion = Integer.parseInt(entrada.nextLine().trim()); // Lee el texto, quita espacios y lo convierte a entero.

                // Verifica que la opcion este dentro del rango.
                if (opcion >= minimo && opcion <= maximo) { // Comprueba que la opción esté dentro del rango permitido.
                    return opcion; // Devuelve la opción y termina el método.
                } // Cierra la condición del rango.

                // Informa cuando la opcion esta fuera del rango.
                System.out.println("Error: seleccione una opcion valida."); // Avisa cuando el número no pertenece al menú.

            } catch (NumberFormatException e) { // Captura el error si no escribieron un número entero.

                // Controla letras y otros formatos incorrectos.
                System.out.println("Error: debe ingresar un numero entero."); // Explica que deben escribir un número entero.
            } // Cierra el manejo del error.
        } // Cierra este intento y, si hace falta, lo repite.
    } // Termina el método leerOpcion.

    // METODO PARA LEER TEXTOS CON MINIMO TRES CARACTERES.
    public static String leerTexto(String mensaje) { // Define un método para leer un texto válido.

        while (true) { // Repite la petición hasta recibir un texto correcto.

            System.out.print(mensaje); // Muestra el mensaje de lo que se debe escribir.

            // Elimina espacios innecesarios al inicio y al final.
            String texto = entrada.nextLine().trim(); // Lee el texto y elimina espacios al principio y al final.

            // Comprueba la longitud minima.
            if (texto.length() >= 3) { // Comprueba que el texto tenga tres caracteres como mínimo.
                return texto; // Devuelve el texto cuando es válido.
            } // Cierra la comprobación de longitud.

            System.out.println("Error: ingrese al menos 3 caracteres."); // Avisa que el texto ingresado es muy corto.
        } // Termina una vuelta del ciclo y permite otro intento.
    } // Termina el método leerTexto.

    // METODO PARA LEER EL SALARIO MENSUAL.
    public static double leerSalario() { // Define el método que devuelve un salario decimal.

        while (true) { // Repite la lectura hasta recibir un salario correcto.

            System.out.print("Salario mensual: "); // Pide que se escriba el salario mensual.

            try { // Inicia un bloque para controlar errores numéricos.

                // Convierte el texto ingresado a numero decimal.
                double salario = Double.parseDouble( // Empieza a convertir el dato recibido a número decimal.
                        entrada.nextLine().trim()); // Lee el salario como texto, lo limpia y termina la conversión.

                // Comprueba que el salario sea valido.
                if (Double.isFinite(salario) && salario >= 0) { // Acepta solo un número finito y no negativo.
                    return salario; // Devuelve el salario que pasó la validación.
                } // Cierra la condición de salario válido.

                System.out.println("Error: ingrese un salario valido."); // Avisa si el salario numérico no es aceptable.

            } catch (NumberFormatException e) { // Captura el error de escribir un dato no numérico.

                // Controla datos que no pueden convertirse a numero.
                System.out.println("Error: debe ingresar un numero."); // Pide que se ingrese un número como salario.
            } // Termina el bloque que maneja errores.
        } // Permite volver a pedir el salario.
    } // Termina el método leerSalario.

    // METODO PARA SELECCIONAR UNA OPCION DE TEXTO.
    public static String seleccionarDato(String titulo, String[] opciones) { // Define un método para elegir un texto entre varias opciones.

        System.out.println("\n" + titulo); // Muestra el título del conjunto de opciones.

        // Recorre las opciones disponibles.
        for (int i = 0; i < opciones.length; i++) { // Recorre las opciones desde la primera hasta la última.

            System.out.println((i + 1) + ". " + opciones[i]); // Imprime el número y nombre de cada opción.
        } // Termina de recorrer las opciones.

        // Solicita una opcion numerica correcta.
        int opcion = leerOpcion(1, opciones.length); // Pide un número entre 1 y la cantidad de opciones.

        // Devuelve el texto correspondiente.
        return opciones[opcion - 1]; // Devuelve el texto elegido; resta 1 porque el arreglo inicia en 0.
    } // Termina el método seleccionarDato.

    // METODO PARA SELECCIONAR EL PODER.
    public static String seleccionarPoder() { // Declara el método para seleccionar un poder.

        String[] poderes = { // Crea el arreglo de poderes que pueden elegirse.
            "Fuerza", "Velocidad", "Tecnologia", // Incluye Fuerza, Velocidad y Tecnología.
            "Magia", "Telepatia" // Incluye Magia y Telepatía.
        }; // Termina la declaración del arreglo de poderes.

        return seleccionarDato("Seleccione el poder:", poderes); // Muestra esos poderes y devuelve el que se elija.
    } // Termina el método seleccionarPoder.

    // METODO PARA SELECCIONAR LA EXPERIENCIA.
    public static String seleccionarExperiencia() { // Declara el método para seleccionar la experiencia.

        String[] experiencias = { // Crea el arreglo con los niveles permitidos.
            "Novato", "Intermedio", "Elite" // Incluye los niveles Novato, Intermedio y Elite.
        }; // Termina el arreglo de experiencias.

        return seleccionarDato("Seleccione la experiencia:", experiencias); // Muestra las experiencias y devuelve la seleccionada.
    } // Termina el método seleccionarExperiencia.

    // METODO PARA SELECCIONAR EL ESTADO.
    public static String seleccionarEstado() { // Declara el método para seleccionar un estado.

        String[] estados = { // Crea el arreglo de estados permitidos.
            "Disponible", "En mision", "Recuperacion" // Incluye Disponible, En misión y Recuperación.
        }; // Termina el arreglo de estados.

        return seleccionarDato("Seleccione el estado:", estados); // Muestra los estados y devuelve el elegido.
    } // Termina el método seleccionarEstado.

    // METODO PARA SOLICITAR TODOS LOS DATOS DEL SUPERHEROE.
    public static void solicitarDatosSuperheroe(Superheroe heroe) { // Declara el método que recibe y llena un objeto Superheroe.

        // Solicita el nombre heroico.
        heroe.setNombreHeroico( // Indica que se asignará el nombre heroico al objeto.
                leerTexto("Nombre heroico: ")); // Pide y valida el nombre heroico antes de guardarlo.

        // Solicita el nombre real.
        heroe.setNombreReal( // Indica que se asignará el nombre real.
                leerTexto("Nombre real: ")); // Pide y valida el nombre real antes de guardarlo.

        // Solicita el poder permitido.
        heroe.setPoder(seleccionarPoder()); // Selecciona el poder y lo asigna al héroe.

        // Solicita el nivel de experiencia.
        heroe.setExperiencia(seleccionarExperiencia()); // Selecciona la experiencia y la guarda en el héroe.

        // Solicita el estado del superheroe.
        heroe.setEstado(seleccionarEstado()); // Selecciona y guarda el estado del héroe.

        // Solicita y valida el salario mensual.
        heroe.setSalarioMensual(leerSalario()); // Pide un salario válido y lo guarda en el héroe.
    } // Termina el método de captura de datos.

    // METODO PARA AGREGAR UN SUPERHEROE.
    public static void agregarSuperheroe() { // Declara el método para registrar un superhéroe.

        System.out.println("\n===== AGREGAR SUPERHEROE ====="); // Muestra el título del formulario de registro.

        // Crea un nuevo objeto con su identificador automatico.
        Superheroe heroe = new Superheroe(); // Crea el objeto Superheroe y genera su ID desde la clase.

        // Solicita todos los datos necesarios.
        solicitarDatosSuperheroe(heroe); // Solicita todos los datos del nuevo héroe.

        // Almacena el objeto en el ArrayList general.
        superheroes.add(heroe); // Agrega el objeto a la lista general de héroes.

        // Confirma el registro.
        System.out.println("\nSuperheroe registrado correctamente."); // Confirma que el registro se completó.
        System.out.println("ID generado: " + heroe.getIdHeroe()); // Muestra el ID automático del héroe registrado.
    } // Termina el método agregarSuperheroe.

    // METODO PARA BUSCAR UN SUPERHEROE POR IDENTIFICADOR.
    public static Superheroe buscarSuperheroe(String id) { // Declara una búsqueda que recibe un ID y devuelve un héroe.

        // Recorre todos los superheroes registrados.
        for (Superheroe heroe : superheroes) { // Revisa uno por uno los héroes registrados.

            // Compara el identificador solicitado.
            if (heroe.getIdHeroe().equalsIgnoreCase(id.trim())) { // Compara el ID sin distinguir mayúsculas y elimina espacios.

                // Devuelve el superheroe encontrado.
                return heroe; // Devuelve el objeto cuando encuentra el ID solicitado.
            } // Cierra la comparación de identificadores.
        } // Termina de recorrer los héroes.

        // Devuelve null cuando no existe.
        return null; // Devuelve null si ningún héroe tiene ese ID.
    } // Termina el método buscarSuperheroe.

    // METODO PARA ACTUALIZAR UN SUPERHEROE.
    public static void actualizarSuperheroe() { // Declara el método para modificar un héroe existente.

        System.out.println("\n===== ACTUALIZAR SUPERHEROE ====="); // Muestra el título de actualización.

        // Solicita el identificador.
        System.out.print("Ingrese el ID del superheroe: "); // Pide el identificador del héroe que se modificará.
        String id = entrada.nextLine().trim(); // Lee el ID escrito y quita los espacios externos.

        // Busca el objeto correspondiente.
        Superheroe heroe = buscarSuperheroe(id); // Busca el héroe mediante el ID recibido.

        // Comprueba si existe.
        if (heroe == null) { // Comprueba si la búsqueda no encontró ningún héroe.

            System.out.println("Error: superheroe no encontrado."); // Avisa que el identificador no existe.
            return; // Sale sin hacer cambios si no hay coincidencia.
        } // Cierra la comprobación del resultado.

        // Muestra los datos actuales.
        System.out.println("\nDatos actuales:"); // Anuncia que mostrará la información actual.
        System.out.println(heroe); // Imprime los datos actuales del objeto.

        // Solicita nuevamente los datos.
        // Conserva el identificador original.
        System.out.println("\nIngrese los nuevos datos:"); // Pide que se ingresen los nuevos valores.
        solicitarDatosSuperheroe(heroe); // Vuelve a pedir datos y modifica el mismo objeto.

        System.out.println("Superheroe actualizado correctamente."); // Confirma la actualización.
    } // Termina el método actualizarSuperheroe.

    // METODO PARA CAMBIAR EL ESTADO DE UN SUPERHEROE.
    public static void cambiarEstadoSuperheroe() { // Declara el método para cambiar solo el estado.

        System.out.println("\n===== CAMBIAR ESTADO ====="); // Muestra el título del cambio de estado.

        System.out.print("Ingrese el ID del superheroe: "); // Pide el ID del héroe.
        String id = entrada.nextLine().trim(); // Lee el ID y elimina espacios externos.

        // Busca el superheroe registrado.
        Superheroe heroe = buscarSuperheroe(id); // Busca el héroe solicitado.

        if (heroe == null) { // Comprueba si no fue encontrado.

            System.out.println("Error: superheroe no encontrado."); // Muestra un error si el héroe no existe.
            return; // Sale del método sin modificar nada.
        } // Cierra la comprobación de existencia.

        // Muestra el estado antes de modificarlo.
        System.out.println("Estado actual: " + heroe.getEstado()); // Consulta y muestra el estado actual.

        // Solicita y asigna el nuevo estado.
        heroe.setEstado(seleccionarEstado()); // Pide el nuevo estado y lo guarda en el héroe.

        System.out.println("Estado actualizado correctamente."); // Confirma el cambio de estado.
    } // Termina el método de cambio de estado.

    // METODO PARA ELIMINAR UN SUPERHEROE.
    public static void eliminarSuperheroe() { // Declara el método para eliminar un superhéroe.

        System.out.println("\n===== ELIMINAR SUPERHEROE ====="); // Muestra el título de eliminación.

        System.out.print("Ingrese el ID del superheroe: "); // Pide el ID del héroe que se eliminará.
        String id = entrada.nextLine().trim(); // Lee el ID y quita los espacios.

        // Busca el superheroe.
        Superheroe heroe = buscarSuperheroe(id); // Busca el objeto que corresponde al ID.

        if (heroe == null) { // Comprueba si la búsqueda no encontró un héroe.

            System.out.println("Error: superheroe no encontrado."); // Informa que el héroe no existe.
            return; // Abandona la eliminación.
        } // Cierra la comprobación.

        // Muestra el superheroe que se eliminara.
        System.out.println("\n" + heroe); // Muestra los datos del héroe antes de borrarlo.

        // Solicita confirmacion antes de eliminar.
        while (true) { // Repite la pregunta hasta recibir S o N.

            System.out.print("\nDesea eliminarlo? (S/N): "); // Pide confirmar la eliminación.
            String respuesta = entrada.nextLine().trim(); // Lee la respuesta y quita espacios exteriores.

            if (respuesta.equalsIgnoreCase("S")) { // Comprueba si respondieron S (sí).

        // Recorre los equipos existentes.
       for (EquipoRescate equipo : equipos) { // Revisa todos los equipos registrados.

           // Retira al superheroe si pertenece al equipo.
           equipo.getListaSuperheroes().remove(heroe); // Quita a este héroe de la lista de ese equipo, si está.

           // El costo se calculara con los integrantes actuales
           // cuando se llame a CalcularCostoRescate().
       } // Cierra el recorrido de los equipos.

       // Elimina el superheroe de la lista general.
       superheroes.remove(heroe); // Elimina el objeto de la lista general de héroes.

       // Confirma la eliminacion.
       System.out.println("Superheroe eliminado correctamente."); // Informa que la eliminación se realizó.
       return; // Sale del método después de eliminar.
                
            } // Cierra el caso en que respondieron S.

            if (respuesta.equalsIgnoreCase("N")) { // Comprueba si respondieron N (no).

                System.out.println("Eliminacion cancelada."); // Informa que se canceló la eliminación.
                return; // Sale del método sin eliminar al héroe.
            } // Cierra el caso de cancelación.

            System.out.println("Error: responda S o N."); // Avisa que solo se acepta S o N.
        } // Repite la pregunta si la respuesta no es válida.
    } // Termina el método eliminarSuperheroe.




    // ===============================================
    // MODULO DE GESTION DE EQUIPOS DE RESCATE
    // ===============================================

    // Metodo que presenta el submenu de equipos.
    public static void menuEquipos() { // Declara el submenú para gestionar equipos.

        // Variable para almacenar la opcion elegida.
        int opcion; // Guarda la opción que se elija.

        // Repite el submenu hasta seleccionar regresar.
        do { // Repite las opciones hasta regresar al menú principal.

            System.out.println("\n===== GESTION DE EQUIPOS DE RESCATE ====="); // Muestra el título de gestión de equipos.
            System.out.println("1. Agregar equipo"); // Presenta la opción de crear un equipo.
            System.out.println("2. Actualizar equipo"); // Presenta la opción de actualizar un equipo.
            System.out.println("3. Eliminar equipo"); // Presenta la opción de eliminar un equipo.
            System.out.println("4. Regresar al menu principal"); // Presenta la opción para volver al menú principal.

            // Solicita una opcion numerica entre 1 y 4.
            opcion = leerOpcion(1, 4); // Lee una opción permitida entre 1 y 4.

            // Ejecuta la operacion seleccionada.
            switch (opcion) { // Decide qué operación ejecutar.

                case 1: // Indica la opción para agregar un equipo.
                    agregarEquipo(); // Ejecuta el registro de equipos.
                    break; // Termina este caso.

                case 2: // Indica la opción para actualizar un equipo.
                    actualizarEquipo(); // Ejecuta la actualización.
                    break; // Termina este caso.

                case 3: // Indica la opción para eliminar un equipo.
                    eliminarEquipo(); // Ejecuta la eliminación.
                    break; // Termina este caso.

                case 4: // Indica la opción de regresar.
                    System.out.println("Regresando al menu principal..."); // Muestra el mensaje de regreso.
                    break; // Termina este caso.
            } // Cierra la selección del submenú.

        } while (opcion != 4); // Repite el submenú mientras la opción no sea 4.
    } // Termina el método menuEquipos.

    // Metodo para seleccionar el tipo de emergencia.
    public static String seleccionarEmergencia() { // Declara el método para seleccionar un tipo de emergencia.

        // Tipos permitidos por el enunciado.
        String[] emergencias = { // Crea el arreglo de emergencias permitidas.
            "Desastres naturales", // Incluye Desastres naturales.
            "Invasion alienigena", // Incluye Invasión alienígena.
            "Amenaza nuclear", // Incluye Amenaza nuclear.
            "Villano de alto riesgo" // Incluye Villano de alto riesgo.
        }; // Termina el arreglo de emergencias.

        // Muestra las opciones y devuelve la seleccionada.
        return seleccionarDato( // Inicia la llamada que mostrará el menú de emergencias.
                "Seleccione el tipo de emergencia:", emergencias); // Envía el título y las opciones, y devuelve la elección.
    } // Termina el método seleccionarEmergencia.

    // Metodo para seleccionar el nivel de amenaza.
    public static String seleccionarAmenaza() { // Declara el método para seleccionar un nivel de amenaza.

        // Niveles de amenaza permitidos.
        String[] amenazas = { // Crea el arreglo de niveles de amenaza.
            "Baja", "Media", "Alta" // Incluye Baja, Media y Alta.
        }; // Termina el arreglo de niveles.

        // Devuelve el nivel de amenaza seleccionado.
        return seleccionarDato( // Inicia la llamada al selector de opciones.
                "Seleccione el nivel de amenaza:", amenazas); // Entrega el título y los niveles; devuelve uno.
    } // Termina el método seleccionarAmenaza.

    // Metodo para indicar si utiliza tecnologia especial.
    public static boolean seleccionarTecnologia() { // Declara un método que devolverá true o false.

        // Opciones disponibles.
        String[] opciones = {"Si", "No"}; // Define las respuestas posibles: Si o No.

        // Solicita una de las opciones.
        String respuesta = seleccionarDato( // Solicita escoger si se usará tecnología especial.
                "¿Utiliza tecnologia especial?", opciones); // Muestra las opciones y guarda la respuesta.

        // Devuelve true cuando selecciona Si.
        // Devuelve false cuando selecciona No.
        return respuesta.equals("Si"); // Devuelve true si la respuesta es Si; si no, false.
    } // Termina el método seleccionarTecnologia.

    // Metodo para seleccionar los superheroes del equipo.
    public static ArrayList<Superheroe> seleccionarIntegrantes() { // Declara un método que devuelve una lista de superhéroes.

        // Lista temporal que almacenara los integrantes.
        ArrayList<Superheroe> integrantes = new ArrayList<>(); // Crea la lista temporal de integrantes del equipo.

        // Repite la solicitud hasta recibir IDs validos.
        while (true) { // Repite la selección hasta que todos los IDs sean válidos.

            // Limpia la lista temporal para un nuevo intento.
            integrantes.clear(); // Vacía la selección anterior antes de intentar de nuevo.

            // Muestra los superheroes registrados.
            System.out.println("\n===== SUPERHEROES DISPONIBLES PARA SELECCION ====="); // Muestra el encabezado de la lista de héroes.

            for (Superheroe heroe : superheroes) { // Recorre todos los héroes registrados.

                System.out.println( // Inicia la impresión de cada héroe.
                        heroe.getIdHeroe() + " - " // Obtiene el ID y agrega un guion separador.
                        + heroe.getNombreHeroico()); // Agrega el nombre heroico y termina la impresión.
            } // Cierra el recorrido de héroes.

            // Solicita los identificadores de los integrantes.
            System.out.println("\nIngrese los IDs separados por comas."); // Explica que se pueden escribir varios IDs.
            System.out.print("IDs de superheroes: "); // Pide los identificadores de los integrantes.

            // Lee la informacion y elimina espacios externos.
            String texto = entrada.nextLine().trim(); // Lee los IDs escritos por el usuario.

            // Comprueba que no se encuentre vacio.
            if (texto.isEmpty()) { // Comprueba si no escribió ningún ID.

                System.out.println("Error: debe seleccionar integrantes."); // Avisa que debe seleccionar integrantes.
                continue; // Vuelve al inicio del ciclo para pedir los IDs.
            } // Cierra la comprobación de texto vacío.

            // Divide el texto utilizando las comas.
            String[] ids = texto.split(",", -1); // Separa los IDs por comas, incluso si hay partes vacías.

            // Variable para comprobar si todos los IDs son validos.
            boolean valido = true; // Supone inicialmente que los IDs son válidos.

            // Recorre todos los identificadores ingresados.
            for (String id : ids) { // Revisa cada ID ingresado por separado.

                // Busca el superheroe en la lista general.
                Superheroe heroe = buscarSuperheroe(id.trim()); // Busca el objeto correspondiente al ID actual.

                // Comprueba que el superheroe exista.
                if (heroe == null) { // Comprueba si ese ID no existe.

                    System.out.println( // Empieza a mostrar el ID que no se encontró.
                            "Error: el ID " + id.trim() + " no existe."); // Completa el mensaje con el ID inválido.

                    valido = false; // Marca la selección como inválida.
                    break; // Interrumpe la revisión de IDs.
                } // Cierra la comprobación de ID inexistente.

                // Evita repetir el mismo superheroe en el equipo.
                if (integrantes.contains(heroe)) { // Comprueba si el mismo héroe ya fue elegido.

                    System.out.println( // Empieza el aviso de héroe repetido.
                            "Error: el superheroe " // Añade el texto inicial del mensaje.
                            + heroe.getIdHeroe() // Añade el ID que está repetido.
                            + " esta repetido."); // Completa el mensaje de duplicado.

                    valido = false; // Marca la selección como incorrecta.
                    break; // Sale del recorrido de IDs.
                } // Cierra la comprobación de duplicados.

                // Agrega el objeto encontrado a la lista.
                integrantes.add(heroe); // Agrega el héroe encontrado a los integrantes.
            } // Termina el recorrido de los IDs ingresados.

            // Si todos los datos son correctos, devuelve la lista.
            if (valido) { // Comprueba si todos los IDs se aceptaron.

                System.out.println( // Comienza el mensaje de integrantes seleccionados.
                        "Integrantes seleccionados: " // Escribe la etiqueta de cantidad.
                        + integrantes.size()); // Agrega el número de integrantes elegidos.

                return integrantes; // Devuelve la lista de integrantes del equipo.
            } // Cierra la comprobación de selección válida.

            // Si hay errores, solicita nuevamente los IDs.
            System.out.println("Ingrese nuevamente los integrantes."); // Pide intentar nuevamente si hubo errores.
        } // Cierra una vuelta del ciclo de selección.
    } // Termina el método seleccionarIntegrantes.

    // Metodo para solicitar todos los datos de un equipo.
    public static void solicitarDatosEquipo(EquipoRescate equipo) { // Declara el método que recibe un equipo y llena sus datos.

        // Solicita y valida el nombre del equipo.
        equipo.setNombreEquipo( // Indica que se guardará el nombre del equipo.
                leerTexto("Nombre del equipo: ")); // Pide un nombre válido y lo asigna.

        // Solicita el tipo de emergencia.
        equipo.setTipoEmergencia(seleccionarEmergencia()); // Elige y guarda el tipo de emergencia.

        // Solicita el nivel de amenaza.
        equipo.setNivelAmenaza(seleccionarAmenaza()); // Elige y guarda el nivel de amenaza.

        // Solicita y valida la ciudad asignada.
        equipo.setCiudadAsignada( // Indica que se guardará la ciudad asignada.
                leerTexto("Ciudad asignada: ")); // Pide una ciudad válida y la asigna.

        // Solicita si utilizara tecnologia especial.
        equipo.setUsoTecnologiaEspecial(seleccionarTecnologia()); // Consulta si se usará tecnología y guarda true o false.

        // Solicita los integrantes del equipo.
        equipo.setListaSuperheroes(seleccionarIntegrantes()); // Selecciona los integrantes y guarda su lista.
    } // Termina el método solicitarDatosEquipo.

    // Metodo para agregar un equipo de rescate.
    public static void agregarEquipo() { // Declara el método para registrar equipos de rescate.

        System.out.println("\n===== AGREGAR EQUIPO DE RESCATE ====="); // Muestra el título de registro de equipos.

        // Comprueba que existan superheroes registrados.
        if (superheroes.isEmpty()) { // Comprueba si aún no hay superhéroes.

            System.out.println( // Comienza un aviso de lista vacía.
                    "No existen superheroes registrados."); // Explica que todavía no hay héroes.

            System.out.println( // Comienza un segundo mensaje de advertencia.
                    "Primero debe registrar superheroes."); // Indica que primero deben registrar héroes.
            return; // Sale del método sin crear el equipo.
        } // Cierra la comprobación de lista vacía.

        // Crea un objeto con su identificador automatico.
        EquipoRescate equipo = new EquipoRescate(); // Crea un equipo y genera su ID mediante su constructor.

        // Muestra el ID generado.
        System.out.println("ID generado: " + equipo.getIdEquipo()); // Muestra el identificador del equipo nuevo.

        // Solicita toda la informacion del equipo.
        solicitarDatosEquipo(equipo); // Solicita todos los datos del equipo.

        // Calcula el costo operativo segun las reglas.
        double costo = equipo.CalcularCostoRescate(); // Calcula el costo del rescate y lo guarda en una variable.

        // Guarda el equipo en el ArrayList general.
        equipos.add(equipo); // Agrega el equipo a la lista general.

        // Confirma el registro.
        System.out.println("\nEquipo registrado correctamente."); // Confirma que el equipo quedó registrado.
        System.out.println("ID: " + equipo.getIdEquipo()); // Muestra el ID del nuevo equipo.
        System.out.printf("Costo operativo: $%,2f%n", costo); // Imprime el costo con un formato numérico.
    } // Termina el método agregarEquipo.

    // Metodo para buscar un equipo mediante su ID.
    public static EquipoRescate buscarEquipo(String id) { // Declara la búsqueda de equipos por ID.

        // Recorre todos los equipos registrados.
        for (EquipoRescate equipo : equipos) { // Revisa uno por uno los equipos registrados.

            // Compara el ID con el solicitado.
            if (equipo.getIdEquipo().equalsIgnoreCase(id.trim())) { // Compara el ID del equipo con el recibido.

                // Devuelve el equipo encontrado.
                return equipo; // Devuelve el equipo cuando coincide el ID.
            } // Cierra la comparación de IDs.
        } // Termina el recorrido de equipos.

        // Devuelve null cuando no encuentra el equipo.
        return null; // Devuelve null cuando no existe el ID buscado.
    } // Termina el método buscarEquipo.

    // Metodo para actualizar los datos de un equipo.
    public static void actualizarEquipo() { // Declara el método para modificar un equipo.

        System.out.println("\n===== ACTUALIZAR EQUIPO ====="); // Muestra el título de actualización de equipos.

        // Comprueba que existan equipos registrados.
        if (equipos.isEmpty()) { // Comprueba si no existen equipos.

            System.out.println("No existen equipos registrados."); // Avisa que la lista de equipos está vacía.
            return; // Sale porque no existe ningún equipo para actualizar.
        } // Cierra la comprobación de lista vacía.

        // Solicita el ID del equipo.
        System.out.print("Ingrese el ID del equipo: "); // Pide el ID del equipo que se modificará.
        String id = entrada.nextLine().trim(); // Lee el ID y quita espacios.

        // Busca el equipo correspondiente.
        EquipoRescate equipo = buscarEquipo(id); // Busca el equipo en la lista general.

        // Comprueba que exista.
        if (equipo == null) { // Comprueba si el equipo solicitado no existe.

            System.out.println("Error: equipo no encontrado."); // Muestra el error de equipo inexistente.
            return; // Sale sin modificar datos.
        } // Cierra la comprobación de la búsqueda.

        // Muestra los datos actuales del equipo.
        System.out.println("\nDatos actuales:"); // Indica que mostrará los valores actuales.
        System.out.println(equipo); // Imprime los datos actuales del equipo.

        // Comprueba que haya superheroes para seleccionar.
        if (superheroes.isEmpty()) { // Comprueba que haya héroes para seleccionar.

            System.out.println( // Comienza un mensaje de falta de héroes.
                    "No hay superheroes registrados para actualizar el equipo."); // Informa que no se puede seleccionar integrantes.
            return; // Sale del método sin actualizar.
        } // Cierra la comprobación.

        // Solicita los nuevos datos.
        // El identificador original se conserva.
        System.out.println("\nIngrese los nuevos datos:"); // Pide los nuevos datos del equipo.
        solicitarDatosEquipo(equipo); // Reemplaza los datos editables del equipo encontrado.

        // Vuelve a calcular el costo operativo.
        double costo = equipo.CalcularCostoRescate(); // Vuelve a calcular el costo del equipo modificado.

        // Confirma la actualizacion.
        System.out.println("\nEquipo actualizado correctamente."); // Confirma que se actualizó el equipo.
        System.out.printf("Nuevo costo operativo: $%,.2f%n", costo); // Muestra el costo actualizado con dos decimales.
    } // Termina el método actualizarEquipo.

    // Metodo para eliminar un equipo de rescate.
    public static void eliminarEquipo() { // Declara el método para eliminar un equipo.

        System.out.println("\n===== ELIMINAR EQUIPO ====="); // Muestra el título de eliminación de equipos.

        // Comprueba si existen equipos registrados.
        if (equipos.isEmpty()) { // Comprueba si todavía no hay equipos.

            System.out.println("No existen equipos registrados."); // Avisa que la lista de equipos está vacía.
            return; // Sale porque no existe nada que eliminar.
        } // Cierra la comprobación.

        // Solicita el identificador del equipo.
        System.out.print("Ingrese el ID del equipo: "); // Pide el ID del equipo que se eliminará.
        String id = entrada.nextLine().trim(); // Lee el identificador y quita espacios.

        // Busca el equipo correspondiente.
        EquipoRescate equipo = buscarEquipo(id); // Busca el equipo solicitado.

        // Comprueba si existe.
        if (equipo == null) { // Comprueba si no se encontró ese equipo.

            System.out.println("Error: equipo no encontrado."); // Muestra un error de equipo inexistente.
            return; // Cancela esta operación.
        } // Cierra la comprobación.

        // Muestra los datos antes de eliminar.
        System.out.println("\n" + equipo); // Muestra los datos del equipo antes de borrarlo.

        // Solicita confirmacion al usuario.
        while (true) { // Repite la confirmación hasta que respondan bien.

            System.out.print("\n¿Desea eliminar el equipo? (S/N): "); // Pregunta si realmente desean eliminar el equipo.
            String respuesta = entrada.nextLine().trim(); // Lee S o N y elimina espacios externos.

            // Si confirma, elimina solamente el equipo.
            if (respuesta.equalsIgnoreCase("S")) { // Comprueba si el usuario escribió S.

                equipos.remove(equipo); // Quita el equipo de la lista general.

                System.out.println("Equipo eliminado correctamente."); // Confirma que se eliminó el equipo.
                return; // Sale después de eliminar.
            } // Cierra el caso de confirmación.

            // Permite cancelar la eliminacion.
            if (respuesta.equalsIgnoreCase("N")) { // Comprueba si el usuario escribió N.

                System.out.println("Eliminacion cancelada."); // Informa que no se borró el equipo.
                return; // Sale sin eliminar.
            } // Cierra el caso de cancelación.

            // Rechaza respuestas diferentes de S o N.
            System.out.println("Error: responda S o N."); // Avisa que la respuesta debe ser S o N.
        } // Cierra esta vuelta y pregunta de nuevo si hace falta.
   
    } // Termina el método eliminarEquipo.



    // ===============================================
    // MODULO DE REPORTES
    // ===============================================

    // Metodo que muestra el submenu de reportes.
    public static void menuReportes() { // Declara el método del submenú de reportes.

        // Variable que almacena la opcion seleccionada.
        int opcion; // Guarda el número del reporte seleccionado.

        // Repite el submenu hasta que el usuario regrese.
        do { // Inicia el ciclo que repite el menú de reportes.

            System.out.println("\n===== MODULO DE REPORTES ====="); // Muestra el título de los reportes.
            System.out.println("1. Mostrar todos los superheroes"); // Muestra la opción del listado general de héroes.
            System.out.println("2. Buscar un superheroe por ID"); // Muestra la opción de buscar un héroe por ID.
            System.out.println("3. Mostrar todos los equipos de rescate"); // Muestra la opción de listar todos los equipos.
            System.out.println("4. Mostrar el equipo con mayor costo operativo"); // Muestra la opción del equipo más costoso.
            System.out.println("5. Buscar equipos por tipo de emergencia"); // Muestra la opción de buscar por tipo de emergencia.
            System.out.println("6. Mostrar superheroes con nivel Elite"); // Muestra la opción de filtrar héroes Elite.
            System.out.println("7. Mostrar cantidad de heroes segun su estado"); // Muestra la opción de contar héroes por estado.
            System.out.println("8. Regresar al menu principal"); // Muestra la opción para regresar.

            // Solicita una opcion valida entre 1 y 8.
            opcion = leerOpcion(1, 8); // Lee una opción válida entre 1 y 8.

            // Ejecuta el reporte seleccionado.
            switch (opcion) { // Decide qué reporte ejecutar.

                case 1: // Selecciona el listado de héroes.
                    mostrarTodosSuperheroes(); // Ejecuta el listado de héroes.
                    break; // Termina esta opción.

                case 2: // Selecciona la búsqueda por ID.
                    buscarSuperheroeReporte(); // Ejecuta la búsqueda de un héroe.
                    break; // Termina esta opción.

                case 3: // Selecciona la lista de equipos.
                    mostrarTodosEquipos(); // Ejecuta el reporte de todos los equipos.
                    break; // Termina esta opción.

                case 4: // Selecciona el equipo de mayor costo.
                    mostrarEquipoMayorCosto(); // Ejecuta el cálculo y muestra el mayor.
                    break; // Termina esta opción.

                case 5: // Selecciona el filtro por emergencia.
                    buscarEquiposPorEmergencia(); // Ejecuta la búsqueda por emergencia.
                    break; // Termina esta opción.

                case 6: // Selecciona la lista de héroes Elite.
                    mostrarSuperheroesElite(); // Ejecuta el filtro de experiencia Elite.
                    break; // Termina esta opción.

                case 7: // Selecciona el conteo según el estado.
                    mostrarCantidadPorEstado(); // Ejecuta el conteo por estado.
                    break; // Termina esta opción.

                case 8: // Selecciona la opción para regresar.
                    System.out.println("Regresando al menu principal..."); // Muestra un aviso de regreso.
                    break; // Termina esta opción.
            } // Cierra el switch del menú de reportes.

        } while (opcion != 8); // Repite el menú hasta que seleccionen 8.
    } // Termina el método menuReportes.

    // ===============================================
    // REPORTE 1: MOSTRAR TODOS LOS SUPERHEROES
    // ===============================================

    public static void mostrarTodosSuperheroes() { // Declara el reporte de todos los héroes.

        System.out.println("\n===== LISTADO DE SUPERHEROES ====="); // Muestra el título del listado de superhéroes.

        // Comprueba si existen superheroes registrados.
        if (superheroes.isEmpty()) { // Comprueba si no hay héroes registrados.

            System.out.println("No existen superheroes registrados."); // Avisa que no existen registros.
            return; // Sale para evitar mostrar una lista vacía.
        } // Cierra la comprobación.

        // Recorre el ArrayList de superheroes.
        for (Superheroe heroe : superheroes) { // Recorre todos los héroes guardados.

            // Muestra la informacion completa del superheroe.
            System.out.println("\n-----------------------------"); // Imprime una línea para separar los registros.
            System.out.println(heroe); // Muestra los datos completos del héroe.
        } // Termina de recorrer la lista.

        // Muestra la cantidad total de superheroes.
        System.out.println("\nTotal de superheroes registrados: " // Comienza el mensaje del total de héroes.
                + superheroes.size()); // Añade el tamaño de la lista al mensaje.
    } // Termina el reporte del listado de héroes.

    // ===============================================
    // REPORTE 2: BUSCAR SUPERHEROE POR ID
    // ===============================================

    public static void buscarSuperheroeReporte() { // Declara el reporte de búsqueda por ID.

        System.out.println("\n===== BUSCAR SUPERHEROE POR ID ====="); // Muestra el título del reporte.

        // Comprueba si existen superheroes.
        if (superheroes.isEmpty()) { // Comprueba si la lista de héroes está vacía.

            System.out.println("No existen superheroes registrados."); // Informa que no hay héroes registrados.
            return; // Termina el reporte si no hay datos.
        } // Cierra la comprobación.

        // Solicita el identificador del superheroe.
        System.out.print("Ingrese el ID del superheroe: "); // Pide el ID que se desea consultar.
        String id = entrada.nextLine().trim(); // Lee el ID y quita espacios.

        // Utiliza el metodo de busqueda que ya creamos.
        Superheroe heroe = buscarSuperheroe(id); // Busca al héroe usando el método ya definido.

        // Comprueba si se encontro el superheroe.
        if (heroe == null) { // Comprueba si no existe un héroe con ese ID.

            System.out.println("No se encontro un superheroe con ese ID."); // Informa que la búsqueda no tuvo resultados.
            return; // Termina el método si no lo encuentra.
        } // Cierra la comprobación.

        // Muestra la informacion del superheroe encontrado.
        System.out.println("\nSuperheroe encontrado:"); // Indica que se encontró el héroe.
        System.out.println(heroe); // Imprime toda su información.
    } // Termina el reporte de búsqueda.

    // ===============================================
    // METODO AUXILIAR PARA MOSTRAR UN EQUIPO
    // ===============================================

    // Este metodo permite reutilizar la misma presentacion
    // en diferentes reportes de equipos de rescate.
    public static void mostrarDetalleEquipo(EquipoRescate equipo) { // Declara un método para mostrar los datos de un equipo.

        // Muestra los datos generales del equipo.
        System.out.println("\n-----------------------------"); // Imprime una línea de separación.
        System.out.println(equipo); // Muestra el resumen del equipo recibido.

        // Obtiene los integrantes del equipo.
        ArrayList<Superheroe> integrantes = // Declara la lista de héroes integrantes.
                equipo.getListaSuperheroes(); // Obtiene los integrantes guardados en ese equipo.

        // Comprueba si el equipo tiene superheroes.
        if (integrantes.isEmpty()) { // Comprueba si el equipo no tiene integrantes.

            System.out.println("Este equipo no tiene integrantes."); // Informa que la lista de integrantes está vacía.
            return; // Sale porque no hay integrantes para mostrar.
        } // Cierra la comprobación.

        System.out.println("\nSuperheroes del equipo:"); // Muestra el título de integrantes.

        // Recorre los integrantes del equipo.
        for (Superheroe heroe : integrantes) { // Recorre los integrantes del equipo.

            // Muestra el ID, nombre y salario del integrante.
            System.out.printf( // Inicia la impresión formateada de un integrante.
                    "%s - %s - Salario: $%,.2f%n", // Define la forma de mostrar ID, nombre y salario.
                    heroe.getIdHeroe(), // Coloca el ID del héroe en el formato.
                    heroe.getNombreHeroico(), // Coloca el nombre heroico en el formato.
                    heroe.getSalarioMensual() // Coloca el salario del héroe en el formato.
            ); // Cierra la instrucción de impresión formateada.
        } // Termina el recorrido de integrantes.
    } // Termina el método mostrarDetalleEquipo.

    // ===============================================
    // REPORTE 3: MOSTRAR TODOS LOS EQUIPOS
    // ===============================================

    public static void mostrarTodosEquipos() { // Declara el reporte de todos los equipos.

        System.out.println("\n===== LISTADO DE EQUIPOS DE RESCATE ====="); // Muestra el título del listado de equipos.

        // Comprueba si existen equipos registrados.
        if (equipos.isEmpty()) { // Comprueba si no existen equipos registrados.

            System.out.println("No existen equipos registrados."); // Informa que la lista está vacía.
            return; // Sale sin intentar recorrer equipos inexistentes.
        } // Cierra la comprobación.

        // Recorre todos los equipos de rescate.
        for (EquipoRescate equipo : equipos) { // Recorre todos los equipos registrados.

            // Muestra la informacion completa del equipo.
            mostrarDetalleEquipo(equipo); // Muestra los datos del equipo actual.
        } // Termina de recorrer los equipos.

        // Muestra la cantidad total de equipos.
        System.out.println("\nTotal de equipos registrados: " // Comienza el mensaje del total de equipos.
                + equipos.size()); // Añade cuántos equipos hay en la lista.
    } // Termina el reporte de todos los equipos.

    // ===============================================
    // REPORTE 4: EQUIPO CON MAYOR COSTO OPERATIVO
    // ===============================================

    public static void mostrarEquipoMayorCosto() { // Declara el reporte del equipo más costoso.

        System.out.println("\n===== EQUIPO CON MAYOR COSTO OPERATIVO ====="); // Muestra el encabezado del reporte.

        // Comprueba si existen equipos registrados.
        if (equipos.isEmpty()) { // Comprueba que exista al menos un equipo.

            System.out.println("No existen equipos registrados."); // Informa que la lista de equipos está vacía.
            return; // Sale para no consultar una posición inexistente.
        } // Cierra la comprobación.

        // Toma el primer equipo como referencia inicial.
        EquipoRescate equipoMayor = equipos.get(0); // Toma el primer equipo como mayor provisional.

        // Obtiene el costo del primer equipo.
        double costoMayor = equipoMayor.CalcularCostoRescate(); // Calcula el costo del equipo tomado como referencia.

        // Recorre todos los equipos registrados.
        for (EquipoRescate equipo : equipos) { // Compara uno por uno todos los equipos.

            // Calcula el costo del equipo actual.
            double costoActual = equipo.CalcularCostoRescate(); // Calcula el costo del equipo actual.

            // Compara el costo actual con el mayor encontrado.
            if (costoActual > costoMayor) { // Comprueba si el costo actual supera al mayor.

                // Actualiza el mayor costo.
                costoMayor = costoActual; // Guarda el nuevo costo máximo.

                // Guarda la referencia del equipo mas costoso.
                equipoMayor = equipo; // Guarda el equipo que tiene ese nuevo máximo.
            } // Cierra la comparación de costos.
        } // Termina el recorrido de equipos.

        // Muestra el equipo con el mayor costo operativo.
        mostrarDetalleEquipo(equipoMayor); // Muestra los datos del equipo más costoso.

        // Muestra el resultado final del calculo.
        System.out.printf( // Inicia la impresión del costo máximo.
                "\nMAYOR COSTO OPERATIVO: $%,.2f%n", // Especifica el formato del valor en dólares.
                costoMayor // Pasa el costo mayor a la impresión.
        ); // Cierra la impresión del resultado.
    } // Termina el reporte del mayor costo.

    // ===============================================
    // REPORTE 5: BUSCAR EQUIPOS POR EMERGENCIA
    // ===============================================

    public static void buscarEquiposPorEmergencia() { // Declara el reporte por tipo de emergencia.

        System.out.println("\n===== BUSCAR EQUIPOS POR EMERGENCIA ====="); // Muestra el título de esta búsqueda.

        // Comprueba si existen equipos registrados.
        if (equipos.isEmpty()) { // Comprueba si no hay equipos registrados.

            System.out.println("No existen equipos registrados."); // Avisa que no existen equipos.
            return; // Sale del método si la lista está vacía.
        } // Cierra la comprobación.

        // Solicita seleccionar uno de los tipos de emergencia.
        String emergencia = seleccionarEmergencia(); // Permite elegir el tipo de emergencia buscado.

        // Contador de equipos encontrados.
        int encontrados = 0; // Inicia en cero el contador de coincidencias.

        // Recorre el ArrayList de equipos.
        for (EquipoRescate equipo : equipos) { // Revisa todos los equipos registrados.

            // Compara el tipo de emergencia del equipo.
            if (equipo.getTipoEmergencia().equalsIgnoreCase(emergencia)) { // Compara el tipo de emergencia del equipo con el elegido.

                // Muestra los datos del equipo encontrado.
                mostrarDetalleEquipo(equipo); // Muestra los datos del equipo coincidente.

                // Aumenta el contador.
                encontrados++; // Cuenta un equipo más que cumple la condición.
            } // Cierra la comparación por emergencia.
        } // Termina el recorrido de equipos.

        // Comprueba si la busqueda tuvo resultados.
        if (encontrados == 0) { // Comprueba si no se encontró ningún equipo.

            System.out.println( // Inicia el aviso de que no hubo coincidencias.
                    "No existen equipos para ese tipo de emergencia."); // Termina el mensaje de búsqueda sin resultados.

        } else { // Si sí hubo resultados, entra a este bloque.

            // Muestra la cantidad de equipos encontrados.
            System.out.println("\nEquipos encontrados: " // Comienza el mensaje de cantidad encontrada.
                    + encontrados); // Añade la cantidad de equipos encontrados.
        } // Cierra la alternativa del resultado.
    } // Termina el reporte de búsqueda por emergencia.

    // ===============================================
    // REPORTE 6: MOSTRAR SUPERHEROES NIVEL ELITE
    // ===============================================

    public static void mostrarSuperheroesElite() { // Declara el reporte de héroes con experiencia Elite.

        System.out.println("\n===== SUPERHEROES CON NIVEL ELITE ====="); // Muestra el título del filtro Elite.

        // Comprueba si existen superheroes registrados.
        if (superheroes.isEmpty()) { // Comprueba si no hay héroes registrados.

            System.out.println("No existen superheroes registrados."); // Informa que la lista está vacía.
            return; // Sale si no hay datos que filtrar.
        } // Cierra la comprobación.

        // Contador de superheroes con nivel Elite.
        int cantidadElite = 0; // Inicia en cero el contador de héroes Elite.

        // Recorre todos los superheroes registrados.
        for (Superheroe heroe : superheroes) { // Recorre todos los héroes registrados.

            // Comprueba si el superheroe tiene nivel Elite.
            if (heroe.getExperiencia().equalsIgnoreCase("Elite")) { // Comprueba si la experiencia del héroe es Elite.

                // Muestra la informacion del superheroe.
                System.out.println("\n-----------------------------"); // Imprime un separador entre héroes encontrados.
                System.out.println(heroe); // Muestra los datos del héroe Elite.

                // Aumenta el contador.
                cantidadElite++; // Aumenta en uno el conteo de Elite.
            } // Cierra la comprobación de experiencia.
        } // Termina el recorrido de héroes.

        // Comprueba si existen superheroes Elite.
        if (cantidadElite == 0) { // Comprueba si el contador sigue en cero.

            System.out.println( // Inicia el mensaje sin resultados.
                    "No existen superheroes con nivel Elite."); // Informa que no se encontraron héroes Elite.

        } else { // Entra aquí cuando sí se encontraron héroes.

            // Muestra la cantidad de superheroes Elite.
            System.out.println("\nTotal de superheroes Elite: " // Comienza el mensaje del total Elite.
                    + cantidadElite); // Añade el número de héroes Elite.
        } // Cierra la alternativa del reporte.
    } // Termina el reporte de experiencia Elite.

    // ===============================================
    // REPORTE 7: CANTIDAD DE HEROES SEGUN SU ESTADO
    // ===============================================

    public static void mostrarCantidadPorEstado() { // Declara el reporte que cuenta héroes por estado.

        System.out.println("\n===== CANTIDAD DE HEROES SEGUN ESTADO ====="); // Muestra el título del conteo por estado.

        // Comprueba si existen superheroes registrados.
        if (superheroes.isEmpty()) { // Comprueba si no se han registrado héroes.

            System.out.println("No existen superheroes registrados."); // Informa que la lista de héroes está vacía.
            return; // Sale sin realizar el conteo.
        } // Cierra la comprobación.

        // Contador de superheroes disponibles.
        int disponibles = 0; // Inicia el contador de héroes disponibles.

        // Contador de superheroes en mision.
        int enMision = 0; // Inicia el contador de héroes en misión.

        // Contador de superheroes en recuperacion.
        int recuperacion = 0; // Inicia el contador de héroes en recuperación.

        // Recorre todos los superheroes registrados.
        for (Superheroe heroe : superheroes) { // Recorre todos los superhéroes registrados.

            // Obtiene el estado actual del superheroe.
            String estado = heroe.getEstado(); // Consulta y guarda el estado del héroe actual.

            // Comprueba si se encuentra disponible.
            if (estado.equalsIgnoreCase("Disponible")) { // Comprueba si el héroe está disponible.

                disponibles++; // Cuenta un héroe disponible adicional.

            // Comprueba si se encuentra en mision.
            } else if (estado.equalsIgnoreCase("En misión")) { // Si no estaba disponible, comprueba si está en misión.

                enMision++; // Cuenta un héroe más en misión.

            // Comprueba si esta en recuperacion.
            } else if (estado.equalsIgnoreCase("Recuperación")) { // Si no estaba en misión, comprueba si está en recuperación.

                recuperacion++; // Cuenta un héroe más en recuperación.
            } // Cierra la selección de estados.
        } // Termina de recorrer a los héroes.

        // Muestra la cantidad de superheroes por estado.
        System.out.println("\nSuperheroes disponibles: " // Comienza el mensaje de héroes disponibles.
                + disponibles); // Añade la cantidad de disponibles.

        System.out.println("Superheroes en mision: " // Comienza el mensaje de héroes en misión.
                + enMision); // Añade la cantidad en misión.

        System.out.println("Superheroes en recuperacion: " // Comienza el mensaje de héroes en recuperación.
                + recuperacion); // Añade la cantidad en recuperación.

        // Muestra la cantidad total de superheroes.
        System.out.println("\nTotal de superheroes registrados: " // Comienza el mensaje con el total de héroes.
                + superheroes.size()); // Añade el tamaño de la lista de héroes.
    } // Termina el reporte por estado.


} // Cierra la clase AcademiaSuperheroes.
