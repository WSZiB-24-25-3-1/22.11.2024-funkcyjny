package pl.edu.wszib.funkcyjny;

public interface TriFunction<T, X, Y, Z> {

    Z apply(T t, X x, Y y);
}
