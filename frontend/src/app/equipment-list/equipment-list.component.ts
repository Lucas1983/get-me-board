import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { AppComponent } from "../app.component";
import {EquipmentComponent} from "../equipment/equipment.component";
import {EquipmentType} from "../eqt.enum";

@Component({
  selector: 'equipment-list-comp',
  templateUrl: './equipment-list.component.html',
  styleUrls: ['./equipment-list.component.css']
})
export class EquipmentListComponent implements OnInit {

  @Input() app;

  equipmentList;

  bootsList = [
      {id: 1, type: EquipmentType.BOOTS, name: 'Boots1',brand: 'Brand',model: 'Model'},
      {id: 2, type: EquipmentType.BOOTS, name: 'Boots2',brand: 'Brand',model: 'Model'},
      {id: 3, type: EquipmentType.BOOTS, name: 'Boots3',brand: 'Brand',model: 'Model'},
      {id: 4, type: EquipmentType.BOOTS, name: 'Boots4',brand: 'Brand',model: 'Model'},
      {id: 5, type: EquipmentType.BOOTS, name: 'Boots5',brand: 'Brand',model: 'Model'},
  ];
  bindingsList = [
      {id: 1, type: EquipmentType.BINDINGS, name: 'Bindings1',brand: 'Brand',model: 'Model'},
      {id: 2, type: EquipmentType.BINDINGS, name: 'Bindings2',brand: 'Brand',model: 'Model'},
      {id: 3, type: EquipmentType.BINDINGS, name: 'Bindings3',brand: 'Brand',model: 'Model'},
      {id: 4, type: EquipmentType.BINDINGS, name: 'Bindings4',brand: 'Brand',model: 'Model'},
      {id: 5, type: EquipmentType.BINDINGS, name: 'Bindings5',brand: 'Brand',model: 'Model'},

  ];
  boardsList = [
      {id: 1, type: EquipmentType.BOARD, name: 'Board1',brand: 'Brand',model: 'Model'},
      {id: 2, type: EquipmentType.BOARD, name: 'Board2',brand: 'Brand',model: 'Model'},
      {id: 3, type: EquipmentType.BOARD, name: 'Board3',brand: 'Brand',model: 'Model'},
      {id: 4, type: EquipmentType.BOARD, name: 'Board4',brand: 'Brand',model: 'Model'},
      {id: 5, type: EquipmentType.BOARD, name: 'Board5',brand: 'Brand',model: 'Model'}

  ];

  constructor() {
  }

  ngOnInit() {
  }

  showList(listType: String) {
    switch (listType){
        case 'boots' :
            this.equipmentList = this.bootsList; 
            break;
        case 'bindings' :
            this.equipmentList = this.bindingsList;
            break;
        case 'boards' :
            this.equipmentList = this.boardsList;
            break;
    }
  }
}