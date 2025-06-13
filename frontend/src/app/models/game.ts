import { Question } from './question';

export class Game {
    id!: number;
    name!: string;
    category!: string;
    level!: string;
    questions!: Question[];
}
