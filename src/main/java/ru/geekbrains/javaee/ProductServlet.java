package ru.geekbrains.javaee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {

    private List<Product> products;

    @Override
    public void init(){
        products = new ArrayList<>();
        products.add(new Product(1l, "Demon Souls", 10));
        products.add(new Product(2l, "Dark Souls", 10));
        products.add(new Product(3l, "Dark Souls2", 10));
        products.add(new Product(4l, "Dark Souls3", 10));
        products.add(new Product(5l, "Bloodborne", 10));
        products.add(new Product(6l, "Elden Ring", 10));
        products.add(new Product(7l, "Star Craft", 10));
        products.add(new Product(8l, "Sekiro", 10));
        products.add(new Product(9l, "World of Warcraft", 10));
        products.add(new Product(10l, "World of Warcraft: Wrath of the Lich King", 10));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < products.size(); i++) {
            resp.getWriter().printf("<h1>" + products.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
