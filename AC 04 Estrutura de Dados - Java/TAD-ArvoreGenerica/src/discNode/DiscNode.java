package discNode;


public class DiscNode<E> {

    private int byteUnit; //byte nao pode por ja ser do java
    private E element;
    private String name;


    public DiscNode(E element) {
        setName(name);
        element(element);
        setByteUnit(byteUnit);
    }

    public E getElement() {
        return element;
    }


    public String getName() {
        return name;
    }

    public int getKbytes() {
        return byteUnit;
    }

    public void element(E e) {
        element = e;
    }

    public void setName(String name) {
        name = name;
    }

    public void setByteUnit(int bt) {
        byteUnit = bt;
    }
}