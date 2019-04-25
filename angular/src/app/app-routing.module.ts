import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
    {path: 'kotlinblog', loadChildren: './modules/kotlin-blog/kotlin-blog.module#KotlinBlogModule'},
    {path: 'example', loadChildren: './modules/angular-example/angular-example.module#AngularExampleModule'}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
