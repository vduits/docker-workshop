import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AssielOverzichtComponent } from './assiel-overzicht.component';

describe('AssielOverzichtComponent', () => {
  let component: AssielOverzichtComponent;
  let fixture: ComponentFixture<AssielOverzichtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AssielOverzichtComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AssielOverzichtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
