import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QuestionsListComponent } from './questions-list/questions-list.component';
import { ReviewComponent } from './review/review.component';


const routes: Routes = [
  {path: 'questions-list',component:QuestionsListComponent},
  {path: 'review', component:ReviewComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
