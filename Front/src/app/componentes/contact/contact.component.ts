import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

//formulario
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms'

//servicios
import { ExtraerDatosService } from '../../servicios/extraer-datos.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit{

  form: FormGroup;  
  contacto : any;

  constructor(private datos: ExtraerDatosService, private formBuilder: FormBuilder, private http: HttpClient) {
    this.form= this.formBuilder.group({
      email:['',[Validators.required, Validators.email]],
      nombre:['',[Validators.required]],
      asunto:['',[Validators.required]],
      mensaje:['',[Validators.required]]
    });
  }

  ngOnInit(): void {
      this.datos.obtenerDatos().subscribe(dato => {
        this.contacto = dato.yo.contacto;
      });
  }

  enviarCorreo(){
    let correo = {
      email: this.form.value.email,
      nombre: this.form.value.nombre,
      asunto: this.form.value.asunto,
      msj: this.form.value.mensaje
    };

    this.http.post('http://localhost:4200', correo).subscribe(envio => {
      console.log(envio);
    });
  }

}
