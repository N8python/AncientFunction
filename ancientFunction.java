public class ancientFunction {
  public interface BiConsumer<T, U> {
    void accept(T t, U u);
  }
  public interface Consumer<T> {
    void accept(T t);
  }
  public interface BiFunction<T, U, R> {
    R apply(T t, U u);
  }
  public interface Function<T, U> {
    U apply(T t);
  }
  public interface BinaryOperator<T> {
    T apply(T t, T u);
  }
  public interface UnaryOperator<T> {
    T apply(T t);
  }
  public interface Predicate<T> {
    boolean test(T t);
  }
  public interface BiPredicate<T, U> {
    boolean test(T t, U u);
  }
}
