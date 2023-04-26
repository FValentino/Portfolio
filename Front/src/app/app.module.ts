import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HeaderComponent } from './componentes/header/header.component';
import { HeroComponent } from './componentes/hero/hero.component';
import { AboutComponent } from './componentes/about/about.component';
import { TechnologiesComponent } from './componentes/technologies/technologies.component';
import { ProjectsComponent } from './componentes/projects/projects.component';
import { ContactComponent } from './componentes/contact/contact.component';
import { PortfolioComponent } from './componentes/portfolio/portfolio.component';
import { HttpClientModule } from '@angular/common/http'

//Formulario
import { ReactiveFormsModule} from '@angular/forms';

//servicios
import { CargarScriptService } from './servicios/cargar-script.service';
import { ExtraerDatosService } from './servicios/extraer-datos.service';
import { CommonModule } from '@angular/common';
import { EducationComponent } from './componentes/education/education.component';
import { LoginComponent } from './componentes/login/login.component';
import { IniciarSesionComponent } from './componentes/iniciar-sesion/iniciar-sesion.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HeroComponent,
    AboutComponent,
    TechnologiesComponent,
    ProjectsComponent,
    ContactComponent,
    PortfolioComponent,
    EducationComponent,
    LoginComponent,
    IniciarSesionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    CommonModule
  ],
  providers: [CargarScriptService, ExtraerDatosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
