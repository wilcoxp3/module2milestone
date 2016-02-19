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
        resp.getWriter().println("<!DOCTYPE html><html><head></head><body>");
        InventoryManager invMan = new InventoryManager();
        for (Product p : invMan.getProductList()) {
            resp.getWriter().println(p);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String upc = req.getParameter("upc");
        String shortDetails = req.getParameter("shortDetails");
        String longDetails = req.getParameter("longDetails");
        String price = req.getParameter("price");
        String stock = req.getParameter("stock");
    }

}
