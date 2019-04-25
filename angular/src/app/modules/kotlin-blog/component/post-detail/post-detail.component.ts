import {Component, Input, OnInit} from '@angular/core';
import {Post} from '../../entity/post';
import {Location} from '@angular/common';
import {ActivatedRoute, Router} from '@angular/router';
import {PostsService} from '../../service/posts/posts.service';

@Component({
    selector: 'app-post-detail',
    templateUrl: './post-detail.component.html',
    styleUrls: ['./post-detail.component.css']
})

export class PostDetailComponent implements OnInit {

    post: Post;

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private location: Location
    ) {
    }

    // @Input() post: Post;

    ngOnInit() {
        this.route.data
            .subscribe((data: { post: Post }) => {
                console.log('Route init');
                console.log(data);
                this.post = data.post;
            });
    }

    goBack() {
        this.location.back();
    }

}
