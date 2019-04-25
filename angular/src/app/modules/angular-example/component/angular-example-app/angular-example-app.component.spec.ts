import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AngularExampleAppComponent } from './angular-example-app.component';

describe('AngularExampleAppComponent', () => {
  let component: AngularExampleAppComponent;
  let fixture: ComponentFixture<AngularExampleAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AngularExampleAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AngularExampleAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
