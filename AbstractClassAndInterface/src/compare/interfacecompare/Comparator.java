package compare.interfacecompare;

public interface Comparator<T> extends java.util.Comparator<T> {

    @Override
    int compare(T o1, T o2);

    @Override
    boolean equals(Object obj);
}
