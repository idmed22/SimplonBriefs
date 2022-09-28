import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AppCateg } from '../model/categorie.model';
import { CategorieService } from '../services/categorie.service';

@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {
  categories!: AppCateg[]; 
  saveCategorie : any = {
    id : '',
    nom : ''
  }
  myCondition = false;
  constructor(private categorieService : CategorieService , router : Router) { }

  ngOnInit(): void {
    this.getAllCateg();
  }


  //----------------Methode GetAll-------------------

  public  getAllCateg(): void{
    this.categorieService.getAllCategories().subscribe(
      (response : AppCateg[])=>{
        this.categories = response;
      },
      (error : HttpErrorResponse) =>{
        alert(error.message);
      }
    );
  }

  // -----------------Methode delete -------------------

  handleDeleteCategorie(id : number) {
    let conf = confirm("Are you sure ?");
    if(conf == false) return;
    this.categorieService.deleteCategorie(id)
    .subscribe(() => {
      this.categories = this.categories.filter(c => c.id != id)

      })
   }

    // ---------------Methode post-------------------

    handleAddCategorie(){
    
      this.categorieService.addCategorie(this.saveCategorie)
      .subscribe((c) => {
        this.categories = [c, ...this.categories]
        this.vidInput();
   })
   }

   //---------------Methode update------------------

   handleUpdateBtn(c: any){ 
    this.categories = c;
    this.myCondition = true;
   }

   UpdateCategorie(){
    this.categorieService.updateCategorie(this.saveCategorie)
    .subscribe(categorie =>{
      this.vidInput();
      this.myCondition = false;
    })
   }


   // Pour vider les inputs
   
   vidInput(){
    this.saveCategorie = {
      id : '',
      nom : ''

    }
   }

}
