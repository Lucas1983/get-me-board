import { Component, OnInit } from '@angular/core';
import {EquipmentComponent} from "../equipment.component";

@Component({
  selector: 'boots-comp',
  templateUrl: './boots.component.html',
  styleUrls: ['./boots.component.css']
})
export class BootsComponent extends EquipmentComponent implements OnInit {

  // constructor(id, name, brand, model) {
  //     super(id, name, brand, model);
  // }

    ngOnInit() {
  }

}
