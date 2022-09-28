import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategorieComponent } from '../categorie/categorie.component';
import { CommandeComponent } from '../commande/commande.component';
import { ProduitComponent } from '../produit/produit.component';
import { UsersComponent } from '../users/users.component';


const routes: Routes = [
  { path: 'users', component: UsersComponent },
  { path: 'produits', component: ProduitComponent },
  { path: 'commands', component: CommandeComponent },
  { path: 'categorie', component: CategorieComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }