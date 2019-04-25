import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplateExpressionOperatorComponent } from './template-expression-operator.component';

describe('TemplateExpressionOperatorComponent', () => {
  let component: TemplateExpressionOperatorComponent;
  let fixture: ComponentFixture<TemplateExpressionOperatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TemplateExpressionOperatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplateExpressionOperatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
