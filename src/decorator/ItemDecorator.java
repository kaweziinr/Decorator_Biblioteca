package decorator;

//Classe abstrata para decoradores
public abstract class ItemDecorator implements BibliotecaItem {
 protected BibliotecaItem item;

 public ItemDecorator(BibliotecaItem item) {
     this.item = item;
 }

 @Override
 public String descricao() {
     return item.descricao();
 }
}
