package io.github.positoy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.getWriter().println("<html>\n"
                + "<head>\n" +
                "<title>hello servlet!</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Hello Servlet!</h1>\n" +
                "</body>\n" +
                "</html>\n");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
