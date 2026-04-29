package Lab10;

public enum ErrorExample {

    INPUT_MISMATCH(3, "Input doesn't match expected type", "Type1"),
    ARRAY_OUT_OF_BOUNDS(2, "Array index is out of bound", "Type1"),
    NULl_POINTER(3, "Attempted to use a null reference", "Type1"),
    DIVIDE_BY_ZERO(4, "Cannot divide a number by zero", "Type2"),
    ArithmeticError(5, "Recursive call exceeded stack limit", "Type2");


    private int code;
    private String description;
    private String val;


    ErrorExample(int code, String description, String val) {
        this.code = code;
        this.description = description;
        this.val=val;
    }


    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public  String getVal(){
        return this.val;
    }
}
