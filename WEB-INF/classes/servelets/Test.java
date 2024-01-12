package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Auteur;
import forms.ConnectionForm;

import bdd.Noms;
import beans.Utilisateur;

public class Test extends HttpServlet {

    public Test() {
        super();
    }

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException
    {        
        Noms tableNoms = new Noms();
        request.setAttribute("utilisateurs",
                tableNoms.recupererUtilisateurs());
        Auteur auteur = new Auteur();
        auteur.setPrenom("Mathieu");
        auteur.setNom("Nebra");
        auteur.setActif(true);
        request.setAttribute("auteur", auteur);
        // String name = request.getParameter("name");
        // request.setAttribute("name", name);
        // String[] noms = {"Mathieu", "Robert", "François"};
        // request.setAttribute("noms", noms);
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException
    {
        // String nom = request.getParameter("nom");
        // request.setAttribute("nom", nom);
        
        // test connexion
        // ConnectionForm form = new ConnectionForm();
        // form.verifierIdentifiants(request);
        // request.setAttribute("form", form);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));

        Noms tableNoms = new Noms();
        tableNoms.ajouterUtilisateur(utilisateur);
        request.setAttribute("utilisateurs",
                tableNoms.recupererUtilisateurs());

        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp")
            .forward(request, response);

    }

}



