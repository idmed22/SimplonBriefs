import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppCateg } from '../model/categorie.model';


@Injectable({
  providedIn: 'root'
})
export class CategorieService {
  API_URL = "http://localhost:8080/api/categories";

  constructor(private httpclient : HttpClient) { }

  // getAll 
 getAllCategories() : Observable<AppCateg[]>{
  return this.httpclient.get<AppCateg[]>(`${this.API_URL}`);
}

  // getById
 getCategorieById(id : number) : Observable<AppCateg>{
  return this.httpclient.get<AppCateg>(`${this.API_URL}/${id}`)
}

 // post
 addCategorie(categories : AppCateg){
  return this.httpclient.post<AppCateg>(`${this.API_URL}`,categories);
}
  // put
 updateCategorie(categories : AppCateg){
  return this.httpclient.put(`${this.API_URL}/${categories.id}`,categories.nom);
}

 // delete 
 deleteCategorie(id : number) : Observable<any>{
  return this.httpclient.delete(`${this.API_URL}/${id}`);
}
}
