import {Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-property-binding',
    templateUrl: './property-binding.component.html',
    styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {

    isSpecial = false;
    classes = ['notSpecial'];
    bindingName = '';

    constructor() {
    }

    ngOnInit() {
    }

    setSpecial() {
        this.isSpecial = !this.isSpecial;
        if (!this.isSpecial) {
            this.classes = ['notSpecial'];
        } else {
            this.classes = ['special'];
        }
    }

    getType() {
        if (this.isSpecial)
            return "checkbox";
        return "radio";
    }
}
