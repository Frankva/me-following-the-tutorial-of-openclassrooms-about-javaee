package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Auteur;


public class Test extends HttpServlet {

    public Test() {
        super();
    }

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException
    {        
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

    }

}



