package decorator;

//Decorador para reserva
public class ReservaDecorator extends ItemDecorator {
 private boolean reservado;

 public ReservaDecorator(BibliotecaItem item) {
     super(item);
     this.reservado = false;
 }

 public String reservar() {
     if (!reservado) {
         reservado = true;
         return "Item reservado com sucesso.";
     }
     return "Item já está reservado.";
 }

 public String cancelarReserva() {
     if (reservado) {
         reservado = false;
         return "Reserva cancelada com sucesso.";
     }
     return "Item não está reservado.";
 }

 @Override
 public String descricao() {
     String status = reservado ? "Reservado" : "Não reservado";
     return super.descricao() + " (" + status + ")";
 }
}
