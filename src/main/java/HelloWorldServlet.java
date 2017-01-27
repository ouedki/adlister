
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int count = 1;
        Object counter = req.getParameter(String.valueOf(count));
        if (counter !=null) {
            count = Integer.parseInt((String) counter);
            count++;
        } else {
            count = 1;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, World!</h1>");
        out.println("<p>Page counter: " + count + "</p>");
    }
}
