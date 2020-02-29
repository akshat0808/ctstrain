import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  public userForm: FormGroup;

  constructor( private builder:FormBuilder) { }

  ngOnInit(): void {
    this.createForm()
  }

  createForm(){

    this.userForm = this.builder.group({

      'email':[null , Validators.required],
      'subject':[null , [Validators.required , Validators.minLength(10), Validators.maxLength(50)]],
      'message':[null,[Validators.required, Validators.maxLength(200)]]
     
});
  }

  onSubmit(data){
    console.log(data)
  }

}
