<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${produit != null ? 'Modifier' : 'Ajouter'} un produit - E-Commerce</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        .sidebar { min-height: 100vh; background: linear-gradient(180deg, #2c3e50 0%, #34495e 100%); }
        .sidebar a { color: rgba(255,255,255,0.8); padding: 12px 20px; display: block; text-decoration: none; transition: all 0.3s; }
        .sidebar a:hover, .sidebar a.active { background: rgba(255,255,255,0.1); color: white; }
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
                    <a href="/api/users"><i class="bi bi-people me-2"></i>Utilisateurs</a>
                    <a href="/api/produits" class="active"><i class="bi bi-box me-2"></i>Produits</a>
                    <a href="/api/achats"><i class="bi bi-cart me-2"></i>Achats</a>
                    <a href="/api/ventes"><i class="bi bi-cash me-2"></i>Ventes</a>
                </nav>
            </div>
            <div class="col-md-10 p-4">
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h2 class="fw-bold">${produit != null ? 'Modifier' : 'Ajouter'} un produit</h2>
                    <div>
                        <a href="/api/produits" class="btn btn-outline-secondary">Retour</a>
                        <a href="/logout" class="btn btn-outline-danger ms-2">Deconnexion</a>
                    </div>
                </div>
                
                <div class="card">
                    <div class="card-body">
                        <form action="${produit != null ? '/api/produits/update' : '/api/produits/save'}" method="post">
                            <c:if test="${produit != null}">
                                <input type="hidden" name="id" value="${produit.id}"/>
                            </c:if>
                            
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="nom" class="form-label">Nom du produit</label>
                                    <input type="text" class="form-control" id="nom" name="nom" 
                                           value="${produit != null ? produit.nom : ''}" required>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label for="prix" class="form-label">Prix (EUR)</label>
                                    <input type="number" step="0.01" class="form-control" id="prix" name="prix" 
                                           value="${produit != null ? produit.prix : ''}" required>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="quantite" class="form-label">Quantite en stock</label>
                                    <input type="number" class="form-control" id="quantite" name="quantite" 
                                           value="${produit != null ? produit.quantite : '0'}" required>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label for="categorie" class="form-label">Categorie</label>
                                    <input type="text" class="form-control" id="categorie" name="categorie" 
                                           value="${produit != null ? produit.categorie : ''}">
                                </div>
                            </div>
                            
                            <div class="mb-3">
                                <label for="description" class="form-label">Description</label>
                                <textarea class="form-control" id="description" name="description" rows="4">${produit != null ? produit.description : ''}</textarea>
                            </div>
                            
                            <div class="d-flex justify-content-end gap-2">
                                <a href="/api/produits" class="btn btn-secondary">Annuler</a>
                                <button type="submit" class="btn btn-primary">
                                    <i class="bi bi-save me-1"></i>Enregistrer
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>