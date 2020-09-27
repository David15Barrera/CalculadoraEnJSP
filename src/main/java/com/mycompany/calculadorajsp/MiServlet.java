/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
David 201931344 Universidad San Carlos de GUatemala
 */
package com.mycompany.calculadorajsp;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dav
 */
@WebServlet(name = "MiServlet", urlPatterns = {"/MiServlet"})
public class MiServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MiServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Mi Calculadora</title>");            
            out.println("</head>");
            out.println("<body>");
                String num1 = request.getParameter("txtNum1");
                String num2 = request.getParameter("txtNum2");
                String btnSumar = request.getParameter("btnSumar");
                String btnMulti = request.getParameter("btnMultiplicar");
                String btnMayoMen = request.getParameter("btnMayorMenor");
                String btnPote = request.getParameter("btnPotencia");
                String btnBina = request.getParameter("btnBinario");

                   if(btnSumar != null){
                        int resultado = Integer.parseInt(num1) + Integer.parseInt(num2);
                        out.println("El resultado de la operacion es: "+ resultado);                
                    } 
                    if(btnMulti != null){
                        int resultado = Integer.parseInt(num1) * Integer.parseInt(num2);
                        out.println("El resultado de la operacion es: "+ resultado);
                    }
                    if(btnMayoMen != null){
                        if (Integer.parseInt(num1) < Integer.parseInt(num2)) {
                        int resultado = Integer.parseInt(num2);
                        int segundo = Integer.parseInt(num1);
                       out.println("El numero mayor es "+ resultado);
                       out.println(" El numero menor es "+ segundo);
                        }
                        if (Integer.parseInt(num1) > Integer.parseInt(num2)) {
                        int resultado = Integer.parseInt(num1);
                        int segundo = Integer.parseInt(num2);
                        out.println(" El numero mayor es "+ resultado);
                        out.println("\n");
                        out.println(" El numero menor es "+ segundo);
                        }else{
                        int resultado = Integer.parseInt(num1);
                        out.println("El numero "+ resultado+" es el mismo");
                        }                       
                    }
                    if(btnPote != null){
                    int resultado = (int) Math.pow(Integer.parseInt(num1), Integer.parseInt(num2));
                    out.println("El resultado elevar el numero es: "+ resultado);
                    }
                    if(btnBina != null){
                        int numero = Integer.parseInt(num1);
                        int numero2 = Integer.parseInt(num2);
                        int exp, exp2, digito, digito2;
                        double binario, binario2;
                        while(numero < 0);
                        while (numero2 < 0); 
                        exp=0;
                        exp2=0;
                        binario=0;
                        binario2=0;
                        while(numero!=0){
                        digito = numero % 2;           
                        binario = binario + digito * Math.pow(10, exp);                                                   
                        exp++;
                        numero = numero/2;
                        
                      }while(numero2!=0){
                        digito2 = numero2 % 2;           
                        binario2 = binario2 + digito2 * Math.pow(10, exp2);                                                   
                        exp2++;
                        numero2 = numero2/2;
                      }
                         out.println("El numero binario de "+Integer.parseInt(num1)+" es : "+ binario);
                         out.println("El numero binario de "+Integer.parseInt(num2)+" es : "+ binario2);
                    
        }

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
