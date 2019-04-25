import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {KotlinBlogAppComponent} from './component/kotlin-blog-app/kotlin-blog-app.component';
import {PostsComponent} from './component/posts/posts.component';
import {PostDetailComponent} from './component/post-detail/post-detail.component';
import {CommentsComponent} from './component/comments/comments.component';
import {KotlinBlogRoutingModule} from './kotlin-blog-routing.module';
import {FormsModule} from '@angular/forms';

@NgModule({
    declarations: [
        KotlinBlogAppComponent,
        PostDetailComponent,
        CommentsComponent,
        PostsComponent
    ],
    imports: [
        CommonModule,
        KotlinBlogRoutingModule,
        FormsModule
    ],
    bootstrap: [KotlinBlogAppComponent]
})
export class KotlinBlogModule {
}
