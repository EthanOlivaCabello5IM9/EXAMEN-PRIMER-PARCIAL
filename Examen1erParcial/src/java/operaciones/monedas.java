package operaciones;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   monedas extends   HttpServlet
{
@Override
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double  n1,result;
    int     operacion;

    try (ServletOutputStream out = res.getOutputStream()) {
        n1   =   Double.parseDouble(req.getParameter("num1"));
        operacion = Integer.parseInt(req.getParameter("ope"));
        
        result  =  calcularRes(n1,operacion);
        
        out.println("<html>");
        out.println("<head><title>.:CalculadoraServlet:.</title></head>");
        out.println("<body>");
        out.println("<h1><center>El resultado es</center></h1>");
        out.println("<h2>   <b><center>"+  result   +"</center></b></h2>");
        out.println("<a href=\"index.html\">Regresar</a>");
        out.println("</body>");
        out.println("</html>");
    }
    }

    public   double   calcularRes(double   n1,   int   operacion)
    {
    double   result=0;

        switch(operacion)
        {
            case 1:
            return n1/30;
            
        case   2:
            return   n1*30;
        }

    return   result;
    }


}

 
