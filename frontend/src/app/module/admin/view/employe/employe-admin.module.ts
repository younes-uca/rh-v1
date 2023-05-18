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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { EducationCreateAdminComponent } from './education-admin/create-admin/education-create-admin.component';
import { EducationEditAdminComponent } from './education-admin/edit-admin/education-edit-admin.component';
import { EducationViewAdminComponent } from './education-admin/view-admin/education-view-admin.component';
import { EducationListAdminComponent } from './education-admin/list-admin/education-list-admin.component';
import { CategorieEmployeCreateAdminComponent } from './categorie-employe-admin/create-admin/categorie-employe-create-admin.component';
import { CategorieEmployeEditAdminComponent } from './categorie-employe-admin/edit-admin/categorie-employe-edit-admin.component';
import { CategorieEmployeViewAdminComponent } from './categorie-employe-admin/view-admin/categorie-employe-view-admin.component';
import { CategorieEmployeListAdminComponent } from './categorie-employe-admin/list-admin/categorie-employe-list-admin.component';
import { SexeCreateAdminComponent } from './sexe-admin/create-admin/sexe-create-admin.component';
import { SexeEditAdminComponent } from './sexe-admin/edit-admin/sexe-edit-admin.component';
import { SexeViewAdminComponent } from './sexe-admin/view-admin/sexe-view-admin.component';
import { SexeListAdminComponent } from './sexe-admin/list-admin/sexe-list-admin.component';
import { SiegeCreateAdminComponent } from './siege-admin/create-admin/siege-create-admin.component';
import { SiegeEditAdminComponent } from './siege-admin/edit-admin/siege-edit-admin.component';
import { SiegeViewAdminComponent } from './siege-admin/view-admin/siege-view-admin.component';
import { SiegeListAdminComponent } from './siege-admin/list-admin/siege-list-admin.component';
import { EmployeCreateAdminComponent } from './employe-admin/create-admin/employe-create-admin.component';
import { EmployeEditAdminComponent } from './employe-admin/edit-admin/employe-edit-admin.component';
import { EmployeViewAdminComponent } from './employe-admin/view-admin/employe-view-admin.component';
import { EmployeListAdminComponent } from './employe-admin/list-admin/employe-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    EducationCreateAdminComponent,
    EducationListAdminComponent,
    EducationViewAdminComponent,
    EducationEditAdminComponent,
    CategorieEmployeCreateAdminComponent,
    CategorieEmployeListAdminComponent,
    CategorieEmployeViewAdminComponent,
    CategorieEmployeEditAdminComponent,
    SexeCreateAdminComponent,
    SexeListAdminComponent,
    SexeViewAdminComponent,
    SexeEditAdminComponent,
    SiegeCreateAdminComponent,
    SiegeListAdminComponent,
    SiegeViewAdminComponent,
    SiegeEditAdminComponent,
    EmployeCreateAdminComponent,
    EmployeListAdminComponent,
    EmployeViewAdminComponent,
    EmployeEditAdminComponent,
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
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  EducationCreateAdminComponent,
  EducationListAdminComponent,
  EducationViewAdminComponent,
  EducationEditAdminComponent,
  CategorieEmployeCreateAdminComponent,
  CategorieEmployeListAdminComponent,
  CategorieEmployeViewAdminComponent,
  CategorieEmployeEditAdminComponent,
  SexeCreateAdminComponent,
  SexeListAdminComponent,
  SexeViewAdminComponent,
  SexeEditAdminComponent,
  SiegeCreateAdminComponent,
  SiegeListAdminComponent,
  SiegeViewAdminComponent,
  SiegeEditAdminComponent,
  EmployeCreateAdminComponent,
  EmployeListAdminComponent,
  EmployeViewAdminComponent,
  EmployeEditAdminComponent,
  ],
  entryComponents: [],
})
export class EmployeAdminModule { }