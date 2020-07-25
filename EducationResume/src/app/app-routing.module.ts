import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {EducationUpdateComponent} from "./education-update/education-update.component";
import {EducationListComponent} from './education-list/education-list.component';
import {LoginComponent} from './login/login.component';
import {EducationCreateComponent} from './education-create/education-create.component';

const routes: Routes = [{path: "educationUpdate/:educationId", component: EducationUpdateComponent},
                        {path: "educationList", component: EducationListComponent},
                        {path: "educationCreate", component: EducationCreateComponent},
                        {path : 'login', component : LoginComponent},
                        {path : '', component : LoginComponent},
                        {path: '**', component: LoginComponent }
                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
