package biblioteca;
public class Main {
    public static void main(String[] args){
    Biblioteca biblioteca = new Biblioteca();
    Libro libro1 = new Libro("El señor de los anillos", "J.R.R Tolkien", 1);
    Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 2);
    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
        Usuario user1 = new Usuario("DIEGO", 101);
        Usuario user2 = new Usuario("Mario", 202);
        biblioteca.registrarUsuario(user1);
        biblioteca.registrarUsuario(user2);
        
        
            user1.prestarLibro(libro1);
            user2.prestarLibro(libro2);
            user1.devolverLibro(libro1);
                biblioteca.mostrarCatalogo();
                biblioteca.mostrarUsuario();
    }
}