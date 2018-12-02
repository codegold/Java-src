// Отображение всех данных, указываемых в командной строке
class CLDemo {
    public static void main(String[] args) {
        System.out.println("Programme peredano " +args.length+
                " argumentov komandnoi stroki.");

        System.out.println("Spisok argumentov: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: args[i]");
    }
}