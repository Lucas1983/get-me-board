import {EquipmentService} from "./equipment.service";
import {BindingsComponent} from "../components/bindings/bindings.component";
import {EquipmentType} from "../enums/eqt.enum";

export class BindingsService extends EquipmentService<BindingsComponent> {

    constructor(){
        super()
        this.equipments = [
            {id: 1, type: EquipmentType.BINDINGS, favorite: true, name: 'Bindings1',brand: 'Brand',model: 'Model'},
            {id: 2, type: EquipmentType.BINDINGS, favorite: false, name: 'Bindings2',brand: 'Brand',model: 'Model'},
            {id: 3, type: EquipmentType.BINDINGS, favorite: true, name: 'Bindings3',brand: 'Brand',model: 'Model'},
            {id: 4, type: EquipmentType.BINDINGS, favorite: false, name: 'Bindings4',brand: 'Brand',model: 'Model'},
            {id: 5, type: EquipmentType.BINDINGS, favorite: true, name: 'Bindings5',brand: 'Brand',model: 'Model'},
        ];
    }
}