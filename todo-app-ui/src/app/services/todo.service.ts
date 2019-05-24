import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

import {Todo} from '../models/Todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  todosUrl: string = 'http://localhost:8080/todo';

  constructor(private http:HttpClient) { }


getTodos(): Observable<Todo[]> {
  return this.http.get<Todo[]>(this.todosUrl);
}
}

