import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { GameService } from '../../services/game.service';
import { Game } from '../../models/game';
import { Question } from '../../models/question';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-game',
  imports: [CommonModule, FormsModule],
  templateUrl: './game.component.html',
  styleUrl: './game.component.css'
})
export class GameComponent implements OnInit {
  game: Game | null = null;
  questions: Question[] = [];
  currentQuestionIndex: number = 0;
  userAnswers: string[] = [];
  showStart: boolean = true;

  constructor(private gameService: GameService) {}

  ngOnInit() {}

  startGame(): void {
    this.gameService.getRandomGame().subscribe({
      next: (game: Game) => {
        this.game = game;
        this.questions = game.questions;
        this.userAnswers = new Array(this.questions.length).fill(''); // initialize user answers
        this.currentQuestionIndex = 0;
        this.showStart = false;
      },
      error: (err) => {
        console.error('error fetching game:', err);
      }
    });
  }

  nextQuestion(): void {
    if (this.currentQuestionIndex < this.questions.length - 1) {
      this.currentQuestionIndex++;
    }
    else {
      // handle end of game
      alert('Game Over! Your answers have been submitted.');
    }
  }

  currentQuestion(): Question | null {
    return this.questions[this.currentQuestionIndex] || null;
  }
}
