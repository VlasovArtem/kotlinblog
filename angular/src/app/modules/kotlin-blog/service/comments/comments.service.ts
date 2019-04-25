import {Injectable} from '@angular/core';
import {Comment} from '../../entity/comment';

@Injectable({
    providedIn: 'root'
})
export class CommentsService {
    comments: Comment[] = [];

    addComment(comment: string) {
        this.comments.push({
            commentId: null,
            author: null,
            post: null,
            comment: comment
        });
    }

    clear() {
        this.comments = [];
    }

    constructor() {
    }
}
