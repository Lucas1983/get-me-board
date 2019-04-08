import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import {faMinusSquare} from '@fortawesome/free-solid-svg-icons/faMinusSquare';
import {faCheckSquare} from "@fortawesome/free-solid-svg-icons/faCheckSquare";
import {faPlusSquare} from "@fortawesome/free-solid-svg-icons/faPlusSquare";
import {faPlusCircle} from "@fortawesome/free-solid-svg-icons/faPlusCircle";
import {faMinusCircle} from "@fortawesome/free-solid-svg-icons/faMinusCircle";
import {faCheckCircle} from "@fortawesome/free-solid-svg-icons/faCheckCircle";
import {EquipmentType} from "../eqt.enum";

@Component({
  selector: 'equipment-comp',
  templateUrl: './equipment.component.html',
  styleUrls: ['./equipment.component.css']
})
export class EquipmentComponent implements OnInit {

  @Input() equipment: EquipmentComponent;

  @Output('delete') deleteEvent = new EventEmitter();
  @Output('save') saveEvent = new EventEmitter();
  @Output('update') updateEvent = new EventEmitter();

  addIcon = faPlusCircle;
  deleteIcon = faMinusCircle;
  editIcon = faCheckCircle;

  id: number;
  type: EquipmentType;
  name: string;
  brand: string;
  model: string;

  constructor(){

  }
  // constructor(id, name, brand, model) {
  //   this.id = id;
  //   this.name = name;
  //   this.brand = brand;
  //   this.model = model;
  // }

  ngOnInit() {
  }

  onDelete(){
      this.deleteEvent.emit("DELETE : " + this.equipment.name);
  }
  onSave(){
      this.saveEvent.emit("SAVE : " + this.equipment.name);
  }
  onUpdate(){
      this.updateEvent.emit("UPDATE : " + this.equipment.name);
  }
}
