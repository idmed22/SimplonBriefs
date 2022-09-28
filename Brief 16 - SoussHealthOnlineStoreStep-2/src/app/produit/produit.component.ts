import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppProd } from '../model/produits.model';
import { ProduitService } from '../services/produit.service';

@Component({
  selector: 'app-produit',
  templateUrl: './produit.component.html',
  styleUrls: ['./produit.component.css']
})
export class ProduitComponent implements OnInit {
  produits!: AppProd[]; 
  saveProduit : any = {
    id : '',
    nom : '',
    prix : '',
    description : '',
    date_expiration : '',
    quantite_stock : '',
    categorieId : ''
    
  }
  constructor(private produitService : ProduitService , private router : Router) { }

  ngOnInit(): void {
    this.getAllProds();
  }

  //----------------Methode GetAll-------------------

  public  getAllProds(): void{
    this.produitService.getProduits().subscribe(
      (response : AppProd[])=>{
        this.produits = response;
      },
      (error : HttpErrorResponse) =>{
        alert(error.message);
      }
    );
  }

}
