import { Component, OnInit } from '@angular/core';
import { HttpService } from './services/http.service';

@Component({
  selector: 'app-assiel-overzicht',
  templateUrl: './assiel-overzicht.component.html',
  styleUrls: ['./assiel-overzicht.component.scss']
})
export class AssielOverzichtComponent implements OnInit {
  pets = [
    {
      name: "ruby",
      description: "A good boy"
    },
    {
      name: "pookie",
      description: "A housecat with social issues"
    },
    {
      name: "catdog",
      description: "It's a catdog! really!"
    },
    {
      name: "timmie",
      description: "Likes to put his teeth everywhere, but otherwise a very nice rabbit"
    },
    {
      name: "rubyII",
      description: "The better twin"
    },
    {
      name: "rubyIII",
      description: "Why did we do this again?"
    },

  ]

  constructor(private HttpService: HttpService) { }

  ngOnInit() {
    // console.log(this.HttpService.getOverzicht().subscribe(myPets => {
    //   this.pets = myPets;
    // }));
  }

}
