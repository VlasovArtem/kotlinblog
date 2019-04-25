import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {PostDetailComponent} from './component/post-detail/post-detail.component';
import {PostsComponent} from './component/posts/posts.component';
import {KotlinBlogAppComponent} from './component/kotlin-blog-app/kotlin-blog-app.component';
import {PostDetailResolverService} from './service/post-detail-resolver/post-detail-resolver.service';

const routes: Routes = [
    {
        path: '',
        component: KotlinBlogAppComponent,
        children: [
            {
                path: 'posts',
                component: PostsComponent,
                children: [
                    {
                        path: ':id',
                        component: PostDetailComponent,
                        resolve: {
                            post : PostDetailResolverService
                        }
                    }
                ]
            }
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class KotlinBlogRoutingModule {
}
