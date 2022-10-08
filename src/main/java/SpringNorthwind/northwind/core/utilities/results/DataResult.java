package SpringNorthwind.northwind.core.utilities.results;

public class DataResult<T> extends Result{
    private T data;
    public DataResult(T data,boolean success, String message) {
        super(success, message);
        this.data=data;
    }

    public DataResult(boolean success) {
        super(success);
    }


}
