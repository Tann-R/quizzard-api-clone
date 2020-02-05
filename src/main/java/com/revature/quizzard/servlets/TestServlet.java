package com.revature.quizzard.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet ("/test")
public class TestServlet extends HttpServlet {
    System.out.println("This is a test.")
}