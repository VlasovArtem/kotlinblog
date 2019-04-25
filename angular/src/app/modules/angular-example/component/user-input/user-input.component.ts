import {Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-user-input',
    templateUrl: './user-input.component.html',
    styleUrls: ['./user-input.component.css']
})
export class UserInputComponent implements OnInit {

    values = '';
    keyValues = '';
    keyEnterBoxValue = '';
    blurBoxValue = '';

    onKey(event: any) {
        this.values += event.target.value + ' | ';
    }

    onKeyValue(event: KeyboardEvent) {
        this.keyValues += event.code + ' | '
    }

    onKeyEnter(value: string) {
        this.keyEnterBoxValue = value;
    }

    onBlurEnter(value: string) {
        this.blurBoxValue = value;
    }

    onBlurKeyEnter(value: string) {
        this.blurBoxValue = value;
    }

    constructor() {
    }

    ngOnInit() {
    }

}
