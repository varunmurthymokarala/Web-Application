import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { EducationService } from '../education.service';

@Component({
  selector: 'app-education-update',
  templateUrl: './education-update.component.html',
  styleUrls: ['./education-update.component.css']
})
export class EducationUpdateComponent implements OnInit {

  education: any;
  educationId: string;
  updateForm: FormGroup;
  constructor(private formBuilder: FormBuilder, private rtr: ActivatedRoute, private router:Router, private educationService: EducationService) { }

  ngOnInit() {

    this.rtr.params.subscribe(params => {

      this.educationId = params['educationId'];
  
    });

    this.updateForm = this.formBuilder.group({

      educationId:[''],
      specilization:['', Validators.required],
      marks: ['', Validators.required],
      yearofPassing: ['', Validators.required],
      startYear: ['', Validators.required],
      qualificationId : ['', Validators.required],
      userId: ['', Validators.required]
    });

    this.educationService.getEducationById(this.educationId).subscribe(data=>{

      this.education = data;
      this.updateForm.setValue(this.education);
    })
  }

  onSubmit(){

    this.educationService.updateEducation(this.updateForm.value).subscribe(data=>{

      this.education = data;

      this.router.navigate(["educationList"]);
    })
  }

}
