<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des produits - E-Commerce</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        .sidebar { min-height: 100vh; background: linear-gradient(180deg, #2c3e50 0%, #34495e 100%); }
        .sidebar a { color: rgba(255,255,255,0.8); padding: 12px 20px; display: block; text-decoration: none; transition: all 0.3s; }
        .sidebar a:hover, .sidebar a.active { background: rgba(255,255,255,0.1); color: white; }
        .product-img { width: 50px; height: 50px; object-fit: cover; border-radius: 5px; }
    </style>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-2 sidebar p-0">
                <div class="p-3 text-center border-bottom border-secondary">
                    <h4 class="text-white fw-bold">E-Commerce</h4>
                </div>
                <nav class="mt-3">
                    <a href="/dashboard"><i class="bi bi-house-door me-2"></i>Dashboard</a>
                    <a href="/users"><i class="bi bi-people me-2"></i>Utilisateurs</a>
                    <a href="/produits" class="active"><i class="bi bi-box me-2"></i>Produits</a>
                    <a href="/achats"><i class="bi bi-cart me-2"></i>Achats</a>
                    <a href="/ventes"><i class="bi bi-cash me-2"></i>Ventes</a>
                </nav>
            </div>
            <div class="col-md-10 p-4">
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h2 class="fw-bold">Gestion des produits</h2>
                    <div>
                        <a href="/dashboard" class="btn btn-outline-secondary me-2">Retour</a>
                        <a href="/produits/form" class="btn btn-primary"><i class="bi bi-plus-circle me-1"></i>Ajouter un produit</a>
                        <a href="/logout" class="btn btn-outline-danger ms-2">Deconnexion</a>
                    </div>
                </div>
                
                <div class="card">
                    <div class="card-header">
                        <h5 class="mb-0">Catalogue des produits</h5>
                    </div>
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead class="table-light">
                                <tr>
                                    <th>ID</th>
                                    <th>Nom</th>
                                    <th>Description</th>
                                    <th>Prix</th>
                                    <th>Quantite</th>
                                    <th>Date creation</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="produit" items="${produits}">
                                    <tr>
                                        <td>${produit.id}</td>
                                        <td><strong>${produit.nom}</strong></td>
                                        <td>${produit.description}</td>
                                        <td><fmt:formatNumber value="${produit.prix}" pattern="#,##0.00"/> EUR</td>
                                        <td>${produit.quantite}</td>
                                        <td><fmt:formatDate value="${produit.createdAt}" pattern="dd/MM/yyyy"/></td>
                                        <td>
                                            <a href="/api/produits/edit/${produit.id}" class="btn btn-sm btn-outline-primary me-1"><i class="bi bi-pencil"></i></a>
                                            <button class="btn btn-sm btn-outline-danger"><i class="bi bi-trash"></i></button>
                                        </td>
                                    </tr>
                                </c:forEach>
                                <c:if test="${empty produits}">
                                    <tr>
                                        <td colspan="7" class="text-center text-muted">Aucun produit disponible.</td>
                                    </tr>
                                </c:if>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>