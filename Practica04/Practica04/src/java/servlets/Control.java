package servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import beans.Usuario;

public class Control extends HttpServlet {
    
    private Usuario usuario;
    
    public Control(){
        usuario = new Usuario();
    }
   
    /** Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        usuario.setUsuario(request.getParameter("user"));
        usuario.setEmail(request.getParameter("correo"));
        usuario.setPassword(request.getParameter("pass"));
        
        request.setCharacterEncoding("UTF-8");
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        String DOCTYPE = "<!DOCTYPE html>";

        out.println(DOCTYPE + "\n" +
                "<html>\n" +
                "<head><title>FormularioPost</title>\n" +
                "<link rel=\"stylesheet\" href=\"css/estilo_tareas.css\">" +
                "<meta charset=\"UTF-8\"></head>\n" +    
                "<body>\n" +
                "<h1>Formulario de Post</h1>\n");
        out.println("­<h2>Has sido registrado correctamente.</h2>");
        out.println("<ul>");
        out.println("<li>Usuario: " + usuario.getUsuario() + "</li>");
        out.println("<li>Correo: " + usuario.getEmail() + "</li>");
        out.println("<li>Password: " + usuario.getPassword() + "</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
    
    /** Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType( "text/html" );
        PrintWriter out = response.getWriter();
        String DOCTYPE = "<!DOCTYPE html>";

        out.println(DOCTYPE + "\n" +
                "<html>\n" +
                "<head><title>FormularioGet</title>\n" +
                "<link rel=\"stylesheet\" href=\"css/estilo_tareas.css\">" +
                "<meta charset=\"UTF-8\"></head>\n" +    
                "<body>\n" +
                "<h1>Formulario de Get</h1>\n");
        
        if (usuario.getUsuario().equals(request.getParameter("user"))){
            if (usuario.getPassword().equals(request.getParameter("pass"))){
                out.println("<h3>Bienvenido " + usuario.getUsuario() + "</h3>");
                out.println("<p>Tu correo es: " + usuario.getEmail() + "</p>");
            } else {
                out.println("<p>Lo sentimos " + usuario.getUsuario() + 
                        " tu contraseña es incorrecta");
            }
        } else {
            out.println("<p>No estás registrado</p>");
        }
        out.println("</body></html>");
    }
}
