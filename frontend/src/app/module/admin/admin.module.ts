import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import { NewsAdminModule } from './view/news/news-admin.module';
import { NewsAdminRoutingModule } from './view/news/news-admin-routing.module';
import { AssuranceAdminModule } from './view/assurance/assurance-admin.module';
import { AssuranceAdminRoutingModule } from './view/assurance/assurance-admin-routing.module';
import { DepartementAdminModule } from './view/departement/departement-admin.module';
import { DepartementAdminRoutingModule } from './view/departement/departement-admin-routing.module';
import { EmployeAdminModule } from './view/employe/employe-admin.module';
import { EmployeAdminRoutingModule } from './view/employe/employe-admin-routing.module';
import { CongeAdminModule } from './view/conge/conge-admin.module';
import { CongeAdminRoutingModule } from './view/conge/conge-admin-routing.module';
import { ReclamationAdminModule } from './view/reclamation/reclamation-admin.module';
import { ReclamationAdminRoutingModule } from './view/reclamation/reclamation-admin-routing.module';
import { PromotionAdminModule } from './view/promotion/promotion-admin.module';
import { PromotionAdminRoutingModule } from './view/promotion/promotion-admin-routing.module';
import { StationAdminModule } from './view/station/station-admin.module';
import { StationAdminRoutingModule } from './view/station/station-admin-routing.module';


import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';


@NgModule({
  declarations: [
   LoginAdminComponent,
   RegisterAdminComponent
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
  NewsAdminModule,
  NewsAdminRoutingModule,
  AssuranceAdminModule,
  AssuranceAdminRoutingModule,
  DepartementAdminModule,
  DepartementAdminRoutingModule,
  EmployeAdminModule,
  EmployeAdminRoutingModule,
  CongeAdminModule,
  CongeAdminRoutingModule,
  ReclamationAdminModule,
  ReclamationAdminRoutingModule,
  PromotionAdminModule,
  PromotionAdminRoutingModule,
  StationAdminModule,
  StationAdminRoutingModule,
  ],
  exports: [
  LoginAdminComponent,
  RegisterAdminComponent,

    NewsAdminModule,
    AssuranceAdminModule,
    DepartementAdminModule,
    EmployeAdminModule,
    CongeAdminModule,
    ReclamationAdminModule,
    PromotionAdminModule,
    StationAdminModule,
  ],
  entryComponents: [],
})
export class AdminModule { }
