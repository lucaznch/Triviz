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

    getGames(): Observable<Game[]> {
        return this.http.get<Game[]>(this.baseUrl + '/all');
    }

    getGameById(id: number): Observable<Game> {
        return this.http.get<Game>(`${this.baseUrl}/${id}`);
    }
    
    getRandomGame(): Observable<Game> {
        return this.http.get<Game>(`${this.baseUrl}/random`);
    }

    getGamesByLevel(level: string): Observable<Game[]> {
        return this.http.get<Game[]>(`${this.baseUrl}/level/${level}`);
    }
}
