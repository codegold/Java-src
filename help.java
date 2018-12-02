class Help1 {
    public static void main(String args[])
        throws java.io.IOException {

            char choice;

            System.out.println("Cпpaвкa:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.print("Bыбepитe: ");

            choice = (char) System.in.read();

            switch (choice) {
                case '1':
                    System.out.println("Оператор if:\n");
                    System.out.println("if(условие) оператор;");
                    System.out.println("else operator;");
                    break;
                case '2':
                    System.out.println("Operator switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println(" case константа");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                default:
                    System.out.print("Зaпpoc не найден.");
            }


        }


    }
