import { Component, OnInit, Input } from '@angular/core';
import { Todo } from 'src/app/models/Todo';
import { TodoService } from '../../services/Todo.service';

@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent implements OnInit {
  @Input() todo: Todo;

  constructor(private todoService: TodoService) { }

  ngOnInit() {
  }

  setClasses() {
    let classes = {
      todo: true,
      'is-complete' : this.todo.completed
    }
    return classes;
  }

  onToggle(todo) {
    todo.completed = !todo.completed;
    this.todoService.toggleCompleted(todo).subscribe(result => console.log(result));
  }

  onDelete(todo) {
    console.log('delete');
  }
}
