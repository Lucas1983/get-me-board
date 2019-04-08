import { Component, OnInit } from '@angular/core';
import {EquipmentComponent} from "../equipment.component";

@Component({
  selector: 'board-comp',
  templateUrl: './board.component.html',
  styleUrls: ['./board.component.css']
})
export class BoardComponent  extends EquipmentComponent implements OnInit {

  // constructor(id, name, brand, model) {
  //     super(id, name, brand, model);
  // }

    ngOnInit() {
  }

}
