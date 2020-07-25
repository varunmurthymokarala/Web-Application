import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EducationListComponent } from './education-list/education-list.component';
import { EducationUpdateComponent } from './education-update/education-update.component';
import { EducationDeleteComponent } from './education-delete/education-delete.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EducationService } from './education.service';
import { LoginComponent } from './login/login.component';
import { EducationCreateComponent } from './education-create/education-create.component';

@NgModule({
  declarations: [
    AppComponent,
    EducationListComponent,
    EducationUpdateComponent,
    EducationDeleteComponent,
    LoginComponent,
    EducationCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [EducationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
