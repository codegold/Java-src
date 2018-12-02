package ChapterTwo;

// Try this 2-2: a truth table for the logical operators. package   ChapterTwo;

public class LogicalOpTable {

    public static void main(String[] args) {

        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        System.out.print(printBoolean(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = true;
        q = false;

        System.out.print(printBoolean(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = false;
        q = true;

        System.out.print(printBoolean(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));

        p = false;
        q = false;

        System.out.print(printBoolean(p) + "\t" + (printBoolean2(q)) + "\t");
        System.out.print(printBoolean(p & q) + "\t" + printBoolean(p | q) + "\t");
        System.out.println(printBoolean2(p ^ q) + "\t" + printBoolean(!p));
    }

    public static String printBoolean(boolean p) {
        return p ? "8" : "1";
    }

    public static String printBoolean2(boolean q) {
        return q ? "8" : "1";

    }
}