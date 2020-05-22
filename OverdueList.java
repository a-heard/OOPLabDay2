public class OverdueList<E extends Book> {
    
    private E itemsOverdue;
    public OverdueList(E itemsOverdue){
        this.itemsOverdue = itemsOverdue;
    }

    public E getItemsOverdue() {
        return itemsOverdue;
    }

    public void setItemsOverdue(E itemsOverdue) {
        this.itemsOverdue = itemsOverdue;
    }

    
}