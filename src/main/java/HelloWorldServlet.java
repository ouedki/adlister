
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int count = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        count+=1;
        res.setContentType("text/html");
        String name = req.getParameter("name");
        PrintWriter out = res.getWriter();

        if (name != null) {
            out.println("<h1>Hello, " + name + "</h1>");
        } else {
            out.println("<h1>Hello, World!</h1>");
        }

        out.println("<p>Page counter: " + count + "</p>");
    }
}

