import {User} from './user';
import {Comment} from './comment'

export class Post {

    constructor(public postId: string,
                public title: string,
                public description: string,
                public category: string) {}

    author: User = null;
    comments: Comment[] = [];

}
