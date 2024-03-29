import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "server_time", urlPatterns = "/index")
public class server_time extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter ();
        writer.println ( "<html>" );
        Date date = new Date ();
        SimpleDateFormat format = new SimpleDateFormat ( "HH:mm:ss dd-MM-yyy" );
        writer.println ( "</h1>" + format.format ( date ) + "<h1>" );
        writer.println ( "</html>" );
    }
}
