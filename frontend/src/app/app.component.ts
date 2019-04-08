import { Component } from '@angular/core';

@Component({
  selector: 'app-comp',
  templateUrl: 'app.component.html',
  styleUrls: ['app.component.css']
})
export class AppComponent {

  title = 'GET-ME-BOARD';

  searchExecuted = true;

  onEquipmentSearch(){
    //this.searchExecuted = true;
  }

  public onEquipmentDelete(event){
    alert(event.toString());
  }

  public onEquipmentSave(event) {
    alert(event.toString());
  }

  public onEquipmentUpdate(event) {
    alert(event.toString());
  }
}
