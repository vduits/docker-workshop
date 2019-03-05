import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AssielOverzichtComponent } from './assiel-overzicht/assiel-overzicht.component';

const routes: Routes = [
  {
    path: 'home',
    component: AssielOverzichtComponent
  },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full'
  },
  {
    path: '**',
    redirectTo: 'home'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
