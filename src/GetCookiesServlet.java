import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies(); // полкчаем отбраузра клиента через запрос от клиента cookies

        PrintWriter prw = response.getWriter();
        prw.println("<html>");

        for (Cookie cookie: cookies){
            prw.println("<h1>" + cookie.getName() + ":" + cookie.getValue() + "</h1>");
        }

        prw.println("</html>");
    }
}
