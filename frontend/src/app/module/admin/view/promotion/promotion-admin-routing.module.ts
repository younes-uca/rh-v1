
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { PromotionListAdminComponent } from './promotion-admin/list-admin/promotion-list-admin.component';
import { VilleListAdminComponent } from './ville-admin/list-admin/ville-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'promotion',
                            children: [
                                {
                                    path: 'list',
                                    component: PromotionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'ville',
                            children: [
                                {
                                    path: 'list',
                                    component: VilleListAdminComponent ,
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
export class PromotionAdminRoutingModule { }
