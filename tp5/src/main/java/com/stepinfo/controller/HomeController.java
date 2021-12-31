package com.stepinfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeController implements Controller {

   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {

      // response.getWriter().write("Ecriture directe dans HttpServletResponse");
      // return null;
      // puis :
      // return new ModelAndView("/WEB-INF/mes_pages/home.jsp");
      // puis :
      return new ModelAndView("home");
   }

}
