package rmiServer;

import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmiService.BanqueImpl;
import rmiService.IBanque;
import static java.rmi.registry.LocateRegistry.createRegistry;

public class BanqueServer {

    public static void main(String[] args) {
        try {
            // Création de l'objet distant
            IBanque banque = new BanqueImpl();

            // Création du registre RMI sur le port 1099
            Registry registry;
            registry = createRegistry(1099);

            // Enregistrement de l'objet distant dans le registre
            IBanque stub = (IBanque) UnicastRemoteObject.exportObject(banque, 1);
            registry.rebind("BanqueService", stub);

            System.out.println("Serveur prêt...");

        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}
