import {Component, OnInit} from '@angular/core';
import {Post} from '../../entity/post';
import {PostsService} from '../../service/posts/posts.service';


@Component({
    selector: 'app-posts',
    templateUrl: './posts.component.html',
    styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {

    constructor(private postService: PostsService) {}

    posts: Post[];
    selectedPosts = null;
    user: string;

    ngOnInit() {
        this.getPosts();
    }

    getPosts(): void {
        this.postService.getPosts()
            .subscribe(posts => this.posts = posts);
    }

    getUser(): void {
        this.postService.getUser("5be9674afa00d2883f06567b")
            .subscribe(user => this.user = user)
    }

    onSelect(post: Post): void {
        this.selectedPosts = post;
    }
}
