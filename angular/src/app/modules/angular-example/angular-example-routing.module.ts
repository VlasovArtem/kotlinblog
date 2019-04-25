import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {NgModelTestComponent} from './component/ng-model-test/ng-model-test.component';
import {AngularExampleAppComponent} from './component/angular-example-app/angular-example-app.component';
import {PropertyBindingComponent} from './component/property-binding/property-binding.component';
import {TemplateExpressionOperatorComponent} from './component/template-expression-operator/template-expression-operator.component';
import {UserInputComponent} from './component/user-input/user-input.component';

const routes: Routes = [
    {
        path: '',
        component: AngularExampleAppComponent,
        children: [
            {path: 'ngmodel', component: NgModelTestComponent},
            {path: 'property-binding', component: PropertyBindingComponent},
            {path: 'expression-operator', component: TemplateExpressionOperatorComponent},
            {path: 'user-input', component: UserInputComponent}
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class AngularExampleRoutingModule {
}
