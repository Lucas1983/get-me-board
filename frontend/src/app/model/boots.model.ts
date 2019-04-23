
import {Equipment} from "./equipment.model";
import {EquipmentType} from "../enums/eqt.enum";

export class Boots extends Equipment{

    constructor(id: number, name: string, brand: string, model: string) {
        super(id, EquipmentType.BOOTS, name, brand, model);
    }
    
}