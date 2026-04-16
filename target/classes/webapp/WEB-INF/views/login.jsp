<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion - E-Commerce</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .login-card {
            background: white;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            padding: 40px;
            max-width: 400px;
            width: 100%;
        }
        .form-control:focus {
            border-color: #667eea;
            box-shadow: 0 0 0 0.25rem rgba(102, 126, 234, 0.25);
        }
        .btn-primary {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            border: none;
        }
        .btn-primary:hover {
            background: linear-gradient(135deg, #5a6fd6 0%, #6a4190 100%);
        }
    </style>
</head>
<body>
    <div class="login-card">
        <div class="text-center mb-4">
            <h2 class="fw-bold text-primary">E-Commerce</h2>
            <p class="text-muted">Connectez-vous a votre compte</p>
        </div>
        
        <c:if test="${param.error != null}">
            <div class="alert alert-danger">Email ou mot de passe incorrect.</div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="alert alert-success">Vous avez ete deconnecte avec succes.</div>
        </c:if>
        
        <form action="/perform_login" method="post">
            <div class="mb-3">
                <label for="username" class="form-label">Email</label>
                <input type="email" class="form-control" id="username" name="username" 
                       placeholder="Entrez votre email" required autofocus>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Mot de passe</label>
                <input type="password" class="form-control" id="password" name="password" 
                       placeholder="Entrez votre mot de passe" required>
            </div>
            <div class="d-grid">
                <button type="submit" class="btn btn-primary btn-lg">Se connecter</button>
            </div>
        </form>
        
        <div class="text-center mt-3">
            <p class="text-muted">Pas de compte? <a href="/register" class="text-primary">Creer un compte</a></p>
        </div>
    </div>
</body>
</html>