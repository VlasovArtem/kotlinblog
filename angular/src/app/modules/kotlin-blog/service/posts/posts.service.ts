import {Injectable} from '@angular/core';
import {POSTS} from '../../mock/mock-posts';
import {Post} from '../../entity/post';
import {Observable, of} from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {User} from '../../entity/user';

@Injectable({
    providedIn: 'root'
})
export class PostsService {

    constructor(
        private httpClient: HttpClient
    ){}

    getUser(id: string): Observable<string> {
        return this.httpClient.post<string>("http://localhost:8085/graphql", `{"query":"{findUser(id: \\\"${id}\\\") {id firstName lastName}}","variables":null,"operationName":null}`)
    }

    getHttpPosts(): Observable<Post[]> {
        return this.httpClient.get<Post[]>("");
    }

    getPosts(): Observable<Post[]> {
        return of(POSTS);
    }

    getPost(id: string): Observable<Post> {
        let posts = POSTS.filter(post => post.postId == id);
        if (posts && posts.length > 0) {
            return of(posts[0]);
        }
        return of(null);
    }

    getMockPosts(): Post[] {
        return POSTS;
    }

}
