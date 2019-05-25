import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Todo} from '../models/Todo';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type' : 'application/json'
  })
}

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  todosUrl: string = 'http://localhost:8080/todo';

  constructor(private http:HttpClient) { }


getTodos(): Observable<Todo[]> {
  return this.http.get<Todo[]>(this.todosUrl);
}

toggleCompleted(todo: Todo): Observable<any> {
  const url = `${this.todosUrl}/${todo.id}`;
  return this.http.put(url, todo, httpOptions);
}
}
