package com.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletOne", urlPatterns = "/create")
public class ServletOne extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Product.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: ServletOne");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            Product p = new Product(i,"Product"+i, 1.38*i);
            resp.getWriter().printf("<h1>" + p.toString() + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
    }
}
