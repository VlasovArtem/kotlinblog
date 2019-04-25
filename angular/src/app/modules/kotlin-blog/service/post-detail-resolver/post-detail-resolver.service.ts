import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, Resolve, Router, RouterStateSnapshot} from '@angular/router';
import {Observable} from 'rxjs';
import {PostsService} from '../posts/posts.service';
import {Post} from '../../entity/post';

@Injectable({
    providedIn: 'root'
})
export class PostDetailResolverService implements Resolve<Post> {

    constructor(private postsService: PostsService, private router: Router) {
    }

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<Post> | Promise<Post> | Post {
        const id = route.paramMap.get('id');
        return this.postsService.getPost(id);
    }
}
