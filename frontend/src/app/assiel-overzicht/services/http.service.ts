import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PetI } from '../models/petI';
import { environment } from '../../../environments/environment';


@Injectable({
  providedIn: 'root'
})
export class HttpService {

  overzichtURL = '/api/pet';
  baseUrl = environment.apiUrl;

  constructor(private http: HttpClient) { }

  getOverzicht() {
    return this.http.get<PetI[]>(this.baseUrl+this.overzichtURL);
  }
}
