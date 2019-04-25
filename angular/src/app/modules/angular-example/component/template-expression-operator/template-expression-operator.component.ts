import {Component, OnInit} from '@angular/core';
import {Post} from '../../../kotlin-blog/entity/post';

@Component({
    selector: 'app-template-expression-operator',
    templateUrl: './template-expression-operator.component.html',
    styleUrls: ['./template-expression-operator.component.css']
})
export class TemplateExpressionOperatorComponent implements OnInit {

    toUpperCase = "to Upper Case";
    toLowerCase = "to LOWER case";
    date = new Date();
    post = new Post("123", "title", "description", "category");
    nullObjectPost: Post = null;
    addPost() {
        this.nullObjectPost = this.post;
    }

    removePost() {
        this.nullObjectPost = null;
    }

    constructor() {
    }

    ngOnInit() {
    }

}
