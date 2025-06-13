import { Routes } from '@angular/router';
import { GameComponent } from './components/game/game.component';

export const routes: Routes = [
    { path: '', redirectTo: '/games', pathMatch: 'full' },
    { path: 'games', component: GameComponent },
];
