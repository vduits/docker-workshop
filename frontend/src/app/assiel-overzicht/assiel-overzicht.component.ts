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
      description: "A good boy",
      image: "https://i.imgur.com/m26AVZW.jpg"
    },
    {
      name: "pookie",
      description: "A housecat with social issues",
      image: "https://i.redd.it/rwe3mpuioqj21.jpg"
    },
    {
      name: "catdog",
      description: "It's a catdog! really!",
      image: "https://images-na.ssl-images-amazon.com/images/I/41kGLopxorL._SX355_.jpg"
    },
    {
      name: "timmie",
      description: "Likes to put his teeth everywhere, but otherwise a very nice rabbit",
      image: "https://i.ytimg.com/vi/8BYa0U1h5Fs/hqdefault.jpg"
    },
    {
      name: "rubyII",
      description: "The better twin",
      image: "https://i.imgur.com/d2mt4M6.jpg"
    },
    {
      name: "rubyV",
      description: "Why did we do this again?",
      image: "http://i.huffpost.com/gen/808414/images/o-NIC-CAGE-PLANE-PHOTO-facebook.jpg"
    },

  ]

  constructor(private HttpService: HttpService) { }

  ngOnInit() {
    // console.log(this.HttpService.getOverzicht().subscribe(myPets => {
    //   this.pets = myPets;
    // }));
  }

}
