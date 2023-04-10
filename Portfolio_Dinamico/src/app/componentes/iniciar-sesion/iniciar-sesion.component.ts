import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AutenticacionService } from '../../servicios/autenticacion.service';

@Component({
  selector: 'app-iniciar-sesion',
  templateUrl: './iniciar-sesion.component.html',
  styleUrls: ['./iniciar-sesion.component.css']
})
export class IniciarSesionComponent {

  form: FormGroup;

  constructor (private formBuilder:FormBuilder, private aunttenticacionService:AutenticacionService){
    this.form = this.formBuilder.group({
      email:['', [Validators.required, Validators.email]],
      password:['',[Validators.required, Validators.minLength(8)]]
    })
  }

  ngOnInit(): void{
  }

  get Email(){
    return this.form.get('email');
  }

  get Password(){
    return this.form.get('password');
  }
}

