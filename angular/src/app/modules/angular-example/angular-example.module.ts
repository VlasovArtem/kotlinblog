import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {NgModelTestComponent} from './component/ng-model-test/ng-model-test.component';
import {AngularExampleAppComponent} from './component/angular-example-app/angular-example-app.component';
import {AngularExampleRoutingModule} from './angular-example-routing.module';
import {FormsModule} from '@angular/forms';
import { PropertyBindingComponent } from './component/property-binding/property-binding.component';
import { TemplateExpressionOperatorComponent } from './component/template-expression-operator/template-expression-operator.component';
import { UserInputComponent } from './component/user-input/user-input.component';

@NgModule({
    declarations: [
        NgModelTestComponent,
        AngularExampleAppComponent,
        PropertyBindingComponent,
        TemplateExpressionOperatorComponent,
        UserInputComponent
    ],
    imports: [
        CommonModule,
        AngularExampleRoutingModule,
        FormsModule
    ],
    bootstrap: [AngularExampleAppComponent]
})
export class AngularExampleModule {
}
