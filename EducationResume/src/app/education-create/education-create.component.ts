import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EducationService } from '../education.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-education-create',
  templateUrl: './education-create.component.html',
  styleUrls: ['./education-create.component.css']
})
export class EducationCreateComponent implements OnInit {

  education: any;
  createForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private educationService: EducationService, private router:Router) { }

  ngOnInit(){

    this.createForm = this.formBuilder.group({

      specilization:['', Validators.required],
      marks: ['', Validators.required],
      yearofPassing: ['', Validators.required],
      startYear: ['', Validators.required],
      qualificationId : ['', Validators.required],
      userId: ['', Validators.required]
    });
  }

  onSubmit(){
  let userId=localStorage.getItem("userId");
  let education=this.createForm.value;
  education.userId=userId;
    this.educationService.createEducation(education).subscribe( data=> {

      this.education = data;

      this.router.navigate(["educationList"]);
    })
  }

}
