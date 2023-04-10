import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';

@Injectable({
  providedIn: 'root'
})
export class AutenticacionService {

  url="http//npinti.ddns.net:9000/api/auth/login"
  curretnUserSubject: BehaviorSubject <any>;

  constructor(private http: HttpClient) { 
    console.log("El servicio de autenticacion funciona");
    this.curretnUserSubject = new BehaviorSubject<any> (JSON.parse(sessionStorage.getItem('currentUser') || '{}'));
  }

  IniciarSesion(credenciales: any):Observable<any>{
    return this.http.post(this.url, credenciales).pipe(map(data => {
      sessionStorage.setItem('currentUser', JSON.stringify(data));
      
      return data;
    }))
  }
}
