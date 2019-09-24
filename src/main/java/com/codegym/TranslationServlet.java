package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String translation = "<head>\n" +
                "    <title>Simple Dictionary</title>\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Vietnamese Dictionary</h2>\n" +
                "<form method=\"post\" action=\"/translate\">\n" +
                "    <input type=\"text\" name=\"txtSearch\" placeholder=\"Enter your word: \"/>\n" +
                "    <input type = \"submit\" id = \"submit\" value = \"Search\"/>\n" +
                "</form>\n" +
                "</body>";
        resp.getOutputStream().println(translation);
        resp.setContentType("text/html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("txtSearch");
        String output = "";
        switch (input){
            case "hello":
                output ="Xin Chào";
                break;
            case "how":
                output ="Thế nào";
                break;
            case "book":
                output ="Sách";
                break;
            case "computer":
                output ="Máy Tính";
                break;
            default:
                output="not found";
                break;
        }
        resp.getOutputStream().println(output);
    }
}
