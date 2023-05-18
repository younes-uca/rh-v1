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

import { PromotionCreateAdminComponent } from './promotion-admin/create-admin/promotion-create-admin.component';
import { PromotionEditAdminComponent } from './promotion-admin/edit-admin/promotion-edit-admin.component';
import { PromotionViewAdminComponent } from './promotion-admin/view-admin/promotion-view-admin.component';
import { PromotionListAdminComponent } from './promotion-admin/list-admin/promotion-list-admin.component';
import { VilleCreateAdminComponent } from './ville-admin/create-admin/ville-create-admin.component';
import { VilleEditAdminComponent } from './ville-admin/edit-admin/ville-edit-admin.component';
import { VilleViewAdminComponent } from './ville-admin/view-admin/ville-view-admin.component';
import { VilleListAdminComponent } from './ville-admin/list-admin/ville-list-admin.component';

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

    PromotionCreateAdminComponent,
    PromotionListAdminComponent,
    PromotionViewAdminComponent,
    PromotionEditAdminComponent,
    VilleCreateAdminComponent,
    VilleListAdminComponent,
    VilleViewAdminComponent,
    VilleEditAdminComponent,
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
  PromotionCreateAdminComponent,
  PromotionListAdminComponent,
  PromotionViewAdminComponent,
  PromotionEditAdminComponent,
  VilleCreateAdminComponent,
  VilleListAdminComponent,
  VilleViewAdminComponent,
  VilleEditAdminComponent,
  ],
  entryComponents: [],
})
export class PromotionAdminModule { }