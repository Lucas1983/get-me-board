import { Component, OnInit } from '@angular/core';
import { ReactiveFormsModule, FormBuilder} from "@angular/forms";
import {faSearch} from "@fortawesome/free-solid-svg-icons/faSearch";
import {faSnowboarding} from "@fortawesome/free-solid-svg-icons";

@Component({
  selector: 'nav-search-comp',
  templateUrl: './nav-search.component.html',
  styleUrls: ['./nav-search.component.scss']
})
export class NavSearchComponent implements OnInit {

  brandIcon = faSnowboarding;
  navSearchIcon = faSearch;

  navSearchForm;
  formBuilder: FormBuilder;

  constructor(formBuilder: FormBuilder) {
    this.formBuilder = formBuilder;
  }

  onNavSearch(navSearchForm){
      alert(navSearchForm);
  }

  ngOnInit() {

    this.navSearchForm = this.formBuilder.group({

        navSearch: this.formBuilder.control('Search...')
    });
  }
}
