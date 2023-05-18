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

import { ReclamationCreateAdminComponent } from './reclamation-admin/create-admin/reclamation-create-admin.component';
import { ReclamationEditAdminComponent } from './reclamation-admin/edit-admin/reclamation-edit-admin.component';
import { ReclamationViewAdminComponent } from './reclamation-admin/view-admin/reclamation-view-admin.component';
import { ReclamationListAdminComponent } from './reclamation-admin/list-admin/reclamation-list-admin.component';
import { TypeReclamationCreateAdminComponent } from './type-reclamation-admin/create-admin/type-reclamation-create-admin.component';
import { TypeReclamationEditAdminComponent } from './type-reclamation-admin/edit-admin/type-reclamation-edit-admin.component';
import { TypeReclamationViewAdminComponent } from './type-reclamation-admin/view-admin/type-reclamation-view-admin.component';
import { TypeReclamationListAdminComponent } from './type-reclamation-admin/list-admin/type-reclamation-list-admin.component';
import { EtatReclamationCreateAdminComponent } from './etat-reclamation-admin/create-admin/etat-reclamation-create-admin.component';
import { EtatReclamationEditAdminComponent } from './etat-reclamation-admin/edit-admin/etat-reclamation-edit-admin.component';
import { EtatReclamationViewAdminComponent } from './etat-reclamation-admin/view-admin/etat-reclamation-view-admin.component';
import { EtatReclamationListAdminComponent } from './etat-reclamation-admin/list-admin/etat-reclamation-list-admin.component';

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

    ReclamationCreateAdminComponent,
    ReclamationListAdminComponent,
    ReclamationViewAdminComponent,
    ReclamationEditAdminComponent,
    TypeReclamationCreateAdminComponent,
    TypeReclamationListAdminComponent,
    TypeReclamationViewAdminComponent,
    TypeReclamationEditAdminComponent,
    EtatReclamationCreateAdminComponent,
    EtatReclamationListAdminComponent,
    EtatReclamationViewAdminComponent,
    EtatReclamationEditAdminComponent,
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
  ReclamationCreateAdminComponent,
  ReclamationListAdminComponent,
  ReclamationViewAdminComponent,
  ReclamationEditAdminComponent,
  TypeReclamationCreateAdminComponent,
  TypeReclamationListAdminComponent,
  TypeReclamationViewAdminComponent,
  TypeReclamationEditAdminComponent,
  EtatReclamationCreateAdminComponent,
  EtatReclamationListAdminComponent,
  EtatReclamationViewAdminComponent,
  EtatReclamationEditAdminComponent,
  ],
  entryComponents: [],
})
export class ReclamationAdminModule { }