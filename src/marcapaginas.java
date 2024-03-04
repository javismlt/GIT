/**
* La clase marcapaginas implementa todas las funciones que debe realizar un marcapaginas
* {@link mostrarinfo}
* @author Javi Sanchez
* @version 1.0
* @see <a src = "https://www.youtube.com/watch?v=SkQL3eT3nTU&t=2s"> Informacion JavaDoc </a>
*/


public class marcapaginas {

String lector;
int npag = 0;
int paglibro = 576;

public marcapaginas(String lector) {
    this.lector = lector;
 }



/**
* El metodo incrementa el numero de paginas que ha leido el lector
* @param cantidad cantidad de paginas leidas por el lector
* @throws IlegalAccessError se devuelve la excepcion cuando algun argumento es erroneo
*/
void incrementarPag(int cantidad) {
    for(int i = 0; i < cantidad; i++){
        npag++;
    }
}


void restaurar() {
    npag = 0;
}


void mostrarinfo() {
    System.out.println("PERFIL DE LECTURA DE: " + lector);
    System.out.println("Numero de la pagina: " + npag);
}


/**
* El metodo comprueba si el lector ha terminado de leer el libro
* @return devuelve true en caso de haber terminado el libro, false en caso contrario
*/
public boolean finalizado() {
    if (npag == paglibro) {
    return true;
    } else {
    return false;
    }
}
}
