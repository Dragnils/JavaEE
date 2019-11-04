import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //Session
        HttpSession session = request.getSession();

        String user = (String)session.getAttribute("curent_user"); // авторизация пользователя

        if(user == null){
            //responce для анонимного пользователя
            // авторизация
            //регистрация
            //session.setAttribute("current_user", ID);
        }else {
            // responce для аворизованного пользователя
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        some.Cart cart = (some.Cart) session.getAttribute("cart"); // корзина в интернет магазине
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if(cart == null){
            cart = new some.Cart();

            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart); // сесия для пользователя

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Integer count = (Integer) session.getAttribute("count"); // получем значение которе нужно положить в счетчик
        if(count == null){ //если пользователь зашел в первый раз на страницу
            session.setAttribute("count", 1);
            count = 1;
        }else{
            session.setAttribute("count", count + 1);// хотим указать счетчик, который хранит кол-во посещений на странице
        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       // String name = request.getParameter("name"); //?name=""&surname="" - прописываем в браузере после полного Url
      //  String surname = request.getParameter("surname");

      /*  PrintWriter pw = response.getWriter(); // с помощью .getWriter() мы получаем объект PrintWriter, и с помощью данного объекта можем писать в наш responce

        pw.println("<html>");
        pw.println("<h2> Test Servlet  </h2>");
        pw.println("<h2> Your count is: " + count + " </h2>");
        //pw.println("<h2> Hello, " + name + " " + surname + "  </h2>");
        pw.println("</html>");*/

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response); // передаем сесию в showCart.jsp

       // response.sendRedirect("/JavaEETest_war_exploded/hello-world-jsp");//Redirect
       /* RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJsp.jsp"); // forward перенаправляет только на внутринени страницы, на внешние не может
        dispatcher.forward(request, response);*/
    }
}
