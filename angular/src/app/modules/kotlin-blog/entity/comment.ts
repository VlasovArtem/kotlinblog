import {User} from './user';
import {Post} from './post';

export class Comment {
    commentId: string;
    comment: string;
    author: User;
    post: Post;
}