
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { DemandeCongeListAdminComponent } from './demande-conge-admin/list-admin/demande-conge-list-admin.component';
import { TypeDemandeCongeListAdminComponent } from './type-demande-conge-admin/list-admin/type-demande-conge-list-admin.component';
import { SoldAnnuelCongeListAdminComponent } from './sold-annuel-conge-admin/list-admin/sold-annuel-conge-list-admin.component';
import { EtatDemandeCongeListAdminComponent } from './etat-demande-conge-admin/list-admin/etat-demande-conge-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'demande-conge',
                            children: [
                                {
                                    path: 'list',
                                    component: DemandeCongeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'type-demande-conge',
                            children: [
                                {
                                    path: 'list',
                                    component: TypeDemandeCongeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'sold-annuel-conge',
                            children: [
                                {
                                    path: 'list',
                                    component: SoldAnnuelCongeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'etat-demande-conge',
                            children: [
                                {
                                    path: 'list',
                                    component: EtatDemandeCongeListAdminComponent ,
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
export class CongeAdminRoutingModule { }
