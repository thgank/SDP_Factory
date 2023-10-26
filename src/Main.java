import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static List<Plugin> pluginList = new ArrayList<>();
    public static void main(String[] args) {

        start();
    }
    public static void start() {
        PluginFactory factory = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose which factory you want:");
        System.out.println("1. SmoothAnimation");
        System.out.println("2. PopUpNotification");
        System.out.println("3. List plugins");

        String choice = sc.nextLine();

        if (choice.equals("1")) {
            factory = new PluginFactoryA();
        } else if (choice.equals("2")) {
            factory = new PluginFactoryB();
        } else if(choice.equals("3")){
            listPlugins();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // Create a specific factory for plugins.
        Plugin plugin = factory.createPlugin();

        // Add the created object to the static ArrayList.
        pluginList.add(plugin);

        // Use the plugin to perform an action.
        plugin.performAction();

        start();
    }
    public static void listPlugins(){
        for (Plugin savedPlugin : pluginList) {
            savedPlugin.performAction();
        }
        start();
    }
}