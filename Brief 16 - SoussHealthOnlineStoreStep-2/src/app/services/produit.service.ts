import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppProd } from '../model/produits.model';
import { AppUser } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  API_URL = "http://localhost:8080/api/produits";

  constructor(private httpclient : HttpClient) { }

   // getAll 
 getProduits() : Observable<AppProd[]>{
  return this.httpclient.get<AppProd[]>(`${this.API_URL}`);
}

  // getById
 getProduitById(id : number) : Observable<AppProd>{
  return this.httpclient.get<AppProd>(`${this.API_URL}/${id}`)
}

 // post
 addProduit(produits : AppProd){
  return this.httpclient.post<AppProd>(`${this.API_URL}`,produits);
}
  // put
 updateProduit(produits : AppProd){
  return this.httpclient.put(`${this.API_URL}/${produits.id}`,produits);
}

 // delete 
 deleteProduit(id : number) : Observable<any>{
  return this.httpclient.delete(`${this.API_URL}/${id}`);
}
}
