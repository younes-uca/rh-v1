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

import { CompagnieAssuranceCreateAdminComponent } from './compagnie-assurance-admin/create-admin/compagnie-assurance-create-admin.component';
import { CompagnieAssuranceEditAdminComponent } from './compagnie-assurance-admin/edit-admin/compagnie-assurance-edit-admin.component';
import { CompagnieAssuranceViewAdminComponent } from './compagnie-assurance-admin/view-admin/compagnie-assurance-view-admin.component';
import { CompagnieAssuranceListAdminComponent } from './compagnie-assurance-admin/list-admin/compagnie-assurance-list-admin.component';
import { AssuranceCreateAdminComponent } from './assurance-admin/create-admin/assurance-create-admin.component';
import { AssuranceEditAdminComponent } from './assurance-admin/edit-admin/assurance-edit-admin.component';
import { AssuranceViewAdminComponent } from './assurance-admin/view-admin/assurance-view-admin.component';
import { AssuranceListAdminComponent } from './assurance-admin/list-admin/assurance-list-admin.component';
import { LienParenteCreateAdminComponent } from './lien-parente-admin/create-admin/lien-parente-create-admin.component';
import { LienParenteEditAdminComponent } from './lien-parente-admin/edit-admin/lien-parente-edit-admin.component';
import { LienParenteViewAdminComponent } from './lien-parente-admin/view-admin/lien-parente-view-admin.component';
import { LienParenteListAdminComponent } from './lien-parente-admin/list-admin/lien-parente-list-admin.component';
import { SocieteCreateAdminComponent } from './societe-admin/create-admin/societe-create-admin.component';
import { SocieteEditAdminComponent } from './societe-admin/edit-admin/societe-edit-admin.component';
import { SocieteViewAdminComponent } from './societe-admin/view-admin/societe-view-admin.component';
import { SocieteListAdminComponent } from './societe-admin/list-admin/societe-list-admin.component';

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

    CompagnieAssuranceCreateAdminComponent,
    CompagnieAssuranceListAdminComponent,
    CompagnieAssuranceViewAdminComponent,
    CompagnieAssuranceEditAdminComponent,
    AssuranceCreateAdminComponent,
    AssuranceListAdminComponent,
    AssuranceViewAdminComponent,
    AssuranceEditAdminComponent,
    LienParenteCreateAdminComponent,
    LienParenteListAdminComponent,
    LienParenteViewAdminComponent,
    LienParenteEditAdminComponent,
    SocieteCreateAdminComponent,
    SocieteListAdminComponent,
    SocieteViewAdminComponent,
    SocieteEditAdminComponent,
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
  CompagnieAssuranceCreateAdminComponent,
  CompagnieAssuranceListAdminComponent,
  CompagnieAssuranceViewAdminComponent,
  CompagnieAssuranceEditAdminComponent,
  AssuranceCreateAdminComponent,
  AssuranceListAdminComponent,
  AssuranceViewAdminComponent,
  AssuranceEditAdminComponent,
  LienParenteCreateAdminComponent,
  LienParenteListAdminComponent,
  LienParenteViewAdminComponent,
  LienParenteEditAdminComponent,
  SocieteCreateAdminComponent,
  SocieteListAdminComponent,
  SocieteViewAdminComponent,
  SocieteEditAdminComponent,
  ],
  entryComponents: [],
})
export class AssuranceAdminModule { }