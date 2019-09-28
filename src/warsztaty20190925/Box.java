package warsztaty20190925;

public class Box<T> {


    private T content;

    public void put(T person) {

        this.content = person;
    }

    public T get() {

        return content;
    }
}
