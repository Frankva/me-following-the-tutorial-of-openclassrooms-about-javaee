import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

    public Test() {
        super();
    }

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException
    {        
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp")
            .forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws IOException, ServletException
    {

    }

}



