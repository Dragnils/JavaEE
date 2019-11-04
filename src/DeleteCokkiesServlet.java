import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteCokkiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", ""); // перезаписываем cookie в браузере клиента

        cookie.setMaxAge(0); // удалил cookie
       // cookie.setMaxAge(-1);// будет удалятся тогда когда клиент закроет браузер

        response.addCookie(cookie);
    }
}
