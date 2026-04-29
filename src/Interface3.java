interface DocumentReader {

    public char readChar();

    public String readLine();
}

interface DocumentWriter{

    public boolean writeChar();
    public  boolean writeLine();
}

class ReaderWriter implements DocumentReader, DocumentWriter{

    @Override
    public char readChar(){
        return 0;
    }
   @Override
    public String readLine(){
        return null;
    }
    @Override
    public boolean writeChar(){
        return false;
    }
    @Override
    public  boolean writeLine(){
        return false;
    }
}


public class Interface3{
    public static void main(String[] args) {

    }
}
