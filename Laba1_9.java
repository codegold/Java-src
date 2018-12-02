class Laba1_9 {
    public static void main(String args[])
            throws java.io.IOException {
        char choice;
        int change = 0;
        System.out.println("Press any key.");
        do {
            choice = (char) System.in.read();
            if (choice >= 'a' & choice <= 'z') {
                choice -= 32;
                change++;
                System.out.println(" You pressed: " + choice);
            }
            else if (choice >= 'A' & choice <= 'Z') {
                choice += 32;
                change++;
                System.out.println(" You pressed: " + choice);
            }

        } while (choice != '.');
        System.out.print(" Changes: " + change);
    }
}


