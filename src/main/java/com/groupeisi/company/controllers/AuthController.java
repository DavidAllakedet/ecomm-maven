package com.groupeisi.company.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AuthController {

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(HttpServletRequest request) {
        boolean hasError = request.getParameter("error") != null;
        boolean hasLogout = request.getParameter("logout") != null;
        
        return "<!DOCTYPE html>\n" +
            "<html lang=\"fr\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Connexion - E-Commerce</title>\n" +
            "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
            "    <style>\n" +
            "        body {\n" +
            "            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n" +
            "            min-height: 100vh;\n" +
            "            display: flex;\n" +
            "            align-items: center;\n" +
            "            justify-content: center;\n" +
            "        }\n" +
            "        .login-card {\n" +
            "            background: white;\n" +
            "            border-radius: 10px;\n" +
            "            box-shadow: 0 10px 30px rgba(0,0,0,0.2);\n" +
            "            padding: 40px;\n" +
            "            max-width: 400px;\n" +
            "            width: 100%;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "<body>\n" +
            "    <div class=\"login-card\">\n" +
            "        <div class=\"text-center mb-4\">\n" +
            "            <h2 class=\"fw-bold text-primary\">E-Commerce</h2>\n" +
            "            <p class=\"text-muted\">Connectez-vous à votre compte</p>\n" +
            "        </div>\n" +
            (hasError ? "        <div class=\"alert alert-danger\">Email ou mot de passe incorrect.</div>\n" : "") +
            (hasLogout ? "        <div class=\"alert alert-success\">Vous avez été déconnecté avec succès.</div>\n" : "") +
            "        <form action=\"/perform_login\" method=\"post\">\n" +
            "            <div class=\"mb-3\">\n" +
            "                <label for=\"username\" class=\"form-label\">Email</label>\n" +
            "                <input type=\"email\" class=\"form-control\" id=\"username\" name=\"username\" required>\n" +
            "            </div>\n" +
            "            <div class=\"mb-3\">\n" +
            "                <label for=\"password\" class=\"form-label\">Mot de passe</label>\n" +
            "                <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\n" +
            "            </div>\n" +
            "            <button type=\"submit\" class=\"btn btn-primary w-100\">Se connecter</button>\n" +
            "        </form>\n" +
            "        <div class=\"text-center mt-3\">\n" +
            "            <p class=\"text-muted\">Pas de compte? <a href=\"/register\">Créer un compte</a></p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "</html>";
    }
}