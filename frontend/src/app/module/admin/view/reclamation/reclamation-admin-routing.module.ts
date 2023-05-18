
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { ReclamationListAdminComponent } from './reclamation-admin/list-admin/reclamation-list-admin.component';
import { TypeReclamationListAdminComponent } from './type-reclamation-admin/list-admin/type-reclamation-list-admin.component';
import { EtatReclamationListAdminComponent } from './etat-reclamation-admin/list-admin/etat-reclamation-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: ReclamationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeReclamationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-reclamation',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatReclamationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class ReclamationAdminRoutingModule { }
