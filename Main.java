
public class Main {

    // CODE EXAMPLE VALID FOR COMPILING
    public static void main(String[] args) {
        System.out.println(withoutT("tHit"));
        System.out.println(withoutT("tHi"));
        System.out.println(withoutT("Htit"));
        System.out.println(withoutT("Thwart"));
        System.out.println(withoutT("Fort"));
        System.out.println(withoutT("Timber"));
    }

    public static String withoutT(String in){
        String result = in;
        if ( result.startsWith("t") || result.startsWith("T") ) {
            result = in.substring(1);
        }
        if ( result.endsWith("t") || result.endsWith("T") ) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }
}
