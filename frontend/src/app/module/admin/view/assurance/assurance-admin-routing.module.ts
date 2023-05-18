
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { CompagnieAssuranceListAdminComponent } from './compagnie-assurance-admin/list-admin/compagnie-assurance-list-admin.component';
import { AssuranceListAdminComponent } from './assurance-admin/list-admin/assurance-list-admin.component';
import { LienParenteListAdminComponent } from './lien-parente-admin/list-admin/lien-parente-list-admin.component';
import { SocieteListAdminComponent } from './societe-admin/list-admin/societe-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'compagnie-assurance',
                            children: [
                                {
                                    path: 'list',
                                    component: CompagnieAssuranceListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'assurance',
                            children: [
                                {
                                    path: 'list',
                                    component: AssuranceListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'lien-parente',
                            children: [
                                {
                                    path: 'list',
                                    component: LienParenteListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'societe',
                            children: [
                                {
                                    path: 'list',
                                    component: SocieteListAdminComponent ,
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
export class AssuranceAdminRoutingModule { }
