import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'search-comp',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  name = 'Search Your Favorite Kit!';

  @Output('search') searchEvent = new EventEmitter();

  searchExecuted = false;

  constructor() { }

  ngOnInit() {
  }

  onSearch(){
    this.searchEvent.emit();
  }
}
