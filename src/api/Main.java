package api;
public class Main {

    public static void main(String[] args) {

        ArgumentSwitcher argumentSwitcher = new ArgumentSwitcher();

        //if no arguments are given, show how to get help and exit program
        if (args.length == 0) {
            System.out.println("No has introducido parámetros, introduce 'help' para ver el manual");
            return;
        }
        //the program manual
        if (args[0].equalsIgnoreCase("help")) {
        	
            System.out.println("Para obtener todos los resultados en una categoría");
            System.out.println("introduce: [category]");
            System.out.println("");
            System.out.println("Para encontrar resultados en una categoría");
            System.out.println("introduce: [category]  [search]");
            System.out.println("");
            System.out.println("[category] : films, planets, starships");
            System.out.println("[search] puedes buscar en los siguientes campos por categoría");
            System.out.println("");
            System.out.println("films : title");
            System.out.println("planets : name");
            System.out.println("starships : name, model");
            return;
        }
        //get all in category
        if (args.length == 1) {
            argumentSwitcher.switcher(args[0], null);
            return;
        }
        //get search in category
        if (args.length == 2) {
            argumentSwitcher.switcher(args[0], args[1]);
            return;

        }
    }
}