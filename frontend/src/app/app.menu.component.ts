import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {
  trigger,
  state,
  style,
  transition,
  animate,
} from '@angular/animations';
import { AppComponent } from './app.component';
import { AppMainComponent } from './app.main.component';

import { AuthService } from 'src/app/zynerator/security/Auth.service';
import { RoleService } from 'src/app/zynerator/security/Role.service';

@Component({
  selector: 'app-menu',
  templateUrl: './app.menu.component.html',
  animations: [
    trigger('inline', [
      state(
        'hidden',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visible',
        style({
          height: '*',
        })
      ),
      state(
        'hiddenAnimated',
        style({
          height: '0px',
          overflow: 'hidden',
        })
      ),
      state(
        'visibleAnimated',
        style({
          height: '*',
        })
      ),
      transition(
        'visibleAnimated => hiddenAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
      transition(
        'hiddenAnimated => visibleAnimated',
        animate('400ms cubic-bezier(0.86, 0, 0.07, 1)')
      ),
    ]),
  ],
})
export class AppMenuComponent implements OnInit {
  model: any[];
  modelsuperadmin:any[];
  modelanonymous: any[];
    modeladmin : any[];
  constructor(public app: AppComponent,
   public appMain: AppMainComponent,
   private roleService: RoleService,
   private authService:AuthService,
  private router: Router) {}

  ngOnInit() {


    this.modeladmin =
      [
              {
                label: 'Gestion News',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste news',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/news/news/list']
                    },
                ]
              },
              {
                label: 'Gestion Employe',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste education',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/employe/education/list']
                    },
                    {
                      label: 'Liste categorie employe',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/employe/categorie-employe/list']
                    },
                    {
                      label: 'Liste departement',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/departement/departement/list']
                    },
                    {
                      label: 'Liste sexe',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/employe/sexe/list']
                    },
                    {
                      label: 'Liste station',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/station/station/list']
                    },
                    {
                      label: 'Liste siege',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/employe/siege/list']
                    },
                    {
                      label: 'Liste promotion',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/promotion/promotion/list']
                    },
                    {
                      label: 'Liste ville',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/promotion/ville/list']
                    },
                    {
                      label: 'Liste employe',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/employe/employe/list']
                    },
                ]
              },
              {
                label: 'Reclamation',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste reclamation',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/reclamation/reclamation/list']
                    },
                    {
                      label: 'Liste type reclamation',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/reclamation/type-reclamation/list']
                    },
                    {
                      label: 'Liste etat reclamation',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/reclamation/etat-reclamation/list']
                    },
                ]
              },
              {
                label: 'Gestion Social',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste compagnie assurance',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/assurance/compagnie-assurance/list']
                    },
                    {
                      label: 'Liste assurance',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/assurance/assurance/list']
                    },
                    {
                      label: 'Liste lien parente',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/assurance/lien-parente/list']
                    },
                    {
                      label: 'Liste societe',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/assurance/societe/list']
                    },
                ]
              },
              {
                label: 'Gestion Conge',
                icon: 'pi pi-wallet',
                items:[
                    {
                      label: 'Liste demande conge',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/conge/demande-conge/list']
                    },
                    {
                      label: 'Liste type demande conge',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/conge/type-demande-conge/list']
                    },
                    {
                      label: 'Liste sold annuel conge',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/conge/sold-annuel-conge/list']
                    },
                    {
                      label: 'Liste etat demande conge',
                      icon: 'pi pi-fw pi-plus-circle',
                      routerLink: ['/app/admin/conge/etat-demande-conge/list']
                    },
                ]
              },
    ]
        if (this.authService.authenticated) {
      if (this.authService.authenticatedUser.roles) {

        this.authService.authenticatedUser.roles.forEach(role => {
          const roleName: string = this.getRole(role);
          this.roleService._role.next(roleName.toUpperCase());
          eval('this.model = this.model' + this.getRole(role));
        })
      }

    }
  }
  getRole(text){
  const [role, ...rest] = text.split('_');
  return rest.join('').toLowerCase();
}
  onMenuClick(event) {
    this.appMain.onMenuClick(event);
  }
}
