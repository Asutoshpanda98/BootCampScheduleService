
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddScheduleComponent } from './add-schedule/add-schedule.component';
import { UpdatescheduleComponent } from './updateschedule/updateschedule.component';
import { ViewAllScheduleComponent } from './view-all-schedule/view-all-schedule.component';
import { ScheduleListComponent } from './schedule-list/schedule-list.component';
import { HomeComponentComponent } from './home-component/home-component.component';

const routes: Routes = [
  { path: '', component:   HomeComponentComponent },
  { path: 'addschedule', component:AddScheduleComponent },
  { path: 'schedule', component: ScheduleListComponent  },
  { path: 'update/:id', component:  UpdatescheduleComponent },
  { path: 'details/:id', component: ViewAllScheduleComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }