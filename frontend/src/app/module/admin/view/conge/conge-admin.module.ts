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

import { DemandeCongeCreateAdminComponent } from './demande-conge-admin/create-admin/demande-conge-create-admin.component';
import { DemandeCongeEditAdminComponent } from './demande-conge-admin/edit-admin/demande-conge-edit-admin.component';
import { DemandeCongeViewAdminComponent } from './demande-conge-admin/view-admin/demande-conge-view-admin.component';
import { DemandeCongeListAdminComponent } from './demande-conge-admin/list-admin/demande-conge-list-admin.component';
import { TypeDemandeCongeCreateAdminComponent } from './type-demande-conge-admin/create-admin/type-demande-conge-create-admin.component';
import { TypeDemandeCongeEditAdminComponent } from './type-demande-conge-admin/edit-admin/type-demande-conge-edit-admin.component';
import { TypeDemandeCongeViewAdminComponent } from './type-demande-conge-admin/view-admin/type-demande-conge-view-admin.component';
import { TypeDemandeCongeListAdminComponent } from './type-demande-conge-admin/list-admin/type-demande-conge-list-admin.component';
import { SoldAnnuelCongeCreateAdminComponent } from './sold-annuel-conge-admin/create-admin/sold-annuel-conge-create-admin.component';
import { SoldAnnuelCongeEditAdminComponent } from './sold-annuel-conge-admin/edit-admin/sold-annuel-conge-edit-admin.component';
import { SoldAnnuelCongeViewAdminComponent } from './sold-annuel-conge-admin/view-admin/sold-annuel-conge-view-admin.component';
import { SoldAnnuelCongeListAdminComponent } from './sold-annuel-conge-admin/list-admin/sold-annuel-conge-list-admin.component';
import { EtatDemandeCongeCreateAdminComponent } from './etat-demande-conge-admin/create-admin/etat-demande-conge-create-admin.component';
import { EtatDemandeCongeEditAdminComponent } from './etat-demande-conge-admin/edit-admin/etat-demande-conge-edit-admin.component';
import { EtatDemandeCongeViewAdminComponent } from './etat-demande-conge-admin/view-admin/etat-demande-conge-view-admin.component';
import { EtatDemandeCongeListAdminComponent } from './etat-demande-conge-admin/list-admin/etat-demande-conge-list-admin.component';

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

    DemandeCongeCreateAdminComponent,
    DemandeCongeListAdminComponent,
    DemandeCongeViewAdminComponent,
    DemandeCongeEditAdminComponent,
    TypeDemandeCongeCreateAdminComponent,
    TypeDemandeCongeListAdminComponent,
    TypeDemandeCongeViewAdminComponent,
    TypeDemandeCongeEditAdminComponent,
    SoldAnnuelCongeCreateAdminComponent,
    SoldAnnuelCongeListAdminComponent,
    SoldAnnuelCongeViewAdminComponent,
    SoldAnnuelCongeEditAdminComponent,
    EtatDemandeCongeCreateAdminComponent,
    EtatDemandeCongeListAdminComponent,
    EtatDemandeCongeViewAdminComponent,
    EtatDemandeCongeEditAdminComponent,
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
  DemandeCongeCreateAdminComponent,
  DemandeCongeListAdminComponent,
  DemandeCongeViewAdminComponent,
  DemandeCongeEditAdminComponent,
  TypeDemandeCongeCreateAdminComponent,
  TypeDemandeCongeListAdminComponent,
  TypeDemandeCongeViewAdminComponent,
  TypeDemandeCongeEditAdminComponent,
  SoldAnnuelCongeCreateAdminComponent,
  SoldAnnuelCongeListAdminComponent,
  SoldAnnuelCongeViewAdminComponent,
  SoldAnnuelCongeEditAdminComponent,
  EtatDemandeCongeCreateAdminComponent,
  EtatDemandeCongeListAdminComponent,
  EtatDemandeCongeViewAdminComponent,
  EtatDemandeCongeEditAdminComponent,
  ],
  entryComponents: [],
})
export class CongeAdminModule { }