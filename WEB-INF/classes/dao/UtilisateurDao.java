package dao;

import java.util.List;

import beans.Utilisateur;

public interface UtilisateurDao {
    void ajouter( Utilisateur utilisateur );
    List<Utilisateur> lister();
}
