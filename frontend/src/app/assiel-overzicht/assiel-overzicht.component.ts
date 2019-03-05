import { Component, OnInit } from '@angular/core';
import { HttpService } from './services/http.service';

@Component({
  selector: 'app-assiel-overzicht',
  templateUrl: './assiel-overzicht.component.html',
  styleUrls: ['./assiel-overzicht.component.scss']
})
export class AssielOverzichtComponent implements OnInit {
  pets = []

  constructor(private HttpService: HttpService) { }

  ngOnInit() {
    this.HttpService.getOverzicht().subscribe(myPets => {
      this.pets = myPets;
    })
  }

}
