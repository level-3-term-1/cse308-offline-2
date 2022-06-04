
import Application.Application;
import Utils.BuildOptions;
import Utils.Commands;
import Utils.CommunicationOptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commands command;
        BuildOptions buildOptions;
        CommunicationOptions communicationOptions;
        Scanner input = new Scanner(System.in);

        Application application = new Application();

        boolean take_input = true;

        while(take_input){
            Commands.showsOptions();
            int c = input.nextInt();
            command = Commands.get(c);
            switch (command) {
                case SHOW -> {
                    //show  display units with cost
                    application.showAllOrder();
                }
                case PLACE_ORDER -> {
                    BuildOptions.showsOptions();
                    c = input.nextInt();
                    buildOptions = BuildOptions.get(c);
                    CommunicationOptions.showsOptions();
                    c = input.nextInt();
                    communicationOptions = CommunicationOptions.get(c);
                    System.out.print("number of display units: ");
                    c = input.nextInt();
                    application.addToQueue(buildOptions, communicationOptions, c);
                }
                case EXIT -> {
                    take_input = false;
                }
            }

            System.out.println();
            System.out.println();
        }
    }
}