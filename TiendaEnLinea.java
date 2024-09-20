public class TiendaEnLinea {
public static void main(String[] args) {
       // VARIABLES DE LA TIENDA
       // Mensajes de la aplicación
    String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
    String mensajeConfirmacion = ", tu pedido ha sido confirmado";
    String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
    String mensajeMostrarTotal = "El total de tu compra es: $";
    
       // Variables de productos (agrega las tuyas a continuación)
    double precioLibro = 15.99;
    double precioCamiseta = 25.50;
    double precioPantalones = 45.90;
    double precioZapatos = 70.99;

       // Variables de clientes (agrega las tuyas a continuación)
    String cliente1 = "Ana";
    String cliente2 = "Alex";
    String cliente3 = "Miguel";

       // Estado de pedidos (agrega las tuyas a continuación)
    boolean pedidoConfirmadoCliente1 = true;
    boolean pedidoConfirmadoCliente2 = true;
    boolean pedidoConfirmadoCliente3 = true;

       // INTERACCIÓN DE LA APLICACIÓN
       System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
       // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
        if (pedidoConfirmadoCliente1){
            System.out.println("Tu pedido ha sido confirmado");
            System.out.println("El total de tu pedido es: $" + precioPantalones);
        }
        System.out.println(mensajeBienvenida + cliente3);
        if (pedidoConfirmadoCliente3){
            System.out.println("Tu pedido ha sido confirmado");
            System.out.println("El total de tu pedido es: $" + precioPantalones + precioCamiseta);
            System.out.println("Ha ocurrido un error, la diferencia a pagar es: $" + ((precioZapatos + precioLibro) - (precioPantalones + precioCamiseta)));
        }
        System.out.println(mensajeBienvenida + cliente2);
        if(pedidoConfirmadoCliente2){
            System.out.println("Tu pedido ha sido confirmado y el total es de :$" + precioCamiseta + precioPantalones);
        }
    }
}