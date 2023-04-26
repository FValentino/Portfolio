import { Component,OnInit } from '@angular/core';

//servicios
import { ExtraerDatosService } from '../../servicios/extraer-datos.service';

@Component({
  selector: 'app-technologies',
  templateUrl: './technologies.component.html',
  styleUrls: ['./technologies.component.css']
})
export class TechnologiesComponent implements OnInit{

  technologies : any;
  
  constructor(private datos : ExtraerDatosService) {}

  ngOnInit(): void {
      this.datos.obtenerDatos().subscribe(dato => {
        this.technologies = dato.img.technologies;
      });
  }

}
