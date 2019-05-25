import { Component, OnInit } from '@angular/core';
import { TodoService } from '../../services/Todo.service';

import { Todo} from '../../models/Todo'

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.css']
})
export class TodosComponent implements OnInit {
  todos: Todo[];

  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.todoService.getTodos().subscribe(result => {
      this.todos = result;
    });
  }

  deleteTodo(todo: Todo) {
    this.todos = this.todos.filter(t => t.id !== todo.id);
    this.todoService.deleteTodo(todo).subscribe(result => {console.log(result)});
  }

  addTodo(todo: Todo) {
    this.todoService.addTodo(todo).subscribe(result => {
      this.todos.push(result)
    });
  }
}
