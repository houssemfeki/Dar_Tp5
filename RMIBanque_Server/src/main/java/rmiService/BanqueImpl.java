package rmiService;

import metier.Compte;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    public BanqueImpl() throws RemoteException {
        super();
    }
    @Override
    public String creerCompte(Compte c) throws RemoteException {
        // Implémentation de la création de compte
        return "Compte créé avec succès";
    }
    @Override
    public String getInfoCompte(int code) throws RemoteException {
        // Implémentation pour obtenir les informations du compte
        return "Informations du compte";
    }
}
