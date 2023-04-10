import { Component, OnInit } from '@angular/core';
import { ExtraerDatosService } from '../../servicios/extraer-datos.service';

@Component({
  selector: 'app-hero',
  templateUrl: './hero.component.html',
  styleUrls: ['./hero.component.css']
})
export class HeroComponent implements OnInit {

  yo : any;
  img : any;

  constructor (private datos:ExtraerDatosService) {}

  ngOnInit(): void {
      this.datos.obtenerDatos().subscribe(dato => {
        this.yo = dato.yo;
        this.img = dato.img.profile;
      });
  }
}
