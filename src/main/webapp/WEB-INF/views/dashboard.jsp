<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - E-Commerce</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        .sidebar {
            min-height: 100vh;
            background: linear-gradient(180deg, #2c3e50 0%, #34495e 100%);
        }
        .sidebar a {
            color: rgba(255,255,255,0.8);
            padding: 12px 20px;
            display: block;
            text-decoration: none;
            transition: all 0.3s;
        }
        .sidebar a:hover, .sidebar a.active {
            background: rgba(255,255,255,0.1);
            color: white;
        }
        .card {
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            transition: transform 0.2s;
        }
        .card:hover {
            transform: translateY(-5px);
        }
        .stat-icon {
            font-size: 2.5rem;
            opacity: 0.8;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <!-- Sidebar -->
            <div class="col-md-2 sidebar p-0">
                <div class="p-3 text-center border-bottom border-secondary">
                    <h4 class="text-white fw-bold">E-Commerce</h4>
                </div>
                <nav class="mt-3">
                    <a href="/dashboard" class="active"><i class="bi bi-house-door me-2"></i>Dashboard</a>
                    <a href="/users"><i class="bi bi-people me-2"></i>Utilisateurs</a>
                    <a href="/produits"><i class="bi bi-box me-2"></i>Produits</a>
                    <a href="/achats"><i class="bi bi-cart me-2"></i>Achats</a>
                    <a href="/ventes"><i class="bi bi-cash me-2"></i>Ventes</a>
                </nav>
            </div>
            
            <!-- Main Content -->
            <div class="col-md-10 p-4">
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h2 class="fw-bold">Dashboard</h2>
                    <div>
                        <span class="me-3">Bienvenue, <strong>Admin</strong></span>
                        <a href="/logout" class="btn btn-outline-danger btn-sm">
                            <i class="bi bi-box-arrow-right me-1"></i>Deconnexion
                        </a>
                    </div>
                </div>
                
                <!-- Stats Cards -->
                <div class="row mb-4">
                    <div class="col-md-3">
                        <div class="card bg-primary text-white p-3">
                            <div class="d-flex justify-content-between align-items-center">
                                <div>
                                    <h6 class="mb-0">Utilisateurs</h6>
                                    <h2 class="mb-0">0</h2>
                                </div>
                                <i class="bi bi-people stat-icon"></i>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card bg-success text-white p-3">
                            <div class="d-flex justify-content-between align-items-center">
                                <div>
                                    <h6 class="mb-0">Produits</h6>
                                    <h2 class="mb-0">0</h2>
                                </div>
                                <i class="bi bi-box stat-icon"></i>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card bg-warning text-white p-3">
                            <div class="d-flex justify-content-between align-items-center">
                                <div>
                                    <h6 class="mb-0">Achats</h6>
                                    <h2 class="mb-0">0</h2>
                                </div>
                                <i class="bi bi-cart stat-icon"></i>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card bg-info text-white p-3">
                            <div class="d-flex justify-content-between align-items-center">
                                <div>
                                    <h6 class="mb-0">Ventes</h6>
                                    <h2 class="mb-0">0</h2>
                                </div>
                                <i class="bi bi-cash stat-icon"></i>
                            </div>
                        </div>
                    </div>
                </div>
                
                <!-- Quick Actions -->
                <div class="row">
                    <div class="col-md-6">
                        <div class="card p-4">
                            <h5 class="fw-bold mb-3"><i class="bi bi-plus-circle me-2"></i>Actions rapides</h5>
                            <div class="d-grid gap-2">
                                <a href="/api/produits" class="btn btn-outline-primary">Ajouter un produit</a>
                                <a href="/api/achats" class="btn btn-outline-success">Enregistrer un achat</a>
                                <a href="/api/ventes" class="btn btn-outline-warning">Enregistrer une vente</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card p-4">
                            <h5 class="fw-bold mb-3"><i class="bi bi-info-circle me-2"></i>Informations</h5>
                            <p class="text-muted">Bienvenue dans votre application E-Commerce. Utilisez le menu de navigation pour acceder aux differentes sections:</p>
                            <ul class="text-muted">
                                <li><strong>Utilisateurs:</strong> Gestion des utilisateurs</li>
                                <li><strong>Produits:</strong> Catalogue de produits</li>
                                <li><strong>Achats:</strong> Suivi des achats</li>
                                <li><strong>Ventes:</strong> Suivi des ventes</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>