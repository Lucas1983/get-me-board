import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingsComponent } from './equipment/bindings/bindings.component';
import { BoardComponent } from './equipment/board/board.component';
import { BootsComponent } from './equipment/boots/boots.component';
import { SearchComponent } from './search/search.component';
import { EquipmentComponent } from './equipment/equipment.component';
import { EquipmentListComponent } from './equipment-list/equipment-list.component';
import { FontAwesomeModule} from "@fortawesome/angular-fontawesome";

@NgModule({
    declarations: [
        AppComponent,
        BindingsComponent,
        BoardComponent,
        BootsComponent,
        SearchComponent,
        EquipmentComponent,
        EquipmentListComponent,
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FontAwesomeModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
