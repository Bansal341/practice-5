import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded credentials
        if (username.equals("admin") && password.equals("12345")) {
            out.println("<h3>Welcome, " + username + "!</h3>");
        } else {
            out.println("<h3>Invalid Credentials! Try again.</h3>");
        }
    }
}
