import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserloginComponent} from './userlogin/userlogin.component';
import {UserRegistrationComponent} from './user-registration/user-registration.component';
const routes: Routes = [
  {path: '', component: UserloginComponent},
  {path: 'user_registration', component: UserRegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
