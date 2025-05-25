import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GameService } from '../../services/game.service';
import { Game } from '../../models/game';

@Component({
  selector: 'app-game',
  imports: [CommonModule],
  templateUrl: './game.component.html',
  styleUrl: './game.component.css'
})
export class GameComponent implements OnInit {
  game?: Game;

  constructor(private gameService: GameService) {}

  ngOnInit() {
    this.gameService.getRandomGame().subscribe({
      next: data =>  this.game = data,
      error: err => console.error('Error fetching game:', err),
    });
  }
  
}
