import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AddScheduleComponent } from './add-schedule/add-schedule.component';
import { UpdatescheduleComponent } from './updateschedule/updateschedule.component';

import { ViewAllScheduleComponent } from './view-all-schedule/view-all-schedule.component';
import { ScheduleListComponent } from './schedule-list/schedule-list.component';
import { AppRoutingModule } from './app.routing.module';
import { HttpClientModule } from '@angular/common/http';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { FooterComponentComponent } from './footer-component/footer-component.component';

@NgModule({
  declarations: [
    AppComponent,
    AddScheduleComponent,
    UpdatescheduleComponent,
    NavBarComponent,
    ViewAllScheduleComponent,
    ScheduleListComponent,
    HomeComponentComponent,
    FooterComponentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
