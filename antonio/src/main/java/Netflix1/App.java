
package Netflix1;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }

    interface IReproducible {
        public void iniciar();

        public void pausar();

        public void adelantar();

        public void retroceder();
    }

    abstract class Catalogo {
        String titulo;
        String descripcion;
        double fechaPublicacion;
        String director;
        String productora;

    }

    class Pelicula extends Catalogo implements IReproducible {

        Pelicula(String titulo, String descripcion, double fechaPublicacion, String director, String productora) {
            super();
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.fechaPublicacion = fechaPublicacion;
            this.director = director;
            this.productora = productora;
        }

        public void iniciar() {
            System.out.println("inicia");
        }

        public void pausar() {
            System.out.println("pausa");
        }

        public void adelantar() {
            System.out.println("avance");

        }

        public void retroceder() {
            System.out.println("retroceso");
        }
    }

    class Serie extends Catalogo implements IReproducible {
        Serie(String titulo, String descripcion, double fechaPublicacion, String director, String productora) {
            super();
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.fechaPublicacion = fechaPublicacion;
            this.director = director;
            this.productora = productora;
        }

        public void iniciar() {
            System.out.println("inicia");
        }

        public void pausar() {
            System.out.println("pausa");
        }

        public void adelantar() {
            System.out.println("avance");

        }

        public void retroceder() {
            System.out.println("retroceso");
        }
    }
}

/*
 * 2.- En el catálogo de Netflix existen películas y series, ambos son
 * contenido, es decir, tienen título, descripción, fecha de publicación,
 * director, productora, etc…
 * 
 * A diferencia de las películas, las series no se pueden reproducir
 * directamente, sino que se reproducen sus capítulos, es decir, tanto los
 * capítulos de una serie como las películas son reproducibles, se pueden
 * iniciar, pausar, adelantar y retroceder.
 * 
 * Define (indicando propiedades y relaciones pero sin implementar los métodos)
 * la jerarquía de clases e interfaces necesaria para representar el catálogo de
 * Netflix.
 */
