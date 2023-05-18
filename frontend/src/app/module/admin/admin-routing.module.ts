
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';

import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';

@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [
                        {
                            path: 'login',
                            children: [
                                {
                                    path: '',
                                    component: LoginAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'register',
                            children: [
                                {
                                    path: '',
                                    component: RegisterAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {

                            path: 'news',
                            loadChildren: () => import('./view/news/news-admin-routing.module').then(x=>x.NewsAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'assurance',
                            loadChildren: () => import('./view/assurance/assurance-admin-routing.module').then(x=>x.AssuranceAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'departement',
                            loadChildren: () => import('./view/departement/departement-admin-routing.module').then(x=>x.DepartementAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'employe',
                            loadChildren: () => import('./view/employe/employe-admin-routing.module').then(x=>x.EmployeAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'conge',
                            loadChildren: () => import('./view/conge/conge-admin-routing.module').then(x=>x.CongeAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'reclamation',
                            loadChildren: () => import('./view/reclamation/reclamation-admin-routing.module').then(x=>x.ReclamationAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'promotion',
                            loadChildren: () => import('./view/promotion/promotion-admin-routing.module').then(x=>x.PromotionAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'station',
                            loadChildren: () => import('./view/station/station-admin-routing.module').then(x=>x.StationAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class AdminRoutingModule { }
