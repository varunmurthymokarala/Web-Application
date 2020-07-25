import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class EducationService {

  baseUrl: string = "http://localhost:8071/ResumeApp_ProjectDetails_Sunil/";
  constructor(private httpClient:HttpClient) { }

  getEducationList(){

   return this.httpClient.get(this.baseUrl+"educationList");
  }

  getEducationById(educationId){

    return this.httpClient.get(this.baseUrl+"educationById/" +educationId);
  }

  updateEducation(education){

    return this.httpClient.put(this.baseUrl+"education", education);
  }

  deleteEducation(educationId){

    return this.httpClient.delete(this.baseUrl+"delete/" +educationId);
  }

  createEducation(education){

    return this.httpClient.post(this.baseUrl+"education", education);
  }
}
