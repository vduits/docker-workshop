import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PetI } from '../models/petI';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  overzichtURL = 'api/puppy';

  constructor(private http: HttpClient) { }

  getOverzicht() {
    return this.http.get<PetI[]>(this.overzichtURL);
  }
}
