import {EquipmentService} from "./equipment.service";
import {BootsComponent} from "../components/boots/boots.component";
import {EquipmentType} from "../enums/eqt.enum";

export class BootsService extends EquipmentService<BootsComponent> {

    constructor(){
        super();
        this.equipments = [ 
            {id: 1, type: EquipmentType.BOOTS, favorite: true, name: 'Bindings1',brand: 'Brand',model: 'Model'},
            {id: 2, type: EquipmentType.BOOTS, favorite: false, name: 'Bindings2',brand: 'Brand',model: 'Model'},
            {id: 3, type: EquipmentType.BOOTS, favorite: true, name: 'Bindings3',brand: 'Brand',model: 'Model'},
            {id: 4, type: EquipmentType.BOOTS, favorite: false, name: 'Bindings4',brand: 'Brand',model: 'Model'},
            {id: 5, type: EquipmentType.BOOTS, favorite: true, name: 'Bindings5',brand: 'Brand',model: 'Model'},
        ];
    }
}