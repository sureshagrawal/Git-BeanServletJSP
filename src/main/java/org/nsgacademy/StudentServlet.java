package org.nsgacademy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Student student = new Student();
        student.setName(req.getParameter("name"));
        student.setAge(Integer.parseInt(req.getParameter("age")));

        req.setAttribute("studentBean",student);

        req.getRequestDispatcher("display.jsp").forward(req,resp);

    }
}
