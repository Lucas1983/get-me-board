import { Component, OnInit } from '@angular/core';
import {EquipmentComponent} from "../equipment.component";

@Component({
  selector: 'bindings-comp',
  templateUrl: './bindings.component.html',
  styleUrls: ['./bindings.component.css']
})
export class BindingsComponent  extends EquipmentComponent implements OnInit {

    // constructor(id, name, brand, model) {
    //     super(id, name, brand, model);
    // }

    ngOnInit() {
  }

}
