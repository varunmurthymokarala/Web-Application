import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseUrl : string = "http://localhost:8071/ResumeApp_ProjectDetails_Sunil/";
  constructor(private httpClient: HttpClient) { }

  login(user){

    return this.httpClient.post(this.baseUrl+"userLogin", user);
  }
}
