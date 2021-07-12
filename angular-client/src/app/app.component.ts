import { Component } from '@angular/core';
import { HelloWorldService } from 'src/app/services/hello-world.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  constructor(client: HelloWorldService) {
    client.hello('Hello');
  }
}
