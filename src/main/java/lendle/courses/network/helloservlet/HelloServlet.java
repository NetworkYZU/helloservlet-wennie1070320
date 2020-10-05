/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lendle
 */
@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"}) // "/"表示路徑(網址)的最後
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");   //當文字來處理(網頁會出現的內容型態)
        try(PrintWriter out=resp.getWriter()){
            //輸出
            out.println("<html>");// <html>
            out.println("<body>");// <body>
            out.println(req.getRequestURI());//  <h1>Hello!</h1> //連接主機和網址
            out.println("<body>");// </body>
            out.println("<html>");// </html>
        }
    }
    
}
