import {Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-ng-model-test',
    templateUrl: './ng-model-test.component.html',
    styleUrls: ['./ng-model-test.component.css']
})
export class NgModelTestComponent implements OnInit {

    testName = 'test';

    constructor() {
    }

    ngOnInit() {
    }


    setUppercaseName($event: {}) {
        this.testName = $event.toString().toUpperCase();
    }
}
