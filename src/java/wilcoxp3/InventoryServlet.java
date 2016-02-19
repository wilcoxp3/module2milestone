package wilcoxp3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wilcoxp3
 */
@WebServlet("/inventory")
public class InventoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usersName = "World";
        String html = "<!DOCTYPE><html><body><h1>Hello</h1></body></html>";
        resp.getWriter().println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usersName = req.getParameter("usersName");

        String html = "<!DOCTYPE><html><body><h1>Hello&nbsp"
                + usersName + "</h1></body></html>";
        resp.getWriter().println(html);
    }

}
