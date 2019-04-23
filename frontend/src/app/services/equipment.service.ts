import {EquipmentComponent} from "../components/equipment/equipment.component";
import {OnInit} from "@angular/core";

 export class EquipmentService<T> implements OnInit{

    protected equipments;

    public get(): T[] {
        return this.equipments;
    }

    public add(equipment: T) {
        this.equipments.push(equipment)
    };

    public delete(equipment: T) {
        let index = this.equipments.indexOf(equipment);
        if (index >= 0) {
            this.equipments.splice(index, 1);
        }
    };

    ngOnInit(){

    }
}