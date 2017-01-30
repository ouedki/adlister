
import sun.rmi.rmic.iiop.Type;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        int count = 0;
        Object counter = req.getAttribute(String.valueOf(count));
        PrintWriter out = res.getWriter();

        if (name !=null) {
            out.println("<h1>Hello, " + name + "</h1>");
        } else {
            out.println("<h1>Hello, World!</h1>");
        }

        if (counter !=null) {
            count = Integer.parseInt((String) counter);
            count++;
        } else {
            count = 1;
        }
        out.println("<p>Page counter: " + count + "</p>");
    }
}
