import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:any;
  submitted:boolean = false;
  invalidLogin: boolean = false;
  loginForm: FormGroup;

  constructor(private formBuilder: FormBuilder,  private loginservice: LoginService, private router: Router) { }

  ngOnInit() {

    this.loginForm = this.formBuilder.group({

      emailId: ['demo@gmail.com', Validators.required],
      password: ['welcome', Validators.required]

    });
  }

  
  onSubmit() {
    this.submitted = true;
    let formData = this.loginForm.value;
    this.loginservice.login(formData).subscribe(data => {

      this.user = data;

      if (this.user != undefined && this.user.emailId == this.loginForm.value.emailId) {
        localStorage.setItem("userId", this.user.userId);
        this.router.navigate(['educationList']);
      } 
      
      else {
        this.invalidLogin = true;
      }
    });

  }

}
