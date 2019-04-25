import {Component, OnInit} from '@angular/core';
import {CommentsService} from '../../service/comments/comments.service';

@Component({
    selector: 'app-comments',
    templateUrl: './comments.component.html',
    styleUrls: ['./comments.component.css']
})
export class CommentsComponent implements OnInit {

    constructor(public commentsService: CommentsService) {}

    ngOnInit() {
    }
}
