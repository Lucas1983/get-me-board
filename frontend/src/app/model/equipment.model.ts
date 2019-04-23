
import {EquipmentType} from "../enums/eqt.enum";

export class Equipment {

    protected id: number;
    protected type: EquipmentType;
    protected name: string;
    protected brand: string;
    protected model: string;

    constructor(id: number, type: EquipmentType, name: string, brand: string, model: string){

        this.id = id;
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.model = model;
    }
}