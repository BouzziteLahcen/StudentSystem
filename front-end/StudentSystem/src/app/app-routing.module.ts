import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { FooterComponent } from './components/footer/footer.component';
import { LoginComponent } from './components/login/login.component';
import { StudentsComponent } from './components/students/students.component';
import { OptionsComponent } from './components/options/options.component';

const routes: Routes = [

{path:'option', component:OptionsComponent},
{path:'students', component:StudentsComponent},
{path:'login', component:LoginComponent},
{path:'', component:StudentsComponent},
{path:'**', component:StudentsComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
