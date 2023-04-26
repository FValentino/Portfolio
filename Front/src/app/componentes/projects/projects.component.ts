import { Component, OnInit } from '@angular/core';

//servicios
import { ExtraerDatosService } from '../../servicios/extraer-datos.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit{

  logo : any

  constructor (private datos : ExtraerDatosService) {}

  ngOnInit(): void {
      
    this.datos.obtenerDatos().subscribe(dato => {
      this.logo = dato.img.portfolio;
    });
  }
}
