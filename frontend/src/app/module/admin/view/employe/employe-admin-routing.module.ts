
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { EducationListAdminComponent } from './education-admin/list-admin/education-list-admin.component';
import { CategorieEmployeListAdminComponent } from './categorie-employe-admin/list-admin/categorie-employe-list-admin.component';
import { SexeListAdminComponent } from './sexe-admin/list-admin/sexe-list-admin.component';
import { SiegeListAdminComponent } from './siege-admin/list-admin/siege-list-admin.component';
import { EmployeListAdminComponent } from './employe-admin/list-admin/employe-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'education',
                            children: [
                                {
                                    path: 'list',
                                    component: EducationListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'categorie-employe',
                            children: [
                                {
                                    path: 'list',
                                    component: CategorieEmployeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'sexe',
                            children: [
                                {
                                    path: 'list',
                                    component: SexeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'siege',
                            children: [
                                {
                                    path: 'list',
                                    component: SiegeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'employe',
                            children: [
                                {
                                    path: 'list',
                                    component: EmployeListAdminComponent ,
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
export class EmployeAdminRoutingModule { }
