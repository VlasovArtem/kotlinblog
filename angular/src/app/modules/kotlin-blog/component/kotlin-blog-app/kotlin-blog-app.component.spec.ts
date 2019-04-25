import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KotlinBlogAppComponent } from './kotlin-blog-app.component';

describe('KotlinBlogAppComponent', () => {
  let component: KotlinBlogAppComponent;
  let fixture: ComponentFixture<KotlinBlogAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KotlinBlogAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KotlinBlogAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
