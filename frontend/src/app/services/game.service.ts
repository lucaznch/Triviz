import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Game } from '../models/game';

@Injectable({
    providedIn: 'root'
})
export class GameService {
    private baseUrl = 'http://localhost:8080/games';

    constructor(private http: HttpClient) { }

    getRandomGame(): Observable<Game> {
        return this.http.get<Game>(this.baseUrl);
    }

}
