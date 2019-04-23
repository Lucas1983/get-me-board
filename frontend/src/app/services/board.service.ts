import {EquipmentService} from "./equipment.service";
import {BoardComponent} from "../components/board/board.component";
import {EquipmentType} from "../enums/eqt.enum";

export class BoardService extends EquipmentService<BoardComponent> {

    constructor() {
        super();
        this.equipments = [
            {id: 1, type: EquipmentType.BOARD, favorite: true, name: 'Board1', brand: 'Brand', model: 'Model'},
            {id: 2, type: EquipmentType.BOARD, favorite: true, name: 'Board2', brand: 'Brand', model: 'Model'},
            {id: 3, type: EquipmentType.BOARD, favorite: true, name: 'Board3', brand: 'Brand', model: 'Model'},
            {id: 4, type: EquipmentType.BOARD, favorite: false, name: 'Board4', brand: 'Brand', model: 'Model'},
            {id: 5, type: EquipmentType.BOARD, favorite: true, name: 'Board5', brand: 'Brand', model: 'Model'}
        ];
    }
}