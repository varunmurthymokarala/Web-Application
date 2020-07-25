import { Component, OnInit } from '@angular/core';
import { EducationService } from '../education.service';
import { Routes, RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-education-list',
  templateUrl: './education-list.component.html',
  styleUrls: ['./education-list.component.css']
})
export class EducationListComponent implements OnInit {

  education:any;
  educationList: any;
 
  constructor(private educationService: EducationService, private router:Router) { }

  ngOnInit() {

    this.getEducation();
 
}

  getEducation(){
    
    this.educationService.getEducationList().subscribe(data =>{

      this.educationList = data;
    })
  }
  
  updateEducation(education){

    this.router.navigate(["educationUpdate", education.educationId]);
  }

  deleteEducation(education){

    this.educationService.deleteEducation(education.educationId).subscribe(data=> {

      this.getEducation();
      
    })
  }

  createEducation(education){

    this.router.navigate(["educationCreate"]);

    }

  }
